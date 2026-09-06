// 第三章简单填空 / Chapter 3 Easy Practice
// 直接填编号空白；运行 PracticeChecker 逐题检查。 / Fill blanks; run PracticeChecker.
public class ClassScoreReportPractice {
    public static void main(String[] args) {

        // Q01 加减乘 / Arithmetic
        // 计算 a+b、a-b、a*b。 / Calculate a+b, a-b and a*b.
        // BEGIN Q01
        {
            int a = 8, b = 3;
            // TODO Q01_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(a __Q01_01__ b);
            // TODO Q01_02：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(a __Q01_02__ b);
            // TODO Q01_03：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(a __Q01_03__ b);
        }
        // END Q01

        // Q02 除法与余数 / Division and remainder
        // 10 人每 3 人一组，求完整组数和剩余人数。 / Group 10 students in threes.
        // BEGIN Q02
        {
            int people = 10, size = 3;
            // TODO Q02_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(people __Q02_01__ size);
            // TODO Q02_02：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(people __Q02_02__ size);
        }
        // END Q02

        // Q03 自增自减 / Increment and decrement
        // 人数先加 1 再减 1，每步打印。 / Add one, then subtract one; print each step.
        // BEGIN Q03
        {
            int count = 5;
            // TODO Q03_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            count__Q03_01__;
            System.out.println(count);
            // TODO Q03_02：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            count__Q03_02__;
            System.out.println(count);
        }
        // END Q03

        // Q04 判断及格 / Pass or retry
        // 60 分及格，打印 Pass 或 Retry。 / Print Pass for scores >=60, otherwise Retry.
        // BEGIN Q04
        {
            int score = 60;
            // TODO Q04_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            if (score __Q04_01__ 60) {
                System.out.println("Pass");
            } else {
                System.out.println("Retry");
            }
        }
        // END Q04

        // Q05 有效范围 / Valid range
        // 0 到 100（含端点）为有效分数。 / A valid score is between 0 and 100 inclusive.
        // BEGIN Q05
        {
            int score = 80;
            // TODO Q05_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            boolean valid = score >= 0 __Q05_01__ score <= 100;
            System.out.println(valid);
        }
        // END Q05

        // Q06 三级评价 / Three grade bands
        // >=90 输出 A，>=60 输出 B，否则 C。 / Print A for >=90, B for >=60, otherwise C.
        // BEGIN Q06
        {
            int score = 75;
            // TODO Q06_01：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            if (score >= __Q06_01__) {
                System.out.println("A");
            // TODO Q06_02：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
            } else if (score >= __Q06_02__) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }
        // END Q06

        // Q07 switch 选择 / switch selection
        // 1 对应 Mon，2 对应 Tue，其他值对应 Other。 / Map 1 to Mon, 2 to Tue, and other values to Other.
        // BEGIN Q07
        {
            int day = 2;
            // TODO Q07_01：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            switch (__Q07_01__) {
                case 1: System.out.println("Mon"); break;
            // TODO Q07_02：填写下一行的关键字 / keyword；替换对应编号空白。 / Replace the matching blank below.
                case 2: System.out.println("Tue"); __Q07_02__;
                default: System.out.println("Other");
            }
        }
        // END Q07

        // Q08 for 打印 / Print with for
        // 打印 1 到 n，每行一个数。 / Print 1 through n, one number per line.
        // BEGIN Q08
        {
            int n = 3;
            // TODO Q08_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            // TODO Q08_02：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            for (int i = 1; i __Q08_01__ n; i__Q08_02__) {
                System.out.println(i);
            }
        }
        // END Q08

        // Q09 for 求和 / Sum with for
        // 计算 1 到 n 的和。 / Sum 1 through n.
        // BEGIN Q09
        {
            int n = 5, sum = 0;
            for (int i = 1; i <= n; i++) {
            // TODO Q09_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
                sum __Q09_01__ i;
            }
            System.out.println(sum);
        }
        // END Q09

        // Q10 while 倒数 / Countdown with while
        // 从 3 打印到 1，循环内每次减 1。 / Print 3 down to 1, decreasing each time.
        // BEGIN Q10
        {
            int n = 3;
            // TODO Q10_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            while (n __Q10_01__ 0) {
                System.out.println(n);
            // TODO Q10_02：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
                n__Q10_02__;
            }
        }
        // END Q10

        // Q11 do-while / Run at least once
        // 从 1 开始，打印到 3。 / Start at 1 and print through 3.
        // BEGIN Q11
        {
            int n = 1;
            do {
                System.out.println(n);
                n++;
            // TODO Q11_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            } while (n __Q11_01__ 3);
        }
        // END Q11

        // Q12 continue 跳过 / Skip with continue
        // 打印 1 到 4，跳过 2。 / Print 1 through 4, skipping 2.
        // BEGIN Q12
        {
            for (int i = 1; i <= 4; i++) {
            // TODO Q12_01：填写下一行的关键字 / keyword；替换对应编号空白。 / Replace the matching blank below.
                if (i == 2) { __Q12_01__; }
                System.out.println(i);
            }
        }
        // END Q12

        // Q13 break 停止 / Stop with break
        // 遇到 3 时停止，3 不打印。 / Stop before printing 3.
        // BEGIN Q13
        {
            for (int i = 1; i <= 5; i++) {
            // TODO Q13_01：填写下一行的关键字 / keyword；替换对应编号空白。 / Replace the matching blank below.
                if (i == 3) { __Q13_01__; }
                System.out.println(i);
            }
        }
        // END Q13

        // Q14 数组总分 / Array total
        // 用增强 for 累加数组成绩。 / Sum the array with enhanced for.
        // BEGIN Q14
        {
            int[] scores = {60, 70, 80};
            int total = 0;
            // TODO Q14_01：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            for (int score : __Q14_01__) {
            // TODO Q14_02：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
                total += __Q14_02__;
            }
            System.out.println(total);
        }
        // END Q14

        // Q15 数组平均分 / Array average
        // 先转为 double 再除法，打印两位小数。 / Cast to double before division; print two decimals.
        // BEGIN Q15
        {
            int[] scores = {60, 71};
            int total = 0;
            for (int score : scores) { total += score; }
            if (scores.length > 0) {
            // TODO Q15_01：填写下一行的数据类型 / data type；替换对应编号空白。 / Replace the matching blank below.
            // TODO Q15_02：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
                double average = (__Q15_01__) total / scores.__Q15_02__;
                System.out.printf("%.2f%n", average);
            } else { System.out.println("No scores"); }
        }
        // END Q15

        // Q16 统计及格人数 / Count passes
        // 用 for 遍历数组，统计 >=60 的数量。 / Count array scores >=60.
        // BEGIN Q16
        {
            int[] scores = {59, 60, 80};
            int count = 0;
            // TODO Q16_01：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            for (int i = 0; i < scores.__Q16_01__; i++) {
            // TODO Q16_02：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
                if (scores[i] __Q16_02__ 60) { count++; }
            }
            System.out.println(count);
        }
        // END Q16

        // Q17 逻辑或 / Logical OR
        // 小于 0 或大于 100 都是无效分数。 / A score below 0 or above 100 is invalid.
        // BEGIN Q17
        {
            int score = 105;
            // TODO Q17_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            boolean invalid = score < 0 __Q17_01__ score > 100;
            System.out.println(invalid);
        }
        // END Q17

        // Q18 逻辑非 / Logical NOT
        // 输出 ready 的相反值。 / Print the opposite of ready.
        // BEGIN Q18
        {
            boolean ready = false;
            // TODO Q18_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(__Q18_01__ready);
        }
        // END Q18

        // Q19 是否相等 / Equality
        // 判断两个整数是否相等。 / Check whether two integers are equal.
        // BEGIN Q19
        {
            int a = 5, b = 5;
            // TODO Q19_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            System.out.println(a __Q19_01__ b);
        }
        // END Q19

        // Q20 比较大小 / Compare values
        // 输出两个数中较大的一个，相等时输出任一个。 / Print the larger value; either is fine when equal.
        // BEGIN Q20
        {
            int a = 8, b = 3;
            // TODO Q20_01：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            if (__Q20_01__) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
        // END Q20

        // Q21 判断偶数 / Even numbers
        // 能被 2 整除打印 Even，否则 Odd。 / Print Even when divisible by 2, otherwise Odd.
        // BEGIN Q21
        {
            int n = 6;
            // TODO Q21_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            if (n __Q21_01__ 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
        // END Q21

        // Q22 累加两次 / Add twice
        // sum 初始 0，先加 3，再加 4。 / Start sum at 0, add 3, then add 4.
        // BEGIN Q22
        {
            int sum = 0;
            // TODO Q22_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            sum __Q22_01__ 3;
            // TODO Q22_02：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            sum __Q22_02__ 4;
            System.out.println(sum);
        }
        // END Q22

        // Q23 乘法累计 / Repeated multiplication
        // result 初始 1，依次乘 2 和 3。 / Start at 1, multiply by 2 and then 3.
        // BEGIN Q23
        {
            int result = 1;
            // TODO Q23_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            result __Q23_01__ 2;
            // TODO Q23_02：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            result __Q23_02__ 3;
            System.out.println(result);
        }
        // END Q23

        // Q24 数组逐项输出 / Print array elements
        // 增强 for 每次取一个元素，每行输出一次。 / Print each array element on its own line.
        // BEGIN Q24
        {
            int[] numbers = {2, 4, 6};
            // TODO Q24_01：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            for (int value : __Q24_01__) {
            // TODO Q24_02：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
                System.out.println(__Q24_02__);
            }
        }
        // END Q24

        // Q25 输出偶数 / Print even values
        // 从 2 开始每次加 2，输出到 6。 / Start at 2, add 2 each time, and print through 6.
        // BEGIN Q25
        {
            // TODO Q25_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            for (int i = 2; i <= 6; i __Q25_01__ 2) {
                System.out.println(i);
            }
        }
        // END Q25

        // Q26 while 求和 / Sum with while
        // 用 while 计算 1+2+3，更新 i 避免死循环。 / Sum 1+2+3 with while; update i each time.
        // BEGIN Q26
        {
            int i = 1, total = 0;
            while (i <= 3) {
            // TODO Q26_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
                total __Q26_01__ i;
            // TODO Q26_02：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
                i__Q26_02__;
            }
            System.out.println(total);
        }
        // END Q26

        // Q27 统计低分 / Count low scores
        // 统计小于 60 的成绩数量。 / Count scores below 60.
        // BEGIN Q27
        {
            int[] scores = {45, 60, 55, 90};
            int count = 0;
            for (int score : scores) {
            // TODO Q27_01：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
            // TODO Q27_02：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
                if (__Q27_01__) { count__Q27_02__; }
            }
            System.out.println(count);
        }
        // END Q27

        // Q28 查找指定值 / Find a target
        // 找到 target 后设 found 为 true 并停止。 / Set found to true and stop when target is found.
        // BEGIN Q28
        {
            int[] numbers = {3, 5, 7};
            int target = 5;
            boolean found = false;
            for (int value : numbers) {
            // TODO Q28_01：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
                if (value __Q28_01__ target) {
            // TODO Q28_02：填写下一行的常量或下标 / literal or index；替换对应编号空白。 / Replace the matching blank below.
                    found = __Q28_02__;
            // TODO Q28_03：填写下一行的关键字 / keyword；替换对应编号空白。 / Replace the matching blank below.
                    __Q28_03__;
                }
            }
            System.out.println(found);
        }
        // END Q28

        // Q29 跳过负数 / Skip negatives
        // 遇到负数 continue，只累加非负数。 / Skip negatives with continue and sum nonnegative values.
        // BEGIN Q29
        {
            int[] numbers = {2, -1, 3};
            int sum = 0;
            for (int value : numbers) {
            // TODO Q29_01：填写下一行的关键字 / keyword；替换对应编号空白。 / Replace the matching blank below.
                if (value < 0) { __Q29_01__; }
            // TODO Q29_02：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
                sum += __Q29_02__;
            }
            System.out.println(sum);
        }
        // END Q29

        // Q30 逆序输出 / Reverse output
        // 从最后一个下标开始递减，输出所有元素。 / Start at the last index and decrease to print all elements.
        // BEGIN Q30
        {
            int[] numbers = {10, 20, 30};
            // TODO Q30_01：填写数组最后一个元素的下标表达式（数组长度减 1）。 / Fill the last index expression (array length minus 1).
            // TODO Q30_02：填写下一行的运算符 / operator；替换对应编号空白。 / Replace the matching blank below.
            for (int i = __Q30_01__; i >= 0; i__Q30_02__) {
            // TODO Q30_03：填写下一行的变量名、属性或表达式 / variable, property, or expression；替换对应编号空白。 / Replace the matching blank below.
                System.out.println(numbers[__Q30_03__]);
            }
        }
        // END Q30
    }
}
