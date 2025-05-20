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
  %tmp1 = alloca i1
  store i1 1, i1* %tmp1
  %tmp2 = load i1, i1* %tmp1
  %tmp1_bool = icmp ne i1 %tmp2, 0
  br i1 %tmp1_bool, label %if_if_tmp0, label %if_else_tmp0
if_if_tmp0:
  br label %if_end_tmp0
if_else_tmp0:
  br label %if_end_tmp0
if_end_tmp0:
  %x = alloca i32
  store i32 0, i32* %x
  %tmp3 = alloca i32
  store i32 0, i32* %tmp3
  %tmp4 = load i32, i32* %tmp3
  call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @print_fmt, i32 0, i32 0), i32 %tmp4)
  ret i32 0
}
