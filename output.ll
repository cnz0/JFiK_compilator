@print_fmt = constant [4 x i8] c"%d\0A\00"
@print_fmt_float = constant [4 x i8] c"%g\0A\00"
@read_fmt = constant [7 x i8] c"read: \00"
@read_fmt_int = constant [3 x i8] c"%d\00"
@read_fmt_float = constant [4 x i8] c"%lf\00"
@scanf_fmt = constant [3 x i8] c"%d\00"
@scanf_fmt_float = constant [4 x i8] c"%lf\00"
declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)

define i32 @main() {
entry:
  %tmp0 = alloca double
  store double 3.3, double* %tmp0
  %tmp1 = load double, double* %tmp0
  call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @print_fmt_float, i32 0, i32 0), double %tmp1)
  %tmp2 = alloca double
  store double 2.1, double* %tmp2
  %tmp3 = load double, double* %tmp2
  call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @print_fmt_float, i32 0, i32 0), double %tmp3)
  %tmp4 = alloca i32
  store i32 5, i32* %tmp4
  %tmp5 = load i32, i32* %tmp4
  call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @print_fmt, i32 0, i32 0), i32 %tmp5)
  %arr_x_1_2 = alloca double
  store double 3.14, double* %arr_x_1_2
  %tmp6 = alloca double
  store double 3.3, double* %tmp6
  %tmp7 = load double, double* %tmp6
  call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @print_fmt_float, i32 0, i32 0), double %tmp7)
  %tmp8 = alloca double
  store double 2.1, double* %tmp8
  %tmp9 = load double, double* %tmp8
  call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @print_fmt_float, i32 0, i32 0), double %tmp9)
  %tmp10 = alloca double
  store double 3.14, double* %tmp10
  %tmp11 = load double, double* %tmp10
  call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @print_fmt_float, i32 0, i32 0), double %tmp11)
  ret i32 0
}
