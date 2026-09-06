# Java 前两章基础填空 / Java Basics: Chapters 1–2

30 道简单填空题，共 46 个空。每题只补 1–3 处，大括号、数据和输出语句已给好。直接填写，不需要删除块注释。不用 Scanner。

30 easy tasks with 46 blanks. Fill only 1–3 places per task; braces, data, and output scaffolds are provided. Fill directly without removing block comments. No Scanner is used.

## 学生怎么做 / Student steps

1. 打开 `JavaBasicsPractice.java`，从 Q01 开始，搜索 TODO，按每个 TODO 下方的代码填写编号标记。
   Open `JavaBasicsPractice.java` and search for TODO and fill the numbered marker on the code line below it, starting at Q01.
2. 每做完一题，运行教师给的 `PracticeChecker`，不必等其他题完成。
   Run the teacher-provided `PracticeChecker` after each task, even with other tasks unfinished.
3. 根据结果修改：PASS 正确、NOT FINISHED 还有空、COMPILE ERROR 语法错误、WRONG OUTPUT 结果错误、RUNTIME ERROR 运行异常、TIMEOUT 超时。
   Read the per-task status and fix the indicated task.
4. 保留 `// BEGIN Qxx` 与 `// END Qxx` 两行定位标记，以及给定数据和输出格式，只改空白。无需理解或修改测试程序。
   Keep BEGIN/END markers, fixed data, and output format. Edit only the blanks; you do not need to study or modify the checker.

## TXT 测试结果 / TXT report

每次运行测试器，会在本练习目录自动生成 `测试结果.txt`，使用 UTF-8 编码。内容包括测试时间、练习文件路径、每道题的判分或错误信息，以及正确、未完成、错误数量的汇总。屏幕仍会显示相同结果。

Each checker run creates `测试结果.txt` in the exercise folder using UTF-8. It records the test time, source path, per-task results or errors, and the totals for passed, unfinished, and failed tasks. Results also appear on screen.

再次测试会覆盖上一次结果；需要保留时先另存或重命名。提交时可以直接附上此 TXT 文件。

Each run replaces the previous report. Save a copy or rename it to keep earlier results. You can submit this TXT file with your source.

## 如何运行测试 / Run the checker

需要 JDK 8 或更高版本。终端先进入本目录，**只编译测试程序**：
Use JDK 8 or later. Enter this folder in a terminal and **compile only the checker**:

```text
javac -encoding UTF-8 PracticeChecker.java
java PracticeChecker
```

**不要使用 `javac *.java`**：练习文件有未填标记时不能整体编译，测试器会读源码、独立编译每道已填写的题，所以一道错题不会阻止其他题判分。

**Do not use `javac *.java`**. The unfinished practice file cannot compile as a whole. The checker reads its source and compiles completed tasks separately, so one broken task does not block the others.

IDEA 用户可在本目录打开终端执行上述命令。如果直接运行测试类，请把 Working directory 设为本练习目录，且不要先构建含未完成练习的整个项目。

In IntelliJ IDEA, use the terminal in this folder. If running the checker class directly, set the working directory to this folder and avoid building the entire unfinished project first.

也可传入练习目录路径： / You can also pass the exercise folder path:

```text
java PracticeChecker "本练习目录的完整路径"
```

填写完全部题目后，可单独编译并运行整份练习：
After completing every task, compile and run the full practice file:

```text
javac -encoding UTF-8 JavaBasicsPractice.java
java JavaBasicsPractice
```

测试器只检查给定测试用例的运行结果，接受等价写法，不检查是否一定使用某个指定类型或运算符。教师可结合代码检查这些要求。部分题还有替换数据测试；不要直接输出预期答案。测试程序在临时目录编译，不改动学生源码。

The checker compares output on the supplied cases and accepts equivalent solutions. It does not enforce specific types or operators; the teacher should review those requirements. Some tasks include changed-data cases, so do not hard-code outputs. Compilation happens in temporary folders without changing student source.

## 课堂安排 / Lesson pacing

约 45–50 分钟：说明与示范 5 分钟，Q01–08 约 15 分钟，Q09–16 约 20 分钟，测试、纠错和解释 5–10 分钟。可以先完成前 12 题，剩余题作为加练。每完成 2–3 题运行一次测试。新增 Q17–30 为同等难度的巩固题，供课堂进度快的同学或下一节课继续做，不要求一节课完成全部 30 题。

Allow 45–50 minutes: 5 for setup, 15 for Q01–08, 20 for Q09–16, and 5–10 for testing and discussion. Start with 12 tasks if needed and use the rest for extra practice. Run the checker every 2–3 tasks. Q17–30 provide more practice at the same level for faster students or another lesson; all 30 tasks are not required in one class.

## 题目与检查点 / Tasks and checkpoints

### Q01 第一行输出 / First output

输出 Hello, Java! / Print Hello, Java!

默认输出 / Default output:

```text
Hello, Java!
```

### Q02 print 与 println / Output lines

第一行输出 Java Class，第二行输出 Ready。 / Print Java Class on the first line and Ready on the second.

默认输出 / Default output:

```text
Java Class
Ready
```

### Q03 编译与运行 / Compile and run

Hello.java 的编译命令使用 javac，运行命令使用 java。 / Compile Hello.java with javac and run it with java.

默认输出 / Default output:

```text
javac Hello.java
java Hello
```

### Q04 整数变量 / Integer variables

为年龄选择 int 类型，再输出变量。 / Use int for age and print the variable.

默认输出 / Default output:

```text
18
```

### Q05 byte 与 short / Small integer types

level 用 byte，students 用 short。 / Use byte for level and short for students.

默认输出 / Default output:

```text
3
200
```

### Q06 long 常量 / A long literal

人口为 3000000000，常量末尾加 L。 / Use 3000000000 with an L suffix.

默认输出 / Default output:

```text
3000000000
```

### Q07 float 与 double / Floating-point types

price 为 float 12.5F，height 为 double 1.75。 / Use float 12.5F and double 1.75.

默认输出 / Default output:

```text
12.5
1.75
```

### Q08 字符与布尔值 / char and boolean

字符为 A（单引号），ready 为 true。 / Use character A in single quotes and boolean true.

默认输出 / Default output:

```text
A
true
```

### Q09 字符串拼接 / String concatenation

用 + 连接标签与变量。 / Join the label and variable with +.

默认输出 / Default output:

```text
Name: Li
```

### Q10 自动转换 / Widening conversion

把 int 变量赋给 double 变量。 / Assign the int variable to a double variable.

默认输出 / Default output:

```text
80.0
```

### Q11 强制转换 / Explicit cast

把 8.9 转成 int，丢弃小数部分。 / Cast 8.9 to int, discarding the fraction.

默认输出 / Default output:

```text
8
```

### Q12 字符编码 / Character code

将字符 A 转为 int 编码。 / Cast character A to its int code.

默认输出 / Default output:

```text
65
```

### Q13 数组下标 / Array indexes

输出第一个和第三个元素，下标从 0 开始。 / Print the first and third elements; indexes start at 0.

默认输出 / Default output:

```text
60
80
```

### Q14 数组空间与长度 / Allocate an array

用 new 创建长度 3 的数组，输出长度和初始第一个值。 / Allocate 3 elements and print length and the first default value.

默认输出 / Default output:

```text
3
0
```

### Q15 修改数组 / Change an element

把第二个元素改为 90，再输出。 / Change the second element to 90 and print it.

默认输出 / Default output:

```text
90
```

### Q16 二维数组 / A 2D array

输出第二行第一个元素，再输出行数。 / Print the first element of the second row and the row count.

默认输出 / Default output:

```text
80
2
```

### Q17 小数格式 / Decimal formatting

printf 保留两位小数，用 %n 换行。 / Print two decimal places with printf and a newline.

默认输出 / Default output:

```text
12.50
```

### Q18 整数格式 / Integer formatting

使用 %d 输出整数并换行。 / Use %d to print an integer and a newline.

默认输出 / Default output:

```text
18
```

### Q19 换行字符 / Newline escape

一个字符串中放换行符，分别输出 A 和 B。 / Put a newline escape in one string to print A and B on separate lines.

默认输出 / Default output:

```text
A
B
```

### Q20 数组最后一项 / Last array element

最后一个下标是长度减 1。 / The last index is the length minus one.

默认输出 / Default output:

```text
30
```

### Q21 字符数组 / A char array

定义字符数组并输出第二个字符。 / Define a char array and print the second character.

默认输出 / Default output:

```text
B
```

### Q22 double 数组 / A double array

数组元素类型是 double，输出第一项。 / Use double elements and print the first item.

默认输出 / Default output:

```text
2.5
```

### Q23 布尔数组默认值 / Default boolean value

新建长度 2 的 boolean 数组，输出第一项默认值。 / Allocate two booleans and print the first default value.

默认输出 / Default output:

```text
false
```

### Q24 数组先声明再分配 / Declare then allocate

先声明，再用 new 分配 2 个元素。 / Declare the array first, then allocate two elements.

默认输出 / Default output:

```text
2
9
```

### Q25 数组别名 / Array alias

alias 与 original 指向同一数组，观察修改结果。 / Make alias refer to original and observe the change.

默认输出 / Default output:

```text
9
```

### Q26 两个独立数组 / Separate arrays

b 用 new 创建独立数组，改 b 不改变 a。 / Allocate b separately so changing b does not change a.

默认输出 / Default output:

```text
1
9
```

### Q27 二维数组行长度 / Row lengths

输出二维数组行数以及第一行长度。 / Print the row count and the length of the first row.

默认输出 / Default output:

```text
2
3
```

### Q28 修改二维数组 / Update a 2D array

把第二行第二列改为 99。 / Set the second row, second column to 99.

默认输出 / Default output:

```text
99
```

### Q29 赋值给另一个变量 / Assign a variable

将 first 的值赋给 second，再输出。 / Assign first to second and print second.

默认输出 / Default output:

```text
12
```

### Q30 班级信息卡 / Class information card

把给定变量放入输出语句，不要直接填写输出值。 / Print the supplied variables rather than literal answers.

默认输出 / Default output:

```text
Java
203
B
```

## 提交 / Submission

提交填写后的 Java 文件和测试结果截图或文本，并选两题用一句话说明填空理由。测试器显示正确不是理解代码的替代品。

Submit the completed Java file and the checker output as an image or text. Explain two answers in one sentence each.

## 前两章范围 / Chapters 1–2 coverage

第 1 章：程序结构由 class/main 框架展示，Q01–03 练习输出、编译与运行。第 2 章：变量和标识符、八种基本类型、常量、转换、字符编码、一维数组、二维数组。不要求 if、switch 或循环。折半查找不放入这份入门版。

Chapter 1: class/main scaffolds show program structure; Q01–03 cover output, compilation, and execution. Chapter 2: variables and identifiers, all eight primitive types, literals, conversions, character codes, 1D and 2D arrays. No if, switch, loops, or binary search are required.

口头检查：public class 名为什么与文件名相同？main 是什么入口？javac 生成什么文件，JVM 执行什么？注释是否执行？这些解释不由测试器判分。

Oral checks: Why must the public class name match the filename? What is main's role? What does javac produce and what does the JVM execute? Are comments executed? These explanations are not automatically scored.
