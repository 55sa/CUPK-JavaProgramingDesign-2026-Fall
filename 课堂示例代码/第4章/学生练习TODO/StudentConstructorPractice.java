class ConstructorStudentModel {
    String name;
    int age;

    // TODO 1：无参构造方法把 name 设为 Unknown、age 设为 0。
    // TODO 2：有参构造方法使用 this 初始化两个成员变量。

    void introduce() {
        System.out.println(name + ", " + age);
    }
}

public class StudentConstructorPractice {
    public static void main(String[] args) {
        // TODO：分别使用两个构造方法创建对象并调用 introduce。
    }
}
