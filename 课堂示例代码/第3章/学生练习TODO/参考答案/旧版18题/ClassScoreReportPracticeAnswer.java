/**
 * 班级成绩分析工作坊 / Class Score Report Workshop
 * 18 道填空题，01-12 主线，13-18 进阶。 / 18 scaffolded tasks; core 01-12, extras 13-18.
 * 教师参考答案：已填好全部空白，可直接运行。
 * Teacher answer: all blanks are completed and ready to run.
 * 题目之间独立，共用固定 scores；不用键盘输入。
 * Tasks are independent and share fixed scores; no keyboard input.
 */
public class ClassScoreReportPracticeAnswer {
    public static void main(String[] args) {
        int[] scores = {95, 82, -1, 67, 100, 59, 76, 88, 105, 60};
        System.out.println("Class Score Report Workshop");

        // Q01 基础类型与报告信息 / Primitive types
        // 按给定值补齐类型或常量后缀；班级 A，容量 40，科目 3。 / Fill types or literal suffixes; class A, capacity 40, 3 subjects.
        {
            System.out.println("Q01");
            byte subjectCount = 3;
            short capacity = 40;
            long reportId = 20260906001L;
            float target = 75.5F;
            char classCode = 'A';
            boolean published = false;
            System.out.printf("%d %d %d %.1f %c %b%n", subjectCount, capacity, reportId, target, classCode, published);
        }

        // Q02 字符与类型转换 / Characters and casting
        // 将 A 转为整数编码，将 78.375 截断为 int。 / Convert A to its numeric code and truncate 78.375 to int.
        {
            System.out.println("Q02");
            char letter = 'A';
            int code = (int) letter;
            double average = 78.375;
            int whole = (int) average;
            letter++;
            System.out.println("Code=" + code + " Whole=" + whole + " Next=" + letter);
        }

        // Q03 算术与分组 / Arithmetic and grouping
        // 8 人每 3 人一组，计算完整组数、余数，以及 (8+2)*3。 / Group 8 students in threes and evaluate (8+2)*3.
        {
            System.out.println("Q03");
            int students = 8, groupSize = 3;
            int groups = students / groupSize;
            int remaining = students % groupSize;
            int seats = (students + 2) * groupSize;
            System.out.printf("Groups=%d Remaining=%d Seats=%d%n", groups, remaining, seats);
        }

        // Q04 数组与倒序 / Arrays and reverse traversal
        // 从最后一个下标向前遍历原始 scores，包含无效值。 / Traverse the original scores backwards, including invalid values.
        {
            System.out.println("Q04");
            System.out.println("Length=" + scores.length);
            System.out.print("Reverse:");
            for (int i = scores.length - 1; i >= 0; i--) {
                System.out.print(" " + scores[i]);
            }
            System.out.println();
        }

        // Q05 过滤与 continue / Filtering with continue
        // 有效范围 0–100，统计有效和无效数量以及有效总分。 / Count valid and invalid scores and sum only valid values.
        {
            System.out.println("Q05");
            int valid = 0, invalid = 0, total = 0;
            for (int i = 0; i < scores.length; i++) {
                int score = scores[i];
                if (score < 0 || score > 100) {
                    invalid++;
                    continue;
                }
                valid++;
                total += score;
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
            if (count > 0) {
                double average = (double) total / count;
                System.out.printf("Integer=%d Average=%.2f%n", total / count, average);
            } else {
                System.out.println("No valid scores");
            }
            boolean targetMet = count > 0 && (double) total / count >= 75.5;
            System.out.println("TargetMet=" + targetMet);
        }

        // Q07 及格率与极值 / Pass rate and extrema
        // 只处理有效成绩，>=60 及格，零记录不输出极值。 / Process valid scores only; >=60 passes; hide extrema for zero records.
        {
            System.out.println("Q07");
            int count = 0, passed = 0, min = 101, max = -1;
            for (int score : scores) {
                if (score < 0 || score > 100) continue;
                count++;
                if (score >= 60) passed++;
                if (score < min) min = score;
                if (score > max) max = score;
            }
            if (count > 0) {
                double rate = passed * 100.0 / count;
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
                if (score >= 90) grade = 'A';
                else if (score >= 80) grade = 'B';
                else if (score >= 70) grade = 'C';
                else if (score >= 60) grade = 'D';
                else grade = 'F';
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
                switch (grade) {
                    case 'A': comment = "Excellent"; break;
                    case 'B': comment = "Good"; break;
                    case 'C': comment = "Fair"; break;
                    case 'D': comment = "Pass"; break;
                    case 'F': comment = "Retry"; break;
                    default: comment = "Unknown";
                }
                System.out.println(grade + ":" + comment);
            }
        }

        // Q10 while 查找满分 / Find a perfect score
        // 保存首个 100 的下标，未找到保留 -1。 / Save the first index of 100, or keep -1.
        {
            System.out.println("Q10");
            int index = 0, found = -1;
            while (index < scores.length) {
                if (scores[index] == 100) {
                    found = index;
                    break;
                }
                index++;
            }
            System.out.println("PerfectIndex=" + found);
        }

        // Q11 do-while 补测 / Retry simulation
        // 52 分起，每次加 3，至少执行一次，达到 60 停止。 / Start at 52, add 3 per attempt, and stop at 60 or above.
        {
            System.out.println("Q11");
            int retryScore = 52, attempts = 0;
            do {
                retryScore += 3;
                attempts++;
            } while (retryScore < 60);
            boolean passed = retryScore >= 60;
            System.out.printf("Score=%d Attempts=%d Retry=%b%n", retryScore, attempts, !passed);
        }

        // Q12 等级分布图 / Grade histogram
        // 计数数组下标 0..4 对应 A/B/C/D/F，嵌套循环打印星号。 / Counters 0..4 represent A/B/C/D/F; print stars using nested loops.
        {
            System.out.println("Q12");
            int[] counts = new int[5];
            char[] labels = {'A', 'B', 'C', 'D', 'F'};
            for (int score : scores) {
                if (score < 0 || score > 100) continue;
                if (score >= 90) counts[0]++;
                else if (score >= 80) counts[1]++;
                else if (score >= 70) counts[2]++;
                else if (score >= 60) counts[3]++;
                else counts[4]++;
            }
            for (int i = 0; i < counts.length; i++) {
                System.out.print(labels[i] + ":");
                for (int j = 0; j < counts[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        // Q13 进阶：学习积分 / Extra: study points
        // for 累加 1 到 10，while 计算 5!，累积乘积用 long。 / Sum 1 through 10 with for and compute 5! with while.
        {
            System.out.println("Q13");
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            long factorial = 1L;
            int n = 5;
            while (n > 0) {
                factorial *= n;
                n--;
            }
            System.out.println("Sum=" + sum + " Factorial=" + factorial);
        }

        // Q14 进阶：二维成绩 / Extra: 2D scores
        // 每行一人，用该行 length 计算总分和平均分。 / Each row is one student; use its length for the mean.
        {
            System.out.println("Q14");
            int[][] marks = {{95,82,76},{67,60,59},{100,88,90}};
            for (int i = 0; i < marks.length; i++) {
                int total = 0;
                for (int j = 0; j < marks[i].length; j++) {
                    total += marks[i][j];
                }
                System.out.printf("Student%d Total=%d Average=%.2f%n", i + 1, total,
                        (double) total / marks[i].length);
            }
        }

        // Q15 进阶：引用与副本 / Extra: alias and copy
        // alias 与 original 共享数组，copy 单独分配并逐项复制。 / alias shares original; allocate copy separately and copy each element.
        {
            System.out.println("Q15");
            int[] original = {95,82,76};
            int[] alias = original;
            int[] copy = new int[original.length];
            for (int i = 0; i < original.length; i++) {
                copy[i] = original[i];
            }
            alias[0] = 0;
            System.out.printf("Original=%d Alias=%d Copy=%d Same=%b%n",
                    original[0], alias[0], copy[0], original == alias);
        }

        // Q16 进阶：折半查找 / Extra: binary search
        // 给定数组已升序，找 88，未找到输出 -1。 / Search the sorted array for 88; output -1 if absent.
        {
            System.out.println("Q16");
            int[] sorted = {59,60,67,76,82,88,95,100};
            int key = 88, low = 0, high = sorted.length - 1, found = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (sorted[mid] == key) { found = mid; break; }
                else if (key < sorted[mid]) high = mid - 1;
                else low = mid + 1;
            }
            System.out.println("SearchIndex=" + found);
        }

        // Q17 挑战：短路与自增 / Challenge: short-circuiting
        // 填 || 和 &&，先预测 checks 值。 / Fill || and &&, and predict checks before running.
        {
            System.out.println("Q17");
            int checks = 0;
            boolean first = true || (++checks > 0);
            boolean second = false && (++checks > 0);
            int a = 2;
            int before = ++a;
            int after = a++;
            System.out.printf("First=%b Second=%b Checks=%d Before=%d After=%d Final=%d%n",
                    first, second, checks, before, after, a);
        }

        // Q18 挑战：位运算与类型判断 / Challenge: bits and type checks
        // a=5(0101)，b=3(0011)，补按位与、或、异或、取反和类型判断。 / Complete bitwise AND, OR, XOR, complement and an array type check.
        {
            System.out.println("Q18");
            int a = 5, b = 3;
            System.out.printf("And=%d Or=%d Xor=%d Not=%d Array=%b%n",
                    a & b, a | b, a ^ b, ~a, scores instanceof int[]);
        }
    }
}
