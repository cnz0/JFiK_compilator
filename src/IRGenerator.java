package src;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import src.Value;
import src.Type;

public class IRGenerator {
    private StringBuilder builder = new StringBuilder();
    private int tmpCounter = 0;
    private final Map<String, String> loadedAliases = new HashMap<>();

    private final Set<String> declaredVariables = new HashSet<>();

    public String newTmp() {
        String tmpName = "tmp" + tmpCounter++;
        return tmpName;
    }

    public IRGenerator() {
        builder.append("@print_fmt = constant [4 x i8] c\"%d\\0A\\00\"\n");
        builder.append("@print_fmt_float = constant [4 x i8] c\"%g\\0A\\00\"\n");
        builder.append("@read_fmt = constant [7 x i8] c\"read: \\00\"\n");
        builder.append("@read_fmt_int = constant [3 x i8] c\"%d\\00\"\n");
        builder.append("@read_fmt_float = constant [4 x i8] c\"%lf\\00\"\n");
        builder.append("@scanf_fmt = constant [3 x i8] c\"%d\\00\"\n");
        builder.append("@scanf_fmt_float = constant [4 x i8] c\"%lf\\00\"\n");
        
        builder.append("declare i32 @printf(i8*, ...)\n");
        builder.append("declare i32 @scanf(i8*, ...)\n\n");

        builder.append("@scanf_fmt_str = constant [3 x i8] c\"%s\\00\"\n");

        builder.append("@true_str = constant [6 x i8] c\"true\\0A\\00\"\n");
        builder.append("@false_str = constant [7 x i8] c\"false\\0A\\00\"\n");
        
        builder.append("define i32 @main() {\n");
        builder.append("entry:\n");
    }

    public void declareVariable(String name, Type type) {
        if (declaredVariables.contains(name)) return; // Już zadeklarowane
        declaredVariables.add(name);
    
        switch (type) {
            case INT -> builder.append("  %").append(name).append(" = alloca i32\n");
            case FLOAT -> builder.append("  %").append(name).append(" = alloca double\n");
            case BOOLEAN -> builder.append("  %").append(name).append(" = alloca i1\n");
            default -> System.out.println("Nieznany typ w declareVariable: " + type);
        }
    }

    public void assignValue(String name, Value value) {
        Object raw = value.value();

        if (value.type() == Type.INT) {
            if (raw instanceof String tmpVarName) {
                String tmp = newTmp();
                builder.append("  %").append(tmp)
                    .append(" = load i32, i32* %").append(tmpVarName).append("\n");
                builder.append("  store i32 %").append(tmp).append(", i32* %").append(name).append("\n");
            } else if (raw instanceof Number num) {
                builder.append("  store i32 ").append(num.intValue()).append(", i32* %").append(name).append("\n\n");
            } else {
                System.out.println("[INT] Invalid value type: " + raw);
            }

        } else if (value.type() == Type.FLOAT) {
            if (raw instanceof String tmpVarName) {
                builder.append("  %").append(name)
                    .append(" = load double, double* %").append(tmpVarName).append("\n");
            } else if (raw instanceof Number num) {
                builder.append("  store double ").append(num.doubleValue()).append(", double* %").append(name).append("\n");
            } else {
                System.out.println("[FLOAT] Invalid value type: " + raw);
            }

        } else if (value.type() == Type.BOOLEAN) {
            if (raw instanceof String tmpVarName) {
                builder.append("  %").append(name)
                    .append(" = load i1, i1* %").append(tmpVarName).append("\n");
            } else if (raw instanceof Boolean b) {
                builder.append("  store i1 ").append(b ? 1 : 0).append(", i1* %").append(name).append("\n");
            } else {
                System.out.println("[BOOLEAN] Invalid value type: " + raw);
            }

        } else {
            System.out.println("[OTHER] Ignored assignValue for: " + value.type());
        }
    }


    public void printInt(String name) {
        String tmp = newTmp();
        builder.append("  %").append(tmp).append(" = load i32, i32* %").append(name).append("\n");
        builder.append("  call i32 (i8*, ...) @printf(i8* getelementptr ")
               .append("([4 x i8], [4 x i8]* @print_fmt, i32 0, i32 0), i32 %").append(tmp).append(")\n");
    }
    
    public void printFloat(String name) {
        String tmp = newTmp();
        builder.append("  %").append(tmp).append(" = load double, double* %").append(name).append("\n");
        builder.append("  call i32 (i8*, ...) @printf(i8* getelementptr ")
               .append("([4 x i8], [4 x i8]* @print_fmt_float, i32 0, i32 0), double %").append(tmp).append(")\n");
    }
    
    public void finish() {
        builder.append("  ret i32 0\n}\n");
    }

    public void writeToFile(String filename) {
        String clean = builder.toString()
            .replaceAll("[\u0000-\u001F&&[^\r\n\t]]", "") // usuwamy kontrolne znaki
            .replaceAll("\r\n", "\n"); // standaryzujemy na Unix EOL

        try (BufferedWriter fw = new BufferedWriter(new FileWriter(filename))) {
            String[] lines = clean.split("\n");
            for (String line : lines) {
                if (!line.trim().isEmpty()) {
                    fw.write(line + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String declareTemp(Value value) {
        String tmp = newTmp();
        if (value.type() == Type.INT) {
            builder.append("  %").append(tmp).append(" = alloca i32\n");
        } else if (value.type() == Type.FLOAT) {
            builder.append("  %").append(tmp).append(" = alloca double\n");
        }
        return tmp;
    }

    public void readInto(String name, Type type) {
        if (type == Type.INT) {
            builder.append("  call i32 (i8*, ...) @printf(i8* getelementptr ")
                   .append("([7 x i8], [7 x i8]* @read_fmt, i32 0, i32 0))\n");  // <-- to wypisze "read: "
            builder.append("  call i32 (i8*, ...) @scanf(i8* getelementptr ")
                   .append("([3 x i8], [3 x i8]* @scanf_fmt, i32 0, i32 0), i32* %")
                   .append(name).append(")\n");
        } else {
            builder.append("  call i32 (i8*, ...) @printf(i8* getelementptr ")
                   .append("([7 x i8], [7 x i8]* @read_fmt, i32 0, i32 0))\n");  // <-- też tu
            builder.append("  call i32 (i8*, ...) @scanf(i8* getelementptr ")
                   .append("([4 x i8], [4 x i8]* @scanf_fmt_float, i32 0, i32 0), double* %")
                   .append(name).append(")\n");
        }
    }

    public void readValue(String name, Type type) {
        if (type == Type.INT) {
            builder.append("  call i32 (i8*, ...) @printf(i8* getelementptr ")
                   .append("([7 x i8], [7 x i8]* @read_fmt, i32 0, i32 0))\n");
            builder.append("  call i32 (i8*, ...) @scanf(i8* getelementptr ")
                   .append("([3 x i8], [3 x i8]* @scanf_fmt, i32 0, i32 0), i32* %").append(name).append(")\n");
        } else {
            builder.append("  call i32 (i8*, ...) @printf(i8* getelementptr ")
                   .append("([7 x i8], [7 x i8]* @read_fmt, i32 0, i32 0))\n");
            builder.append("  call i32 (i8*, ...) @scanf(i8* getelementptr ")
                   .append("([4 x i8], [4 x i8]* @scanf_fmt_float, i32 0, i32 0), double* %").append(name).append(")\n");
        }
    }

    public void printBoolean(boolean value) {
        String label = value ? "true_str" : "false_str";
        int length = value ? 6 : 7;
    
        builder.append("  call i32 (i8*, ...) @printf(i8* getelementptr ")
               .append("([").append(length).append(" x i8], [")
               .append(length).append(" x i8]* @").append(label).append(", i32 0, i32 0))\n");
    }

    public void declareString(String name, String initial) {
        String escaped = initial.replace("\\", "\\5C").replace("\"", "\\22");
        builder.append("  %").append(name).append(" = alloca [").append(escaped.length() + 1).append(" x i8]\n");
        // nie inicjalizujemy, bo read nadpisze
    }
    
    public void printRawString(String value) {
        String label = ".str" + newTmp();
        int len = value.length() + 2; // \n + \0
    
        String escaped = value.replace("\\", "\\5C").replace("\"", "\\22");
        builder.insert(0, "@" + label + " = constant [" + len + " x i8] c\"" + escaped + "\\0A\\00\"\n");
    
        String tmp = newTmp();
        builder.append("  %").append(tmp).append(" = getelementptr inbounds [")
               .append(len).append(" x i8], [").append(len).append(" x i8]* @")
               .append(label).append(", i32 0, i32 0\n"); // 🛠️ bez nawiasu na końcu!
    
        builder.append("  call i32 (i8*, ...) @printf(i8* %").append(tmp).append(")\n");
    }
    
    
    public void readString(String name) {
        // Bufor 100 znaków – wystarczająco?
        builder.append("  call i32 (i8*, ...) @scanf(i8* getelementptr ")
               .append("([3 x i8], [3 x i8]* @scanf_fmt, i32 0, i32 0), [100 x i8]* %")
               .append(name).append(")\n");
    }

    public void ifStart(String condVar, String labelTrue, String labelFalse, Type type) {
        String loaded = newTmp();
        switch (type) {
            case INT -> {
                builder.append("  %").append(loaded)
                       .append(" = load i32, i32* %").append(condVar).append("\n");
                builder.append("  %").append(condVar).append("_bool = icmp ne i32 %").append(loaded).append(", 0\n");
            }
            case FLOAT -> {
                builder.append("  %").append(loaded)
                       .append(" = load double, double* %").append(condVar).append("\n");
                builder.append("  %").append(condVar).append("_bool = fcmp one double %").append(loaded).append(", 0.0\n");
            }
            case BOOLEAN -> {
                builder.append("  %").append(loaded)
                       .append(" = load i1, i1* %").append(condVar).append("\n");
                builder.append("  %").append(condVar).append("_bool = icmp ne i1 %").append(loaded).append(", 0\n");
            }
            default -> {
                System.err.println("[ifStart] Unsupported type for condition: " + type);
                return;
            }
        }
    
        builder.append("  br i1 %").append(condVar).append("_bool, label %")
               .append(labelTrue).append(", label %").append(labelFalse).append("\n");
    }
    
    public void label(String name) {
        builder.append(name).append(":\n");
    }
    
    public void branch(String target) {
        builder.append("  br label %").append(target).append("\n");
    }

    public void compareForLoop(String varName, Value startVal, Value endVal, String condName) {
        String loaded = newTmp();
        builder.append("  %").append(loaded)
            .append(" = load i32, i32* %").append(varName).append("\n");

        int start = ((Number) startVal.value()).intValue();
        int end = ((Number) endVal.value()).intValue();

        boolean ascending = start <= end;

        String cmpTmp = newTmp();
        if (ascending) {
            builder.append("  %").append(cmpTmp)
                .append(" = icmp sle i32 %").append(loaded).append(", ").append(end).append("\n");
        } else {
            builder.append("  %").append(cmpTmp)
                .append(" = icmp sge i32 %").append(loaded).append(", ").append(end).append("\n");
        }

        builder.append("  store i1 %").append(cmpTmp)
            .append(", i1* %").append(condName).append("\n");
    }


    public void incrementLoopVar(String varName, Value startVal, Value endVal) {
        String loaded = newTmp();
        builder.append("  %").append(loaded).append(" = load i32, i32* %").append(varName).append("\n");

        int start = ((Number) startVal.value()).intValue();
        int end = ((Number) endVal.value()).intValue();

        String next = newTmp();
        if (start <= end) {
            builder.append("  %").append(next).append(" = add i32 %").append(loaded).append(", 1\n");
        } else {
            builder.append("  %").append(next).append(" = sub i32 %").append(loaded).append(", 1\n");
        }

        builder.append("  store i32 %").append(next).append(", i32* %").append(varName).append("\n");
    }

    public void compareEqual(String resultPtr, Value left, Value right) {
        String lval = loadValue(left);
        String rval = loadValue(right);

        String cmpTmp = newTmp(); // zamiast tmp
        builder.append("  %").append(cmpTmp)
            .append(" = icmp eq i32 %").append(lval)
            .append(", %").append(rval).append("\n");

        builder.append("  store i1 %").append(cmpTmp)
            .append(", i1* %").append(resultPtr).append("\n");
    }

    public String loadValue(Value v) {
        if (v.value() instanceof String alias) {
            String tmp = newTmp();  // ZAWSZE nowy tmp
            switch (v.type()) {
                case INT -> builder.append("  %").append(tmp).append(" = load i32, i32* %").append(alias).append("\n");
                case FLOAT -> builder.append("  %").append(tmp).append(" = load double, double* %").append(alias).append("\n");
                case BOOLEAN -> builder.append("  %").append(tmp).append(" = load i1, i1* %").append(alias).append("\n");
            }
            return tmp;
        }
        return v.value().toString();
    }
  
}