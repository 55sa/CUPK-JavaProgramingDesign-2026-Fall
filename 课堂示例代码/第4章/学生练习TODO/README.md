# 第四章：对象基础填空
# Chapter 4: Object Basics

30 道简单题、52 个空，每题只填 1–3 处。类、字段、构造方法和方法框架已经给好，搜索 TODO 即可找到填写位置。数据固定，不用 Scanner。

30 easy tasks with 52 blanks, only 1–3 blanks per task. Classes, fields, constructors and method scaffolds are provided. Search for TODO to find each blank. All data is fixed; no Scanner is required.

## 先看懂代码结构 / Understand the structure

每题有一个描述对象的普通类（例如 Student01），和一个带 main 的 Task01 类。名字后面的数字用于区分题目，Student01 与 Student02 是不同类。文件顶部的 ObjectBasicsPractice.main 已写好，用来在全部完成后依次运行各题，不需要修改。

Each task has an ordinary model class, such as Student01, and a Task01 class with main. Number suffixes keep classes from different tasks separate. The supplied ObjectBasicsPractice.main runs all tasks after completion; leave it unchanged.

`Student01 s` 声明的是引用变量；`new Student01()` 创建对象；`s.score` 访问对象字段；`s.sayHello()` 调用对象方法。类描述一类对象的属性和行为，同一个类可以创建多个对象。

`Student01 s` declares a reference variable; `new Student01()` creates an object; `s.score` accesses a field; `s.sayHello()` calls an instance method. A class describes attributes and behavior and can create multiple objects.

## 填哪里 / Where to fill

1. 打开 `ObjectBasicsPractice.java`，搜索 `TODO Q01_01`。提示下方的 `__Q01_01__` 就是要替换的位置。
   Open `ObjectBasicsPractice.java` and search for `TODO Q01_01`. Replace the `__Q01_01__` marker on the code line below it.
2. 每个空都有独立 TODO 和中英文提示。只替换编号空白，保留已给的括号、分号和数据。
   Each blank has its own TODO and bilingual hint. Replace only the marker; retain surrounding punctuation and supplied data.
3. 不需要删除块注释。保留 `// BEGIN Qxx`、`// END Qxx` 和 TaskXX 类名，测试程序依靠它们定位题目。
   No block comments need removal. Keep BEGIN/END markers and TaskXX class names so the checker can locate the tasks.
4. 做完一题即可测试。其他题未填或编译错误，不会影响本题判分。
   Check a task as soon as you finish it. Other unfinished or invalid tasks do not block grading.

## 测试并生成 TXT / Check and save TXT results

需要 JDK 8 或更高版本。在本目录打开终端，只编译测试程序：
Use JDK 8 or later. Open a terminal in this folder and compile only the checker:

```text
javac -encoding UTF-8 PracticeChecker.java
java PracticeChecker
```

不要执行 `javac *.java`，因为尚未填写的练习源码不能整体编译。测试器会独立编译每题的模型类和 main。IDEA 用户可以在本目录终端运行上述命令，避免先构建整个未完成的项目。

Do not use `javac *.java`: the unfinished exercise cannot compile as a whole. The checker compiles each task's model class and main separately. In IntelliJ IDEA, use the terminal in this folder to avoid building the unfinished project first.

屏幕显示每题 PASS（正确）、NOT FINISHED（未填）、COMPILE ERROR（编译错误）、WRONG OUTPUT（结果不符）、RUNTIME ERROR（运行错误）或 TIMEOUT（超时）。测试完成后自动在本目录保存 UTF-8 的 `测试结果.txt`，包含时间、源码路径、逐题结果和汇总。再次运行会覆盖旧结果。

The console reports PASS, NOT FINISHED, COMPILE ERROR, WRONG OUTPUT, RUNTIME ERROR, or TIMEOUT per task. It automatically saves UTF-8 `测试结果.txt` in this folder with the time, source path, per-task results, and totals. Each run replaces the previous report.

从其他目录运行时，可传入本练习目录的完整路径：
When running from another directory, pass this exercise folder's full path:

```text
java PracticeChecker "本练习目录的完整路径"
```

全部填完后，可直接编译运行整份练习：
After filling all blanks, compile and run the complete exercise:

```text
javac -encoding UTF-8 ObjectBasicsPractice.java
java ObjectBasicsPractice
```

测试器按运行结果判分，部分题会换一组数据再测。不要把结果写死。测试通过不代表已检查所有语法要求，例如 Q21 的 private 修饰符仍需教师查看代码；等价正确写法可以通过测试。

The checker grades output and uses changed data in some tasks. Do not hard-code answers. Passing does not verify every syntax requirement, such as private in Q21; the teacher should review code too. Equivalent correct solutions can pass.

## 一节课怎么安排 / Lesson pacing

建议 50 分钟：讲解类和对象以及首次测试 5 分钟，Q01–10 约 15 分钟，Q11–20 约 20 分钟，纠错和解释 10 分钟。Q21–30 作为进度快同学的加练或下节课练习。保持每题短小，不要求一节课完成全部 30 题。

Suggested 50-minute lesson: 5 minutes for setup and class/object explanation, 15 for Q01–10, 20 for Q11–20, and 10 for corrections and discussion. Q21–30 are extra practice for faster students or a later lesson. All 30 tasks are not required in one class.

## 题目与默认结果 / Tasks and default results

### Q01 创建第一个对象 / Create an object

用 new 创建 Student 对象并输出默认分数。 / Create a Student object with new and print its default score.

默认输出 / Default output:

```text
0
```

### Q02 设置对象属性 / Set a field

把学生分数设为 80，再读取该属性。 / Set the score to 80 and read it.

默认输出 / Default output:

```text
80
```

### Q03 设置对象姓名 / Set a name

用成员变量 name 保存并输出 Li。 / Store and print Li using name.

默认输出 / Default output:

```text
Li
```

### Q04 两个独立对象 / Two independent objects

创建第二个新对象，分别保存 60 和 90。 / Create a second object and store 60 and 90 independently.

默认输出 / Default output:

```text
60
90
```

### Q05 对象属性相互独立 / Independent fields

修改 a 的 age 为 20，b 的 age 保持 18。 / Change a.age to 20 while b.age stays 18.

默认输出 / Default output:

```text
20
18
```

### Q06 调用无参方法 / Call a method

通过对象调用 sayHello 方法。 / Call sayHello on the object.

默认输出 / Default output:

```text
Hello
```

### Q07 方法修改对象 / Change state with a method

birthday 每次把 age 增加 1，调用两次。 / birthday increases age by one; call it twice.

默认输出 / Default output:

```text
20
```

### Q08 方法返回属性 / Return a field

getScore 返回当前对象的 score。 / getScore returns this object's score.

默认输出 / Default output:

```text
75
```

### Q09 方法接收参数 / Pass an argument

setScore 接收 value 并保存到 score。 / Store value in score.

默认输出 / Default output:

```text
85
```

### Q10 this 区分同名变量 / Use this

参数和成员都叫 score，用 this 指定成员。 / Both are named score; use this for the field.

默认输出 / Default output:

```text
82
```

### Q11 无参构造方法 / No-argument constructor

构造方法与类同名，创建时把 score 设为 60。 / The constructor matches the class name and initializes score to 60.

默认输出 / Default output:

```text
60
```

### Q12 带参构造方法 / Parameterized constructor

创建对象时传入 initialScore。 / Pass initialScore when creating the object.

默认输出 / Default output:

```text
88
```

### Q13 构造方法中的 this / this in a constructor

把构造参数 name 保存到当前对象。 / Save the name parameter in the current object.

默认输出 / Default output:

```text
Li
```

### Q14 两个构造参数 / Two constructor arguments

按姓名、分数的顺序传入变量。 / Pass the name and score variables in that order.

默认输出 / Default output:

```text
Li
90
```

### Q15 矩形对象面积 / Rectangle area

area 返回宽乘高，结果由对象属性计算。 / Return width times height from the fields.

默认输出 / Default output:

```text
12
```

### Q16 两个对象调用同一方法 / Same method, different objects

分别创建边长 3 和 5 的正方形，输出各自面积。 / Create squares with sides 3 and 5 and print their areas.

默认输出 / Default output:

```text
9
25
```

### Q17 引用赋值 / Assign a reference

alias 和 original 指向同一对象，修改 alias 后读取 original。 / Make alias refer to original, update alias, then read original.

默认输出 / Default output:

```text
95
```

### Q18 比较同一对象的引用 / Compare aliases

a 与 b 引用同一对象，用 == 比较。 / Compare a and b, which refer to the same object.

默认输出 / Default output:

```text
true
```

### Q19 相同属性不是同一对象 / Same values, different objects

创建两个 score 都为 60 的对象，比较引用。 / Create two objects with score 60 and compare references.

默认输出 / Default output:

```text
false
true
```

### Q20 null 与对象 / null and an object

先声明 null 引用，再创建对象。 / Start with a null reference, then create the object.

默认输出 / Default output:

```text
true
60
```

### Q21 private 与 getter / Private field and getter

分数字段设为 private，通过 getter 读取。 / Make the score private and read it through the getter.

默认输出 / Default output:

```text
80
```

### Q22 setter 更新私有字段 / Update a private field

通过 setScore 修改字段，再由 getter 读取。 / Update through setScore and read through getScore.

默认输出 / Default output:

```text
91
```

### Q23 setter 检查范围 / Validate a setter

只接收 0–100，非法值保留旧分数。 / Accept 0–100 and keep the previous score for invalid input.

默认输出 / Default output:

```text
60
```

### Q24 对象作为参数 / An object parameter

Teacher 的 addPoint 接收 Student，给它加 1 分。 / Teacher.addPoint receives a Student and adds one point.

默认输出 / Default output:

```text
61
```

### Q25 重新指定引用 / Reassign a reference

b 改为引用新对象后，a 仍引用旧对象。 / After b points to a new object, a still refers to the original.

默认输出 / Default output:

```text
60
90
```

### Q26 static 共享计数 / A shared static counter

count 属于类，每创建一个对象加 1，创建两个对象。 / count belongs to the class and increases for each of two objects.

默认输出 / Default output:

```text
2
```

### Q27 对象数组的元素 / Object array elements

数组分配后元素为 null，给第一个位置创建对象。 / Array slots start as null; create an object in the first slot.

默认输出 / Default output:

```text
true
80
```

### Q28 遍历对象数组 / Traverse an object array

对每个 Student 调用 getScore，打印 70 和 90。 / Call getScore on each Student to print 70 and 90.

默认输出 / Default output:

```text
70
90
```

### Q29 对象组合 / Object composition

Radio 保存 Battery 引用，输出电池电量。 / Radio stores a Battery reference; print its power.

默认输出 / Default output:

```text
100
```

### Q30 小综合：学生信息卡 / Mini task: student card

构造对象、调用方法，按姓名和分数输出信息卡。 / Construct an object and call its method to print the name and score.

默认输出 / Default output:

```text
Li
86
```

## 课件对应 / Slide alignment

依据“第4章类与对象_中英双语_超大字体课堂版_含编程练习.pptx”，重点练习对象相关内容，课件文件本身不修改。

Based on the bilingual classroom Chapter 4 deck. This exercise focuses on objects; the slide file itself is unchanged.

| 课件主题 / Topic | 题目 / Tasks |
| --- | --- |
| 类、字段、对象创建 / Classes, fields, object creation | Q01–05、Q20 |
| 实例方法、参数、返回值 / Instance methods, parameters, returns | Q06–10、Q15–16 |
| 构造方法、this / Constructors, this | Q10–14、Q30 |
| 对象引用与共享 / References and shared objects | Q17–19、Q25 |
| private、getter/setter、封装 / Encapsulation | Q21–23、Q30 |
| 对象作为参数 / Object parameters | Q24 |
| static 类变量 / Static class fields | Q26 |
| 对象数组 / Object arrays | Q27–28 |
| 对象组合 / Composition | Q29 |

本版不要求复杂的方法重载、包管理、有理数运算、流水线或继承。第二、三章只用简单数组、判断、循环帮助理解对象。

This version does not require complex overloading, package management, rational arithmetic, pipelines, or inheritance. Simple arrays, conditions, and loops from Chapters 2–3 support the object exercises.

## 提交和解释 / Submission and explanation

提交填写后的 Java 文件和 `测试结果.txt`。任选两题，用中文或英文写一句话解释：new 创建了什么？两个对象的属性为什么独立？引用赋值是否复制对象？构造方法何时执行？对象数组分配后为什么还要创建元素对象？

Submit your Java file and `测试结果.txt`. Choose two questions and explain in Chinese or English: What does new create? Why are fields independent across objects? Does reference assignment copy an object? When does a constructor run? Why must objects be created after allocating an object array?
