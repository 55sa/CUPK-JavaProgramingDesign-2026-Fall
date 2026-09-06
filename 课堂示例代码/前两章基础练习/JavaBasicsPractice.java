// Java 前两章基础填空 / Java Basics: Chapters 1–2
// 直接填编号空白；运行 PracticeChecker 逐题检查。 / Fill blanks; run PracticeChecker.
public class JavaBasicsPractice {
    public static void main(String[] args) {

        // Q01 第一行输出 / First output
        // 输出 Hello, Java! / Print Hello, Java!
        // BEGIN Q01
        {
            // TODO Q01_01：填写下一行的输出方法名 / output method name；替换对应编号空白。 / Replace the matching blank below.
            System.out.__Q01_01__("Hello, Java!");
        }
        // END Q01

        // Q02 print 与 println / Output lines
        // 第一行输出 Java Class，第二行输出 Ready。 / Print Java Class on the first line and Ready on the second.
        // BEGIN Q02
        {
            // TODO Q02_01：填写下一行的输出方法名 / output method name；替换对应编号空白。 / Replace the matching blank below.
            System.out.__Q02_01__("Java ");
            System.out.println("Class");
            // TODO Q02_02：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(__Q02_02__);
        }
        // END Q02

        // Q03 编译与运行 / Compile and run
        // Hello.java 的编译命令使用 javac，运行命令使用 java。 / Compile Hello.java with javac and run it with java.
        // BEGIN Q03
        {
            // TODO Q03_01：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            String compileCommand = __Q03_01__;
            // TODO Q03_02：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            String runCommand = __Q03_02__;
            System.out.println(compileCommand);
            System.out.println(runCommand);
        }
        // END Q03

        // Q04 整数变量 / Integer variables
        // 为年龄选择 int 类型，再输出变量。 / Use int for age and print the variable.
        // BEGIN Q04
        {
            // TODO Q04_01：填写下一行的数据类型 / data type；替换对应编号空白。 / Replace the matching blank below.
            __Q04_01__ age = 18;
            // TODO Q04_02：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(__Q04_02__);
        }
        // END Q04

        // Q05 byte 与 short / Small integer types
        // level 用 byte，students 用 short。 / Use byte for level and short for students.
        // BEGIN Q05
        {
            // TODO Q05_01：填写下一行的数据类型 / data type；替换对应编号空白。 / Replace the matching blank below.
            __Q05_01__ level = 3;
            // TODO Q05_02：填写下一行的数据类型 / data type；替换对应编号空白。 / Replace the matching blank below.
            __Q05_02__ students = 200;
            System.out.println(level);
            System.out.println(students);
        }
        // END Q05

        // Q06 long 常量 / A long literal
        // 人口为 3000000000，常量末尾加 L。 / Use 3000000000 with an L suffix.
        // BEGIN Q06
        {
            // TODO Q06_01：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            long population = __Q06_01__;
            System.out.println(population);
        }
        // END Q06

        // Q07 float 与 double / Floating-point types
        // price 为 float 12.5F，height 为 double 1.75。 / Use float 12.5F and double 1.75.
        // BEGIN Q07
        {
            // TODO Q07_01：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            float price = __Q07_01__;
            // TODO Q07_02：填写下一行的数据类型 / data type；替换对应编号空白。 / Replace the matching blank below.
            __Q07_02__ height = 1.75;
            System.out.println(price);
            System.out.println(height);
        }
        // END Q07

        // Q08 字符与布尔值 / char and boolean
        // 字符为 A（单引号），ready 为 true。 / Use character A in single quotes and boolean true.
        // BEGIN Q08
        {
            // TODO Q08_01：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            char grade = __Q08_01__;
            // TODO Q08_02：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            boolean ready = __Q08_02__;
            System.out.println(grade);
            System.out.println(ready);
        }
        // END Q08

        // Q09 字符串拼接 / String concatenation
        // 用 + 连接标签与变量。 / Join the label and variable with +.
        // BEGIN Q09
        {
            String name = "Li";
            // TODO Q09_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            System.out.println("Name: " __Q09_01__ name);
        }
        // END Q09

        // Q10 自动转换 / Widening conversion
        // 把 int 变量赋给 double 变量。 / Assign the int variable to a double variable.
        // BEGIN Q10
        {
            int score = 80;
            // TODO Q10_01：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            double value = __Q10_01__;
            System.out.println(value);
        }
        // END Q10

        // Q11 强制转换 / Explicit cast
        // 把 8.9 转成 int，丢弃小数部分。 / Cast 8.9 to int, discarding the fraction.
        // BEGIN Q11
        {
            double value = 8.9;
            // TODO Q11_01：填写下一行的数据类型 / data type；替换对应编号空白。 / Replace the matching blank below.
            int whole = (__Q11_01__) value;
            System.out.println(whole);
        }
        // END Q11

        // Q12 字符编码 / Character code
        // 将字符 A 转为 int 编码。 / Cast character A to its int code.
        // BEGIN Q12
        {
            char letter = 'A';
            // TODO Q12_01：填写下一行的数据类型 / data type；替换对应编号空白。 / Replace the matching blank below.
            System.out.println((__Q12_01__) letter);
        }
        // END Q12

        // Q13 数组下标 / Array indexes
        // 输出第一个和第三个元素，下标从 0 开始。 / Print the first and third elements; indexes start at 0.
        // BEGIN Q13
        {
            int[] scores = {60, 70, 80};
            // TODO Q13_01：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(scores[__Q13_01__]);
            // TODO Q13_02：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(scores[__Q13_02__]);
        }
        // END Q13

        // Q14 数组空间与长度 / Allocate an array
        // 用 new 创建长度 3 的数组，输出长度和初始第一个值。 / Allocate 3 elements and print length and the first default value.
        // BEGIN Q14
        {
            // TODO Q14_01：填写下一行的关键字 / keyword；替换对应编号空白。 / Replace the matching blank below.
            int[] numbers = __Q14_01__ int[3];
            // TODO Q14_02：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(numbers.__Q14_02__);
            System.out.println(numbers[0]);
        }
        // END Q14

        // Q15 修改数组 / Change an element
        // 把第二个元素改为 90，再输出。 / Change the second element to 90 and print it.
        // BEGIN Q15
        {
            int[] scores = {60, 70, 80};
            // TODO Q15_01：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            scores[__Q15_01__] = 90;
            System.out.println(scores[1]);
        }
        // END Q15

        // Q16 二维数组 / A 2D array
        // 输出第二行第一个元素，再输出行数。 / Print the first element of the second row and the row count.
        // BEGIN Q16
        {
            int[][] marks = {{60, 70}, {80, 90}};
            // TODO Q16_01：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            // TODO Q16_02：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(marks[__Q16_01__][__Q16_02__]);
            System.out.println(marks.length);
        }
        // END Q16

        // Q17 小数格式 / Decimal formatting
        // printf 保留两位小数，用 %n 换行。 / Print two decimal places with printf and a newline.
        // BEGIN Q17
        {
            double price = 12.5;
            // TODO Q17_01：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            System.out.printf(__Q17_01__, price);
        }
        // END Q17

        // Q18 整数格式 / Integer formatting
        // 使用 %d 输出整数并换行。 / Use %d to print an integer and a newline.
        // BEGIN Q18
        {
            int age = 18;
            // TODO Q18_01：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            System.out.printf(__Q18_01__, age);
        }
        // END Q18

        // Q19 换行字符 / Newline escape
        // 一个字符串中放换行符，分别输出 A 和 B。 / Put a newline escape in one string to print A and B on separate lines.
        // BEGIN Q19
        {
            // TODO Q19_01：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            String text = __Q19_01__;
            System.out.println(text);
        }
        // END Q19

        // Q20 数组最后一项 / Last array element
        // 最后一个下标是长度减 1。 / The last index is the length minus one.
        // BEGIN Q20
        {
            int[] values = {10, 20, 30};
            // TODO Q20_01：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(values[__Q20_01__]);
        }
        // END Q20

        // Q21 字符数组 / A char array
        // 定义字符数组并输出第二个字符。 / Define a char array and print the second character.
        // BEGIN Q21
        {
            // TODO Q21_01：填写下一行的数据类型 / data type；替换对应编号空白。 / Replace the matching blank below.
            __Q21_01__[] letters = {'A', 'B', 'C'};
            // TODO Q21_02：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(letters[__Q21_02__]);
        }
        // END Q21

        // Q22 double 数组 / A double array
        // 数组元素类型是 double，输出第一项。 / Use double elements and print the first item.
        // BEGIN Q22
        {
            // TODO Q22_01：填写下一行的数据类型 / data type；替换对应编号空白。 / Replace the matching blank below.
            __Q22_01__[] prices = {2.5, 3.5};
            // TODO Q22_02：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(prices[__Q22_02__]);
        }
        // END Q22

        // Q23 布尔数组默认值 / Default boolean value
        // 新建长度 2 的 boolean 数组，输出第一项默认值。 / Allocate two booleans and print the first default value.
        // BEGIN Q23
        {
            // TODO Q23_01：填写下一行的关键字 / keyword；替换对应编号空白。 / Replace the matching blank below.
            boolean[] flags = __Q23_01__ boolean[2];
            // TODO Q23_02：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(flags[__Q23_02__]);
        }
        // END Q23

        // Q24 数组先声明再分配 / Declare then allocate
        // 先声明，再用 new 分配 2 个元素。 / Declare the array first, then allocate two elements.
        // BEGIN Q24
        {
            int[] numbers;
            // TODO Q24_01：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            numbers = __Q24_01__;
            numbers[0] = 9;
            System.out.println(numbers.length);
            System.out.println(numbers[0]);
        }
        // END Q24

        // Q25 数组别名 / Array alias
        // alias 与 original 指向同一数组，观察修改结果。 / Make alias refer to original and observe the change.
        // BEGIN Q25
        {
            int[] original = {1, 2};
            // TODO Q25_01：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            int[] alias = __Q25_01__;
            alias[0] = 9;
            System.out.println(original[0]);
        }
        // END Q25

        // Q26 两个独立数组 / Separate arrays
        // b 用 new 创建独立数组，改 b 不改变 a。 / Allocate b separately so changing b does not change a.
        // BEGIN Q26
        {
            int[] a = {1, 2};
            // TODO Q26_01：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            int[] b = __Q26_01__;
            b[0] = 9;
            System.out.println(a[0]);
            System.out.println(b[0]);
        }
        // END Q26

        // Q27 二维数组行长度 / Row lengths
        // 输出二维数组行数以及第一行长度。 / Print the row count and the length of the first row.
        // BEGIN Q27
        {
            int[][] data = {{1, 2, 3}, {4, 5, 6}};
            // TODO Q27_01：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(data.__Q27_01__);
            // TODO Q27_02：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(data[0].__Q27_02__);
        }
        // END Q27

        // Q28 修改二维数组 / Update a 2D array
        // 把第二行第二列改为 99。 / Set the second row, second column to 99.
        // BEGIN Q28
        {
            int[][] data = {{1, 2}, {3, 4}};
            // TODO Q28_01：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            // TODO Q28_02：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            data[__Q28_01__][__Q28_02__] = 99;
            System.out.println(data[1][1]);
        }
        // END Q28

        // Q29 赋值给另一个变量 / Assign a variable
        // 将 first 的值赋给 second，再输出。 / Assign first to second and print second.
        // BEGIN Q29
        {
            int first = 12;
            // TODO Q29_01：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            int second = __Q29_01__;
            System.out.println(second);
        }
        // END Q29

        // Q30 班级信息卡 / Class information card
        // 把给定变量放入输出语句，不要直接填写输出值。 / Print the supplied variables rather than literal answers.
        // BEGIN Q30
        {
            String course = "Java";
            int room = 203;
            char group = 'B';
            // TODO Q30_01：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(__Q30_01__);
            // TODO Q30_02：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(__Q30_02__);
            // TODO Q30_03：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(__Q30_03__);
        }
        // END Q30
    }
}
