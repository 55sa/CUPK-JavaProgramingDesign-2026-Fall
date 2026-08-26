Java 程序设计课堂示例（第1—2章）

学生练习：
- 第1章/学生练习TODO：6 道带 TODO 的学生版编程题。
- 第2章/学生练习TODO：8 道带 TODO 的学生版编程题。
- 学生先完成 TODO，再参考章节目录中的完整示例代码。

运行方法：
1. 在 IntelliJ IDEA 中，每个 .java 文件可单独新建并运行。
2. 命令行进入对应章节目录后执行：
   javac 文件名.java
   java 主类名

建议演示顺序：

第1章
1. Hello.java：第一个程序；强调文件名、主类名和 main 方法。
2. PeopleDemo.java：一个源文件包含多个类；强调只能有一个 public 类。
3. DebugDemo.java：断点、单步执行和观察变量。
4. PersonalCard.java：编程练习1，分别输出姓名、专业和学习目标。
5. StudentDemo.java：编程练习2，在一个源文件中定义并使用两个类。
6. BugFixDemo.java：编程练习3，计算1到100的和并练习断点调试。

第2章
1. IntLongCharDemo.java：int、long、char 的完整可运行示例；讲整数运算、L 后缀和 Unicode。
2. UnicodeDemo.java：char、Unicode 和强制类型转换。
3. TypeConversionDemo.java：自动转换、强制转换和精度损失。
4. ScannerSumDemo.java：Scanner 输入、while 循环和累加。
5. ArrayBasicsDemo.java：数组声明、初始化、length 和遍历。
6. BinarySearchDemo.java：折半查找；建议逐轮打印 low、high、mid。
7. IntLongCharReport.java：编程练习1，综合使用 int、long、char 和 Unicode。
8. RectangleInput.java：编程练习2，输入矩形长宽并演示强制类型转换。
9. ScoreStatistics.java：编程练习3，使用数组统计总分、平均分、最高分和最低分。

课堂提示：
- 先让学生预测输出，再运行验证。
- 每个例子运行成功后，只改一个变量或条件，让学生观察结果变化。
- ScannerSumDemo 输入若干数字，最后输入 0 结束。
- BinarySearchDemo 可修改 target，分别演示“找到”和“未找到”。
