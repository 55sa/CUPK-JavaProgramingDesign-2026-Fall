/**
 * 班级成绩分析工作坊 / Class Score Report Workshop
 * 18 道填空题，01-12 主线，13-18 进阶。 / 18 scaffolded tasks; core 01-12, extras 13-18.
 * 直接替换 __Qxx_nn__ 填空标记，填完后运行。
 * Replace the __Qxx_nn__ blanks directly, then run the completed code.
 * 题目之间独立，共用固定 scores；不用键盘输入。
 * Tasks are independent and share fixed scores; no keyboard input.
 */
public class ClassScoreReportPractice {
    public static void main(String[] args) {
        int[] scores = {95, 82, -1, 67, 100, 59, 76, 88, 105, 60};
        System.out.println("Class Score Report Workshop");

        // Q01 基础类型与报告信息 / Primitive types
        // 按给定值补齐类型或常量后缀；班级 A，容量 40，科目 3。 / Fill types or literal suffixes; class A, capacity 40, 3 subjects.
        {
            System.out.println("Q01");
            __Q01_01__ subjectCount = 3;
            __Q01_02__ capacity = 40;
            long reportId = __Q01_03__;
            float target = __Q01_04__;
            char classCode = __Q01_05__;
            boolean published = __Q01_06__;
            System.out.printf("%d %d %d %.1f %c %b%n", subjectCount, capacity, reportId, target, classCode, published);
        }

        // Q02 字符与类型转换 / Characters and casting
        // 将 A 转为整数编码，将 78.375 截断为 int。 / Convert A to its numeric code and truncate 78.375 to int.
        {
            System.out.println("Q02");
            char letter = 'A';
            int code = __Q02_01__;
            double average = 78.375;
            int whole = __Q02_02__;
            letter__Q02_03__;
            System.out.println("Code=" + code + " Whole=" + whole + " Next=" + letter);
        }

        // Q03 算术与分组 / Arithmetic and grouping
        // 8 人每 3 人一组，计算完整组数、余数，以及 (8+2)*3。 / Group 8 students in threes and evaluate (8+2)*3.
        {
            System.out.println("Q03");
            int students = 8, groupSize = 3;
            int groups = students __Q03_01__ groupSize;
            int remaining = students __Q03_02__ groupSize;
            int seats = __Q03_03__;
            System.out.printf("Groups=%d Remaining=%d Seats=%d%n", groups, remaining, seats);
        }

        // Q04 数组与倒序 / Arrays and reverse traversal
        // 从最后一个下标向前遍历原始 scores，包含无效值。 / Traverse the original scores backwards, including invalid values.
        {
            System.out.println("Q04");
            System.out.println("Length=" + scores__Q04_01__);
            System.out.print("Reverse:");
            for (int i = __Q04_02__; __Q04_03__; __Q04_04__) {
                System.out.print(" " + scores[__Q04_05__]);
            }
            System.out.println();
        }

        // Q05 过滤与 continue / Filtering with continue
        // 有效范围 0–100，统计有效和无效数量以及有效总分。 / Count valid and invalid scores and sum only valid values.
        {
            System.out.println("Q05");
            int valid = 0, invalid = 0, total = 0;
            for (int i = 0; __Q05_01__; i++) {
                int score = scores[i];
                if (score < 0 __Q05_02__ score > 100) {
                    invalid__Q05_03__;
                    __Q05_04__;
                }
                valid++;
                total __Q05_05__ score;
            }
            System.out.printf("Valid=%d Invalid=%d Total=%d%n", valid, invalid, total);
        }

        // Q06 平均值与短路 / Averages and short-circuiting
        // 前置统计已给出，补浮点除法和短路判断，目标平均分 75.5。 / Statistics are provided; complete division and a safe comparison with 75.5.
        {
            System.out.println("Q06");
            int total = 0, count = 0;
            for (int score : scores) {
                if (score >= 0 && score <= 100) { total += score; count++; }
            }
            if (__Q06_01__) {
                double average = __Q06_02__;
                System.out.printf("Integer=%d Average=%.2f%n", total / count, average);
            } else {
                System.out.println("No valid scores");
            }
            boolean targetMet = count > 0 __Q06_03__ (double) total / count >= 75.5;
            System.out.println("TargetMet=" + targetMet);
        }

        // Q07 及格率与极值 / Pass rate and extrema
        // 只处理有效成绩，>=60 及格，零记录不输出极值。 / Process valid scores only; >=60 passes; hide extrema for zero records.
        {
            System.out.println("Q07");
            int count = 0, passed = 0, min = 101, max = -1;
            for (int score : __Q07_01__) {
                if (score < 0 || score > 100) continue;
                count++;
                if (__Q07_02__) passed++;
                if (__Q07_03__) min = score;
                if (__Q07_04__) max = score;
            }
            if (count > 0) {
                double rate = __Q07_05__;
                System.out.printf("Pass=%d Min=%d Max=%d Rate=%.2f%%%n", passed, min, max, rate);
            } else {
                System.out.println("No valid scores");
            }
        }

        // Q08 多分支等级 / Grade branches
        // A>=90，B>=80，C>=70，D>=60，其余 F；补全条件。 / Complete the descending grade thresholds.
        {
            System.out.println("Q08");
            System.out.print("Grades:");
            for (int score : scores) {
                if (score < 0 || score > 100) continue;
                char grade;
                if (__Q08_01__) grade = 'A';
                else if (__Q08_02__) grade = 'B';
                else if (__Q08_03__) grade = 'C';
                else if (__Q08_04__) grade = 'D';
                else grade = __Q08_05__;
                System.out.print(" " + grade);
            }
            System.out.println();
        }

        // Q09 switch 评语 / switch comments
        // 固定等级测试所有分支，? 应进入 default。 / Test every branch with fixed grades; ? uses default.
        {
            System.out.println("Q09");
            char[] grades = {'A', 'B', 'C', 'D', 'F', '?'};
            for (char grade : grades) {
                String comment;
                switch (__Q09_01__) {
                    case __Q09_02__: comment = "Excellent"; break;
                    case 'B': comment = "Good"; __Q09_03__;
                    case 'C': comment = "Fair"; break;
                    case 'D': comment = "Pass"; break;
                    case 'F': comment = "Retry"; break;
                    __Q09_04__: comment = "Unknown";
                }
                System.out.println(grade + ":" + comment);
            }
        }

        // Q10 while 查找满分 / Find a perfect score
        // 保存首个 100 的下标，未找到保留 -1。 / Save the first index of 100, or keep -1.
        {
            System.out.println("Q10");
            int index = 0, found = -1;
            while (__Q10_01__) {
                if (scores[index] __Q10_02__ 100) {
                    found = __Q10_03__;
                    __Q10_04__;
                }
                __Q10_05__;
            }
            System.out.println("PerfectIndex=" + found);
        }

        // Q11 do-while 补测 / Retry simulation
        // 52 分起，每次加 3，至少执行一次，达到 60 停止。 / Start at 52, add 3 per attempt, and stop at 60 or above.
        {
            System.out.println("Q11");
            int retryScore = 52, attempts = 0;
            do {
                retryScore __Q11_01__ 3;
                attempts__Q11_02__;
            } while (__Q11_03__);
            boolean passed = retryScore >= 60;
            System.out.printf("Score=%d Attempts=%d Retry=%b%n", retryScore, attempts, __Q11_04__);
        }

        // Q12 等级分布图 / Grade histogram
        // 计数数组下标 0..4 对应 A/B/C/D/F，嵌套循环打印星号。 / Counters 0..4 represent A/B/C/D/F; print stars using nested loops.
        {
            System.out.println("Q12");
            int[] counts = new int[__Q12_01__];
            char[] labels = {'A', 'B', 'C', 'D', 'F'};
            for (int score : scores) {
                if (score < 0 || score > 100) continue;
                if (score >= 90) counts[0]++;
                else if (score >= 80) counts[1]++;
                else if (score >= 70) counts[2]++;
                else if (score >= 60) counts[3]++;
                else counts[__Q12_02__]++;
            }
            for (int i = 0; __Q12_03__; i++) {
                System.out.print(labels[i] + ":");
                for (int j = 0; __Q12_04__; j++) {
                    System.out.__Q12_05__("*");
                }
                System.out.println();
            }
        }

        // Q13 进阶：学习积分 / Extra: study points
        // for 累加 1 到 10，while 计算 5!，累积乘积用 long。 / Sum 1 through 10 with for and compute 5! with while.
        {
            System.out.println("Q13");
            int sum = 0;
            for (int i = 1; __Q13_01__; i++) {
                sum __Q13_02__ i;
            }
            long factorial = 1L;
            int n = 5;
            while (__Q13_03__) {
                factorial __Q13_04__ n;
                n__Q13_05__;
            }
            System.out.println("Sum=" + sum + " Factorial=" + factorial);
        }

        // Q14 进阶：二维成绩 / Extra: 2D scores
        // 每行一人，用该行 length 计算总分和平均分。 / Each row is one student; use its length for the mean.
        {
            System.out.println("Q14");
            int[][] marks = {{95,82,76},{67,60,59},{100,88,90}};
            for (int i = 0; __Q14_01__; i++) {
                int total = 0;
                for (int j = 0; __Q14_02__; j++) {
                    total += __Q14_03__;
                }
                System.out.printf("Student%d Total=%d Average=%.2f%n", i + 1, total,
                        __Q14_04__);
            }
        }

        // Q15 进阶：引用与副本 / Extra: alias and copy
        // alias 与 original 共享数组，copy 单独分配并逐项复制。 / alias shares original; allocate copy separately and copy each element.
        {
            System.out.println("Q15");
            int[] original = {95,82,76};
            int[] alias = __Q15_01__;
            int[] copy = __Q15_02__;
            for (int i = 0; i < original.length; i++) {
                copy[i] = __Q15_03__;
            }
            alias[0] = 0;
            System.out.printf("Original=%d Alias=%d Copy=%d Same=%b%n",
                    original[0], alias[0], copy[0], __Q15_04__);
        }

        // Q16 进阶：折半查找 / Extra: binary search
        // 给定数组已升序，找 88，未找到输出 -1。 / Search the sorted array for 88; output -1 if absent.
        {
            System.out.println("Q16");
            int[] sorted = {59,60,67,76,82,88,95,100};
            int key = 88, low = 0, high = sorted.length - 1, found = -1;
            while (__Q16_01__) {
                int mid = __Q16_02__;
                if (sorted[mid] == key) { found = mid; break; }
                else if (key < sorted[mid]) high = __Q16_03__;
                else low = __Q16_04__;
            }
            System.out.println("SearchIndex=" + found);
        }

        // Q17 挑战：短路与自增 / Challenge: short-circuiting
        // 填 || 和 &&，先预测 checks 值。 / Fill || and &&, and predict checks before running.
        {
            System.out.println("Q17");
            int checks = 0;
            boolean first = true __Q17_01__ (++checks > 0);
            boolean second = false __Q17_02__ (++checks > 0);
            int a = 2;
            int before = __Q17_03__;
            int after = __Q17_04__;
            System.out.printf("First=%b Second=%b Checks=%d Before=%d After=%d Final=%d%n",
                    first, second, checks, before, after, a);
        }

        // Q18 挑战：位运算与类型判断 / Challenge: bits and type checks
        // a=5(0101)，b=3(0011)，补按位与、或、异或、取反和类型判断。 / Complete bitwise AND, OR, XOR, complement and an array type check.
        {
            System.out.println("Q18");
            int a = 5, b = 3;
            System.out.printf("And=%d Or=%d Xor=%d Not=%d Array=%b%n",
                    a __Q18_01__ b, a __Q18_02__ b, a __Q18_03__ b, __Q18_04__a, scores __Q18_05__ int[]);
        }
    }
}
