class ComparableStudentPracticeItem implements Comparable<ComparableStudentPracticeItem> {
    private String name;
    private int score;

    ComparableStudentPracticeItem(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(ComparableStudentPracticeItem other) {
        // TODO 1: 按 score 从小到大排序。
        return 0;
    }

    @Override
    public String toString() {
        // TODO 2: 返回“姓名: 成绩”。
        return "";
    }
}

public class ComparableStudentPractice {
    public static void main(String[] args) {
        // TODO 3: 创建数组，使用 Arrays.sort() 排序并输出。
    }
}
