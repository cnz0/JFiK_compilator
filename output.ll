@print_fmt = constant [4 x i8] c"%d\0A\00"
@print_fmt_float = constant [4 x i8] c"%g\0A\00"
@read_fmt = constant [7 x i8] c"read: \00"
@read_fmt_int = constant [3 x i8] c"%d\00"
@read_fmt_float = constant [4 x i8] c"%lf\00"
@scanf_fmt = constant [3 x i8] c"%d\00"
@scanf_fmt_float = constant [4 x i8] c"%lf\00"
declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@scanf_fmt_str = constant [3 x i8] c"%s\00"
@true_str = constant [6 x i8] c"true\0A\00"
@false_str = constant [7 x i8] c"false\0A\00"
define i32 @main() {
entry:
  %tmp0 = alloca i32
  store i32 10000, i32* %tmp0
  %tmp1 = load i32, i32* %tmp0
  call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @print_fmt, i32 0, i32 0), i32 %tmp1)
  %tmp = alloca i32
  store i32 0, i32* %tmp
  %tmp2 = alloca i32
  store i32 1234, i32* %tmp2
  %tmp3 = load i32, i32* %tmp2
  call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @print_fmt, i32 0, i32 0), i32 %tmp3)
  ret i32 0
}
