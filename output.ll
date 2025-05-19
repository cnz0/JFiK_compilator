@.str9 = constant [6 x i8] c"inne\0A\00"
@.str7 = constant [7 x i8] c"jeden\0A\00"
@.str3 = constant [6 x i8] c"zero\0A\00"
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
  %x = alloca i32
  store i32 12, i32* %x
  %tmp1 = alloca i1
  store i1 0, i1* %tmp1
  %tmp2 = load i1, i1* %tmp1
  %tmp1_bool = icmp ne i1 %tmp2, 0
  br i1 %tmp1_bool, label %if_if_0, label %elif_0_0
if_if_0:
  %tmp4 = getelementptr inbounds [6 x i8], [6 x i8]* @.str3, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %tmp4)
  br label %if_end_0
elif_0_0:
  %tmp5 = alloca i1
  store i1 0, i1* %tmp5
  %tmp6 = load i1, i1* %tmp5
  %tmp5_bool = icmp ne i1 %tmp6, 0
  br i1 %tmp5_bool, label %elif_true_0_0, label %if_else_0
elif_true_0_0:
  %tmp8 = getelementptr inbounds [7 x i8], [7 x i8]* @.str7, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %tmp8)
  br label %if_end_0
if_else_0:
  %tmp10 = getelementptr inbounds [6 x i8], [6 x i8]* @.str9, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %tmp10)
  br label %if_end_0
if_end_0:
  ret i32 0
}
