// Java 前两章基础填空 / Java Basics: Chapters 1–2
// 直接填编号空白；运行 PracticeChecker 逐题检查。 / Fill blanks; run PracticeChecker.
public class JavaBasicsPracticeAnswer {
    public static void main(String[] args) {

        // Q01 第一行输出 / First output
        // 输出 Hello, Java! / Print Hello, Java!
        // BEGIN Q01
        {
            System.out.println("Hello, Java!");
        }
        // END Q01

        // Q02 print 与 println / Output lines
        // 第一行输出 Java Class，第二行输出 Ready。 / Print Java Class on the first line and Ready on the second.
        // BEGIN Q02
        {
            System.out.print("Java ");
            System.out.println("Class");
            System.out.println("Ready");
        }
        // END Q02

        // Q03 编译与运行 / Compile and run
        // Hello.java 的编译命令使用 javac，运行命令使用 java。 / Compile Hello.java with javac and run it with java.
        // BEGIN Q03
        {
            String compileCommand = "javac Hello.java";
            String runCommand = "java Hello";
            System.out.println(compileCommand);
            System.out.println(runCommand);
        }
        // END Q03

        // Q04 整数变量 / Integer variables
        // 为年龄选择 int 类型，再输出变量。 / Use int for age and print the variable.
        // BEGIN Q04
        {
            int age = 18;
            System.out.println(age);
        }
        // END Q04

        // Q05 byte 与 short / Small integer types
        // level 用 byte，students 用 short。 / Use byte for level and short for students.
        // BEGIN Q05
        {
            byte level = 3;
            short students = 200;
            System.out.println(level);
            System.out.println(students);
        }
        // END Q05

        // Q06 long 常量 / A long literal
        // 人口为 3000000000，常量末尾加 L。 / Use 3000000000 with an L suffix.
        // BEGIN Q06
        {
            long population = 3000000000L;
            System.out.println(population);
        }
        // END Q06

        // Q07 float 与 double / Floating-point types
        // price 为 float 12.5F，height 为 double 1.75。 / Use float 12.5F and double 1.75.
        // BEGIN Q07
        {
            float price = 12.5F;
            double height = 1.75;
            System.out.println(price);
            System.out.println(height);
        }
        // END Q07

        // Q08 字符与布尔值 / char and boolean
        // 字符为 A（单引号），ready 为 true。 / Use character A in single quotes and boolean true.
        // BEGIN Q08
        {
            char grade = 'A';
            boolean ready = true;
            System.out.println(grade);
            System.out.println(ready);
        }
        // END Q08

        // Q09 字符串拼接 / String concatenation
        // 用 + 连接标签与变量。 / Join the label and variable with +.
        // BEGIN Q09
        {
            String name = "Li";
            System.out.println("Name: " + name);
        }
        // END Q09

        // Q10 自动转换 / Widening conversion
        // 把 int 变量赋给 double 变量。 / Assign the int variable to a double variable.
        // BEGIN Q10
        {
            int score = 80;
            double value = score;
            System.out.println(value);
        }
        // END Q10

        // Q11 强制转换 / Explicit cast
        // 把 8.9 转成 int，丢弃小数部分。 / Cast 8.9 to int, discarding the fraction.
        // BEGIN Q11
        {
            double value = 8.9;
            int whole = (int) value;
            System.out.println(whole);
        }
        // END Q11

        // Q12 字符编码 / Character code
        // 将字符 A 转为 int 编码。 / Cast character A to its int code.
        // BEGIN Q12
        {
            char letter = 'A';
            System.out.println((int) letter);
        }
        // END Q12

        // Q13 数组下标 / Array indexes
        // 输出第一个和第三个元素，下标从 0 开始。 / Print the first and third elements; indexes start at 0.
        // BEGIN Q13
        {
            int[] scores = {60, 70, 80};
            System.out.println(scores[0]);
            System.out.println(scores[2]);
        }
        // END Q13

        // Q14 数组空间与长度 / Allocate an array
        // 用 new 创建长度 3 的数组，输出长度和初始第一个值。 / Allocate 3 elements and print length and the first default value.
        // BEGIN Q14
        {
            int[] numbers = new int[3];
            System.out.println(numbers.length);
            System.out.println(numbers[0]);
        }
        // END Q14

        // Q15 修改数组 / Change an element
        // 把第二个元素改为 90，再输出。 / Change the second element to 90 and print it.
        // BEGIN Q15
        {
            int[] scores = {60, 70, 80};
            scores[1] = 90;
            System.out.println(scores[1]);
        }
        // END Q15

        // Q16 二维数组 / A 2D array
        // 输出第二行第一个元素，再输出行数。 / Print the first element of the second row and the row count.
        // BEGIN Q16
        {
            int[][] marks = {{60, 70}, {80, 90}};
            System.out.println(marks[1][0]);
            System.out.println(marks.length);
        }
        // END Q16

        // Q17 小数格式 / Decimal formatting
        // printf 保留两位小数，用 %n 换行。 / Print two decimal places with printf and a newline.
        // BEGIN Q17
        {
            double price = 12.5;
            System.out.printf("%.2f%n", price);
        }
        // END Q17

        // Q18 整数格式 / Integer formatting
        // 使用 %d 输出整数并换行。 / Use %d to print an integer and a newline.
        // BEGIN Q18
        {
            int age = 18;
            System.out.printf("%d%n", age);
        }
        // END Q18

        // Q19 换行字符 / Newline escape
        // 一个字符串中放换行符，分别输出 A 和 B。 / Put a newline escape in one string to print A and B on separate lines.
        // BEGIN Q19
        {
            String text = "A\nB";
            System.out.println(text);
        }
        // END Q19

        // Q20 数组最后一项 / Last array element
        // 最后一个下标是长度减 1。 / The last index is the length minus one.
        // BEGIN Q20
        {
            int[] values = {10, 20, 30};
            System.out.println(values[values.length - 1]);
        }
        // END Q20

        // Q21 字符数组 / A char array
        // 定义字符数组并输出第二个字符。 / Define a char array and print the second character.
        // BEGIN Q21
        {
            char[] letters = {'A', 'B', 'C'};
            System.out.println(letters[1]);
        }
        // END Q21

        // Q22 double 数组 / A double array
        // 数组元素类型是 double，输出第一项。 / Use double elements and print the first item.
        // BEGIN Q22
        {
            double[] prices = {2.5, 3.5};
            System.out.println(prices[0]);
        }
        // END Q22

        // Q23 布尔数组默认值 / Default boolean value
        // 新建长度 2 的 boolean 数组，输出第一项默认值。 / Allocate two booleans and print the first default value.
        // BEGIN Q23
        {
            boolean[] flags = new boolean[2];
            System.out.println(flags[0]);
        }
        // END Q23

        // Q24 数组先声明再分配 / Declare then allocate
        // 先声明，再用 new 分配 2 个元素。 / Declare the array first, then allocate two elements.
        // BEGIN Q24
        {
            int[] numbers;
            numbers = new int[2];
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
            int[] alias = original;
            alias[0] = 9;
            System.out.println(original[0]);
        }
        // END Q25

        // Q26 两个独立数组 / Separate arrays
        // b 用 new 创建独立数组，改 b 不改变 a。 / Allocate b separately so changing b does not change a.
        // BEGIN Q26
        {
            int[] a = {1, 2};
            int[] b = new int[2];
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
            System.out.println(data.length);
            System.out.println(data[0].length);
        }
        // END Q27

        // Q28 修改二维数组 / Update a 2D array
        // 把第二行第二列改为 99。 / Set the second row, second column to 99.
        // BEGIN Q28
        {
            int[][] data = {{1, 2}, {3, 4}};
            data[1][1] = 99;
            System.out.println(data[1][1]);
        }
        // END Q28

        // Q29 赋值给另一个变量 / Assign a variable
        // 将 first 的值赋给 second，再输出。 / Assign first to second and print second.
        // BEGIN Q29
        {
            int first = 12;
            int second = first;
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
            System.out.println(course);
            System.out.println(room);
            System.out.println(group);
        }
        // END Q30
    }
}
