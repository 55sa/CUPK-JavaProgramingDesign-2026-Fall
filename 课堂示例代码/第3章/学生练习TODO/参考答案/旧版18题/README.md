# 班级成绩分析工作坊：填空式 Start Code
# Class Score Report Workshop: Fill-in-the-Blank Start Code

## 要做什么 / Your task

完成一个 Java 文件中的 18 道小题，共 79 个空。每题已提供变量、程序结构、循环或分支以及输出语句，你只需补上带编号的空白。围绕成绩报告练习第二章的数据类型与数组、第三章的运算符与控制语句。

Complete 18 tasks with 79 blanks in one Java file. Variables, control-flow scaffolds, and output statements are provided. Fill the numbered blanks to practice Chapter 2 types and arrays and Chapter 3 operators and control statements through a score-report workshop.

使用固定数组，不用 Scanner，也不需要键盘输入。每题有独立的 `{ }` 作用域，彼此不依赖，共享 main 开头的 scores。练习不要求学生自己设计方法或类。

Use a fixed array, with no Scanner or keyboard input. Each task has its own `{ }` scope and works independently, sharing scores at the top of main. You do not need to design methods or classes.

## 怎样填空和运行 / How to fill and run

1. 打开 `ClassScoreReportPractice.java`，从 Q01 开始阅读框架和中英文提示。
   Open `ClassScoreReportPractice.java` and read the scaffold and bilingual hints from Q01.
2. 直接把 `__Q01_01__` 这类标记替换为代码，不保留外侧下划线。
   Replace markers such as `__Q01_01__` directly with code, removing the marker completely.
3. 填完所有空白后编译运行，对照每题检查点核对结果。
   Compile and run after completing all blanks, then compare the output with each checkpoint.
4. 若想逐题运行，可将当前题的 `{ }` 代码块和 main 开头的 scores 数组复制到一个临时 Java 程序的 main 中，填完该题后运行。
   To run one task at a time, copy its brace-delimited block and the scores array into a temporary Java program's main method, complete that task, and run it.

填空操作示例（不是本题答案）：
Example of replacing a blank (not a task answer):

```java
// Before / 替换前
int minutes = __EXAMPLE__;
// After / 替换后
int minutes = 45;
```

每个空可能是类型、常量、运算符、表达式或关键字。空外已写好的括号、方括号和分号不要重复添加。文件仍有未填标记时不能整体编译运行。

A blank may be a type, literal, operator, expression, or keyword. Do not duplicate brackets or semicolons already outside the blank. The full file cannot compile while unfilled markers remain.

命令行运行（先进入本目录，需已配置 JDK）：
Command-line option (enter this directory with a configured JDK):

```text
javac -encoding UTF-8 ClassScoreReportPractice.java
java ClassScoreReportPractice
```

## 一节课安排 / Lesson pacing

50 分钟建议：阅读框架和操作说明 4 分钟；Q01–04 用 8 分钟；Q05–09 用 17 分钟；Q10–12 用 13 分钟；测试和解释 8 分钟。Q01–12 是主线，Q13–18 是额外练习，每题约 3–6 分钟。45 分钟课可把部分测试留到课后。教师可按班级进度调整。

Suggested 50-minute lesson: 4 minutes for setup, 8 for Q01–04, 17 for Q05–09, 13 for Q10–12, and 8 for tests and explanations. Q01–12 are the core; Q13–18 are extras, taking about 3–6 minutes each. In a 45-minute lesson, move some tests after class. Adjust to the class's pace.

## 数据规则 / Data rules

```java
int[] scores = {95, 82, -1, 67, 100, 59, 76, 88, 105, 60};
```

有效成绩为 0–100（含端点），及格为 >=60。统计时忽略 -1 和 105；倒序显示保留它们。数组下标从 0 开始。等级 A:90–100、B:80–89、C:70–79、D:60–69、F:0–59。

Valid scores are 0–100 inclusive, and passing means >=60. Exclude -1 and 105 from statistics, but retain them in reverse output. Array indexes start at 0. Grades are A:90–100, B:80–89, C:70–79, D:60–69, F:0–59.

## 每题任务和检查点 / Tasks and checkpoints

下面给出输出值用于核对，不能把这些结果直接写成输出常量。代码必须从数据计算结果。

Use these values to check your work. Do not hard-code the results; compute them from the data.

### Q01 基础类型与报告信息 / Primitive types

按给定值补齐类型或常量后缀；班级 A，容量 40，科目 3。 / Fill types or literal suffixes; class A, capacity 40, 3 subjects.

空数 / Blanks: 6

检查 / Check:

```text
3 40 20260906001 75.5 A false
```

### Q02 字符与类型转换 / Characters and casting

将 A 转为整数编码，将 78.375 截断为 int。 / Convert A to its numeric code and truncate 78.375 to int.

空数 / Blanks: 3

检查 / Check:

```text
Code=65 Whole=78 Next=B
```

### Q03 算术与分组 / Arithmetic and grouping

8 人每 3 人一组，计算完整组数、余数，以及 (8+2)*3。 / Group 8 students in threes and evaluate (8+2)*3.

空数 / Blanks: 3

检查 / Check:

```text
Groups=2 Remaining=2 Seats=30
```

### Q04 数组与倒序 / Arrays and reverse traversal

从最后一个下标向前遍历原始 scores，包含无效值。 / Traverse the original scores backwards, including invalid values.

空数 / Blanks: 5

检查 / Check:

```text
Length=10
Reverse: 60 105 88 76 59 100 67 -1 82 95
```

### Q05 过滤与 continue / Filtering with continue

有效范围 0–100，统计有效和无效数量以及有效总分。 / Count valid and invalid scores and sum only valid values.

空数 / Blanks: 5

检查 / Check:

```text
Valid=8 Invalid=2 Total=627
```

### Q06 平均值与短路 / Averages and short-circuiting

前置统计已给出，补浮点除法和短路判断，目标平均分 75.5。 / Statistics are provided; complete division and a safe comparison with 75.5.

空数 / Blanks: 3

检查 / Check:

```text
Integer=78 Average=78.38
TargetMet=true
```

### Q07 及格率与极值 / Pass rate and extrema

只处理有效成绩，>=60 及格，零记录不输出极值。 / Process valid scores only; >=60 passes; hide extrema for zero records.

空数 / Blanks: 5

检查 / Check:

```text
Pass=7 Min=59 Max=100 Rate=87.50%
```

### Q08 多分支等级 / Grade branches

A>=90，B>=80，C>=70，D>=60，其余 F；补全条件。 / Complete the descending grade thresholds.

空数 / Blanks: 5

检查 / Check:

```text
Grades: A B D A F C B D
```

### Q09 switch 评语 / switch comments

固定等级测试所有分支，? 应进入 default。 / Test every branch with fixed grades; ? uses default.

空数 / Blanks: 4

检查 / Check:

```text
A:Excellent
B:Good
C:Fair
D:Pass
F:Retry
?:Unknown
```

### Q10 while 查找满分 / Find a perfect score

保存首个 100 的下标，未找到保留 -1。 / Save the first index of 100, or keep -1.

空数 / Blanks: 5

检查 / Check:

```text
PerfectIndex=4
```

### Q11 do-while 补测 / Retry simulation

52 分起，每次加 3，至少执行一次，达到 60 停止。 / Start at 52, add 3 per attempt, and stop at 60 or above.

空数 / Blanks: 4

检查 / Check:

```text
Score=61 Attempts=3 Retry=false
```

### Q12 等级分布图 / Grade histogram

计数数组下标 0..4 对应 A/B/C/D/F，嵌套循环打印星号。 / Counters 0..4 represent A/B/C/D/F; print stars using nested loops.

空数 / Blanks: 5

检查 / Check:

```text
A:**
B:**
C:*
D:**
F:*
```

### Q13 进阶：学习积分 / Extra: study points

for 累加 1 到 10，while 计算 5!，累积乘积用 long。 / Sum 1 through 10 with for and compute 5! with while.

空数 / Blanks: 5

检查 / Check:

```text
Sum=55 Factorial=120
```

### Q14 进阶：二维成绩 / Extra: 2D scores

每行一人，用该行 length 计算总分和平均分。 / Each row is one student; use its length for the mean.

空数 / Blanks: 4

检查 / Check:

```text
Student1 Total=253 Average=84.33
Student2 Total=186 Average=62.00
Student3 Total=278 Average=92.67
```

### Q15 进阶：引用与副本 / Extra: alias and copy

alias 与 original 共享数组，copy 单独分配并逐项复制。 / alias shares original; allocate copy separately and copy each element.

空数 / Blanks: 4

检查 / Check:

```text
Original=0 Alias=0 Copy=95 Same=true
```

### Q16 进阶：折半查找 / Extra: binary search

给定数组已升序，找 88，未找到输出 -1。 / Search the sorted array for 88; output -1 if absent.

空数 / Blanks: 4

检查 / Check:

```text
SearchIndex=5
```

### Q17 挑战：短路与自增 / Challenge: short-circuiting

填 || 和 &&，先预测 checks 值。 / Fill || and &&, and predict checks before running.

空数 / Blanks: 4

检查 / Check:

```text
First=true Second=false Checks=0 Before=3 After=3 Final=4
```

### Q18 挑战：位运算与类型判断 / Challenge: bits and type checks

a=5(0101)，b=3(0011)，补按位与、或、异或、取反和类型判断。 / Complete bitwise AND, OR, XOR, complement and an array type check.

空数 / Blanks: 5

检查 / Check:

```text
And=1 Or=7 Xor=6 Not=-6 Array=true
```

## 修改数据做测试 / Test by changing data

只修改 main 开头的 scores。Q04–08、Q10、Q12 使用这份数据；其他题使用自己的固定值，所以输出通常不变。每次测试后恢复默认数据。

Change only scores at the top of main. Q04–08, Q10, and Q12 use it; other tasks use independent fixed values, so their output generally stays unchanged. Restore the default data afterwards.

| 测试数据 / Test data | 重点检查 / Checks |
| --- | --- |
| `{0,59,60,69,70,79,80,89,90,100}` | Q08: F F D D C C B B A A；Q07: 8 个及格 / 8 passes |
| `{-1,105}` | Q05: Valid=0 Invalid=2 Total=0；Q06/Q07: No valid scores；Q10: -1 |
| `{}` | 无数组越界或除零；Q06/Q07: No valid scores；Q10: -1；Q12: 只有标签 / No exceptions, labels without stars |
| `{100,100}` | Q10: 首个下标 0 / first index 0；Q07: Rate=100.00% |
| `{59}` | Q07: Min=59 Max=59 Rate=0.00% |

额外测试：Q11 初始分改为 60，结果是 63 分、1 次，解释 do-while 至少运行一次；Q16 的 key 改为 61，结果为 -1。

Extra tests: in Q11, start at 60 to get 63 after one attempt and explain why. In Q16, change key to 61 to get -1.

## 思考与提交 / Explain and submit

提交填好的 Java 文件、一份主线默认输出和一次边界测试结果。若只完成主线，可在提交副本中移除 Q13–18 的未完成代码块后运行。解释题可以用中文或英文回答，并写在相关代码旁的 `//` 注释中。

Submit the completed Java file, the default core output, and one boundary test result. If submitting only the core, remove the unfinished Q13–18 blocks from your submission copy before running it. Answer the following in Chinese or English using `//` comments beside the related code.

- Q05：continue 与 break 的区别是什么？ / How do continue and break differ?
- Q06：为什么除法前要转 double？短路保护为什么放在左边？ / Why cast before division, and why put the safety check first?
- Q08：从低分条件开始且不改其他分支，会有什么问题？ / What happens if you test the lowest threshold first without changing the other branches?
- Q11：while 与 do-while 哪个可能一次也不执行？ / Which loop may execute zero times?
- Q15：为什么改 alias 会影响 original，却不影响 copy？ / Why does changing alias affect original but not copy?
- Q17：两次短路表达式执行后，checks 为什么仍为 0？ / Why does checks stay 0 after both short-circuit expressions?

## 课件对应 / Alignment with the slides

沿用第二、三章双语课堂版课件的内容范围，课堂使用本文件替代课件末尾原来的四道练习。课件本身未修改。

The tasks follow the bilingual classroom decks for Chapters 2 and 3 and replace their four old Chapter 3 exercises in class. The slide files are unchanged.

| 知识点 / Topic | 题号 / Tasks |
| --- | --- |
| 标识符、八种基本类型、常量、字符、转换 / Identifiers, eight primitive types, literals, characters, conversions | Q01–02、Q06 |
| 数组下标、length、new、默认值 / Array indexes, length, allocation, default values | Q04、Q12 |
| print、println、printf / Output | 全部 / All |
| 算术、复合赋值、自增自减、优先级 / Arithmetic, compound assignment, increments, precedence | Q02–07、Q11、Q13、Q17 |
| 比较、逻辑、短路、if、switch / Comparison, logic, short-circuiting, branches | Q05–11、Q17 |
| for、while、do-while、增强 for、嵌套循环 / Loop forms, enhanced for, nesting | Q04–16 |
| break、continue | Q05、Q09–10、Q16 |
| 二维数组、引用与复制、折半查找 / 2D arrays, references, copies, binary search | Q14–16 |
| 位运算、instanceof / Bitwise operations, instanceof | Q18 |

输入部分依照本练习要求省略 Scanner。第 3 章的语句块在各题 `{ }` 中体现；package/import 的语句类别只需识别，本练习不要求填写。

Scanner input is omitted as required. Each task's braces demonstrate statement blocks; package/import statement categories require recognition only and are not blanks in this exercise.
