class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("我叫" + name + "，今年" + age + "岁。");
    }
}

public class PeopleDemo {
    public static void main(String[] args) {
        Person student = new Person();
        student.name = "小明";
        student.age = 18;
        student.introduce();
    }
}

