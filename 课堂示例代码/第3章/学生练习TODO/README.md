# 第三章简单填空 / Chapter 3 Easy Practice

30 道简单填空题，共 51 个空。每题只补 1–3 处，大括号、数据和输出语句已给好。直接填写，不需要删除块注释。不用 Scanner。

30 easy tasks with 51 blanks. Fill only 1–3 places per task; braces, data, and output scaffolds are provided. Fill directly without removing block comments. No Scanner is used.

## 学生怎么做 / Student steps

1. 打开 `ClassScoreReportPractice.java`，从 Q01 开始，搜索 TODO，按每个 TODO 下方的代码填写编号标记。
   Open `ClassScoreReportPractice.java` and search for TODO and fill the numbered marker on the code line below it, starting at Q01.
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
javac -encoding UTF-8 ClassScoreReportPractice.java
java ClassScoreReportPractice
```

测试器只检查给定测试用例的运行结果，接受等价写法，不检查是否一定使用某个指定类型或运算符。教师可结合代码检查这些要求。部分题还有替换数据测试；不要直接输出预期答案。测试程序在临时目录编译，不改动学生源码。

The checker compares output on the supplied cases and accepts equivalent solutions. It does not enforce specific types or operators; the teacher should review those requirements. Some tasks include changed-data cases, so do not hard-code outputs. Compilation happens in temporary folders without changing student source.

## 课堂安排 / Lesson pacing

约 45–50 分钟：说明与示范 5 分钟，Q01–08 约 15 分钟，Q09–16 约 20 分钟，测试、纠错和解释 5–10 分钟。可以先完成前 12 题，剩余题作为加练。每完成 2–3 题运行一次测试。新增 Q17–30 为同等难度的巩固题，供课堂进度快的同学或下一节课继续做，不要求一节课完成全部 30 题。

Allow 45–50 minutes: 5 for setup, 15 for Q01–08, 20 for Q09–16, and 5–10 for testing and discussion. Start with 12 tasks if needed and use the rest for extra practice. Run the checker every 2–3 tasks. Q17–30 provide more practice at the same level for faster students or another lesson; all 30 tasks are not required in one class.

## 题目与检查点 / Tasks and checkpoints

### Q01 加减乘 / Arithmetic

计算 a+b、a-b、a*b。 / Calculate a+b, a-b and a*b.

默认输出 / Default output:

```text
11
5
24
```

### Q02 除法与余数 / Division and remainder

10 人每 3 人一组，求完整组数和剩余人数。 / Group 10 students in threes.

默认输出 / Default output:

```text
3
1
```

### Q03 自增自减 / Increment and decrement

人数先加 1 再减 1，每步打印。 / Add one, then subtract one; print each step.

默认输出 / Default output:

```text
6
5
```

### Q04 判断及格 / Pass or retry

60 分及格，打印 Pass 或 Retry。 / Print Pass for scores >=60, otherwise Retry.

默认输出 / Default output:

```text
Pass
```

### Q05 有效范围 / Valid range

0 到 100（含端点）为有效分数。 / A valid score is between 0 and 100 inclusive.

默认输出 / Default output:

```text
true
```

### Q06 三级评价 / Three grade bands

>=90 输出 A，>=60 输出 B，否则 C。 / Print A for >=90, B for >=60, otherwise C.

默认输出 / Default output:

```text
B
```

### Q07 switch 选择 / switch selection

1 对应 Mon，2 对应 Tue，其他值对应 Other。 / Map 1 to Mon, 2 to Tue, and other values to Other.

默认输出 / Default output:

```text
Tue
```

### Q08 for 打印 / Print with for

打印 1 到 n，每行一个数。 / Print 1 through n, one number per line.

默认输出 / Default output:

```text
1
2
3
```

### Q09 for 求和 / Sum with for

计算 1 到 n 的和。 / Sum 1 through n.

默认输出 / Default output:

```text
15
```

### Q10 while 倒数 / Countdown with while

从 3 打印到 1，循环内每次减 1。 / Print 3 down to 1, decreasing each time.

默认输出 / Default output:

```text
3
2
1
```

### Q11 do-while / Run at least once

从 1 开始，打印到 3。 / Start at 1 and print through 3.

默认输出 / Default output:

```text
1
2
3
```

### Q12 continue 跳过 / Skip with continue

打印 1 到 4，跳过 2。 / Print 1 through 4, skipping 2.

默认输出 / Default output:

```text
1
3
4
```

### Q13 break 停止 / Stop with break

遇到 3 时停止，3 不打印。 / Stop before printing 3.

默认输出 / Default output:

```text
1
2
```

### Q14 数组总分 / Array total

用增强 for 累加数组成绩。 / Sum the array with enhanced for.

默认输出 / Default output:

```text
210
```

### Q15 数组平均分 / Array average

先转为 double 再除法，打印两位小数。 / Cast to double before division; print two decimals.

默认输出 / Default output:

```text
65.50
```

### Q16 统计及格人数 / Count passes

用 for 遍历数组，统计 >=60 的数量。 / Count array scores >=60.

默认输出 / Default output:

```text
2
```

### Q17 逻辑或 / Logical OR

小于 0 或大于 100 都是无效分数。 / A score below 0 or above 100 is invalid.

默认输出 / Default output:

```text
true
```

### Q18 逻辑非 / Logical NOT

输出 ready 的相反值。 / Print the opposite of ready.

默认输出 / Default output:

```text
true
```

### Q19 是否相等 / Equality

判断两个整数是否相等。 / Check whether two integers are equal.

默认输出 / Default output:

```text
true
```

### Q20 比较大小 / Compare values

输出两个数中较大的一个，相等时输出任一个。 / Print the larger value; either is fine when equal.

默认输出 / Default output:

```text
8
```

### Q21 判断偶数 / Even numbers

能被 2 整除打印 Even，否则 Odd。 / Print Even when divisible by 2, otherwise Odd.

默认输出 / Default output:

```text
Even
```

### Q22 累加两次 / Add twice

sum 初始 0，先加 3，再加 4。 / Start sum at 0, add 3, then add 4.

默认输出 / Default output:

```text
7
```

### Q23 乘法累计 / Repeated multiplication

result 初始 1，依次乘 2 和 3。 / Start at 1, multiply by 2 and then 3.

默认输出 / Default output:

```text
6
```

### Q24 数组逐项输出 / Print array elements

增强 for 每次取一个元素，每行输出一次。 / Print each array element on its own line.

默认输出 / Default output:

```text
2
4
6
```

### Q25 输出偶数 / Print even values

从 2 开始每次加 2，输出到 6。 / Start at 2, add 2 each time, and print through 6.

默认输出 / Default output:

```text
2
4
6
```

### Q26 while 求和 / Sum with while

用 while 计算 1+2+3，更新 i 避免死循环。 / Sum 1+2+3 with while; update i each time.

默认输出 / Default output:

```text
6
```

### Q27 统计低分 / Count low scores

统计小于 60 的成绩数量。 / Count scores below 60.

默认输出 / Default output:

```text
2
```

### Q28 查找指定值 / Find a target

找到 target 后设 found 为 true 并停止。 / Set found to true and stop when target is found.

默认输出 / Default output:

```text
true
```

### Q29 跳过负数 / Skip negatives

遇到负数 continue，只累加非负数。 / Skip negatives with continue and sum nonnegative values.

默认输出 / Default output:

```text
5
```

### Q30 逆序输出 / Reverse output

从最后一个下标开始递减，输出所有元素。 / Start at the last index and decrease to print all elements.

默认输出 / Default output:

```text
30
20
10
```

## 提交 / Submission

提交填写后的 Java 文件和测试结果截图或文本，并选两题用一句话说明填空理由。测试器显示正确不是理解代码的替代品。

Submit the completed Java file and the checker output as an image or text. Explain two answers in one sentence each.

## 第三章范围 / Chapter 3 coverage

主线保留算术、关系与逻辑、if/else、多分支、switch、for、while、do-while、break、continue、增强 for，并复习第二章的数组与转换。取消原版中的嵌套图表、折半查找、位运算和复杂综合统计，以基础掌握为目标。

Practice arithmetic, comparisons and logic, if/else, multi-branch selection, switch, all three loop forms, break, continue and enhanced for, while reviewing arrays and conversions. Nested charts, binary search, bit operations and complex statistics have been removed to keep this version introductory.
