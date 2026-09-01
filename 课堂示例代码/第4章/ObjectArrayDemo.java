class ArrayStudent {
    private String name;
    private int score;

    ArrayStudent(String name, int score) {
        this.name = name;
        this.score = score;
    }

    void show() {
        System.out.println(name + "：" + score);
    }
}

public class ObjectArrayDemo {
    public static void main(String[] args) {
        ArrayStudent[] students = new ArrayStudent[3];
        students[0] = new ArrayStudent("Li", 88);
        students[1] = new ArrayStudent("Wang", 93);
        students[2] = new ArrayStudent("Zhao", 81);

        for (ArrayStudent student : students) {
            student.show();
        }
    }
}
