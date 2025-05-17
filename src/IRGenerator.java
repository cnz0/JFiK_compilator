package src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import src.Value;
import src.Type;

public class IRGenerator {
    private StringBuilder builder = new StringBuilder();
    public int tmpCounter = 0;

    private final Set<String> declaredVariables = new HashSet<>();

    public String newTmp() {
        return "tmp" + (tmpCounter++);
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
        
        builder.append("define i32 @main() {\n");
        builder.append("entry:\n");
    }

    public void declareVariable(String name, Type type) {
        if (declaredVariables.contains(name)) return; // Już zadeklarowane
        declaredVariables.add(name);
    
        if (type == Type.INT) {
            builder.append("  %").append(name).append(" = alloca i32\n");
        } else if (type == Type.FLOAT) {
            builder.append("  %").append(name).append(" = alloca double\n");
        }
    }

    public void assignValue(String name, Value value) {
        Object raw = value.value();
    
        if (value.type() == Type.INT) {
            if (raw instanceof String tmpVarName) {
                builder.append("  %").append(name)
                       .append(" = load i32, i32* %").append(tmpVarName).append("\n");
            } else if (raw instanceof Number num) {
                builder.append("  store i32 ").append(num.intValue()).append(", i32* %").append(name).append("\n");
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
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(builder.toString());
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
    
}