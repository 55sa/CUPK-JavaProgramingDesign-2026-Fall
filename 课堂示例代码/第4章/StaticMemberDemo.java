class StaticStudent {
    static int count;
    String name;

    StaticStudent(String name) {
        this.name = name;
        count++;
    }

    void show() {
        System.out.println(name + "，当前共创建 " + count + " 个对象");
    }

    static void showCount() {
        System.out.println("对象总数：" + count);
    }
}

public class StaticMemberDemo {
    public static void main(String[] args) {
        StaticStudent first = new StaticStudent("Li Ming");
        StaticStudent second = new StaticStudent("Wang Fang");
        first.show();
        second.show();
        StaticStudent.showCount();
    }
}
