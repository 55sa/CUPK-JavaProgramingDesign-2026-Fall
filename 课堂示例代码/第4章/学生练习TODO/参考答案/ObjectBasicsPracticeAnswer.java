// 第四章：对象基础填空 / Chapter 4: Object Basics
// 搜索 TODO，在提示下方替换对应编号空白。 / Search TODO and fill the matching blank below.
// 使用 PracticeChecker 逐题测试，不用先编译未完成的练习。 / Use PracticeChecker to grade tasks independently.
// 每题两个普通类：模型类描述对象，TaskXX 类的 main 演示使用对象。 / Each task has a model class and a TaskXX main.
public class ObjectBasicsPracticeAnswer {
    public static void main(String[] args) {
        Task01.main(args);
        Task02.main(args);
        Task03.main(args);
        Task04.main(args);
        Task05.main(args);
        Task06.main(args);
        Task07.main(args);
        Task08.main(args);
        Task09.main(args);
        Task10.main(args);
        Task11.main(args);
        Task12.main(args);
        Task13.main(args);
        Task14.main(args);
        Task15.main(args);
        Task16.main(args);
        Task17.main(args);
        Task18.main(args);
        Task19.main(args);
        Task20.main(args);
        Task21.main(args);
        Task22.main(args);
        Task23.main(args);
        Task24.main(args);
        Task25.main(args);
        Task26.main(args);
        Task27.main(args);
        Task28.main(args);
        Task29.main(args);
        Task30.main(args);
    }
}

// Q01 创建第一个对象 / Create an object
// 用 new 创建 Student 对象并输出默认分数。 / Create a Student object with new and print its default score.
// BEGIN Q01
class Student01 { int score; }
class Task01 {
    public static void main(String[] args) {
        Student01 s = new Student01();
        System.out.println(s.score);
    }
}
// END Q01

// Q02 设置对象属性 / Set a field
// 把学生分数设为 80，再读取该属性。 / Set the score to 80 and read it.
// BEGIN Q02
class Student02 { int score; }
class Task02 {
    public static void main(String[] args) {
        Student02 s = new Student02();
        s.score = 80;
        System.out.println(s.score);
    }
}
// END Q02

// Q03 设置对象姓名 / Set a name
// 用成员变量 name 保存并输出 Li。 / Store and print Li using name.
// BEGIN Q03
class Student03 { String name; }
class Task03 {
    public static void main(String[] args) {
        Student03 s = new Student03();
        s.name = "Li";
        System.out.println(s.name);
    }
}
// END Q03

// Q04 两个独立对象 / Two independent objects
// 创建第二个新对象，分别保存 60 和 90。 / Create a second object and store 60 and 90 independently.
// BEGIN Q04
class Student04 { int score; }
class Task04 {
    public static void main(String[] args) {
        Student04 a = new Student04();
        Student04 b = new Student04();
        a.score = 60;
        b.score = 90;
        System.out.println(a.score);
        System.out.println(b.score);
    }
}
// END Q04

// Q05 对象属性相互独立 / Independent fields
// 修改 a 的 age 为 20，b 的 age 保持 18。 / Change a.age to 20 while b.age stays 18.
// BEGIN Q05
class Person05 { int age = 18; }
class Task05 {
    public static void main(String[] args) {
        Person05 a = new Person05();
        Person05 b = new Person05();
        a.age = 20;
        System.out.println(a.age);
        System.out.println(b.age);
    }
}
// END Q05

// Q06 调用无参方法 / Call a method
// 通过对象调用 sayHello 方法。 / Call sayHello on the object.
// BEGIN Q06
class Student06 {
    void sayHello() { System.out.println("Hello"); }
}
class Task06 {
    public static void main(String[] args) {
        Student06 s = new Student06();
        s.sayHello();
    }
}
// END Q06

// Q07 方法修改对象 / Change state with a method
// birthday 每次把 age 增加 1，调用两次。 / birthday increases age by one; call it twice.
// BEGIN Q07
class Person07 {
    int age = 18;
    void birthday() { age++; }
}
class Task07 {
    public static void main(String[] args) {
        Person07 p = new Person07();
        p.birthday();
        p.birthday();
        System.out.println(p.age);
    }
}
// END Q07

// Q08 方法返回属性 / Return a field
// getScore 返回当前对象的 score。 / getScore returns this object's score.
// BEGIN Q08
class Student08 {
    int score = 75;
    int getScore() { return score; }
}
class Task08 {
    public static void main(String[] args) {
        Student08 s = new Student08();
        System.out.println(s.getScore());
    }
}
// END Q08

// Q09 方法接收参数 / Pass an argument
// setScore 接收 value 并保存到 score。 / Store value in score.
// BEGIN Q09
class Student09 {
    int score;
    void setScore(int value) { score = value; }
}
class Task09 {
    public static void main(String[] args) {
        Student09 s = new Student09();
        int newScore = 85;
        s.setScore(newScore);
        System.out.println(s.score);
    }
}
// END Q09

// Q10 this 区分同名变量 / Use this
// 参数和成员都叫 score，用 this 指定成员。 / Both are named score; use this for the field.
// BEGIN Q10
class Student10 {
    int score;
    void setScore(int score) { this.score = score; }
}
class Task10 {
    public static void main(String[] args) {
        Student10 s = new Student10();
        s.setScore(82);
        System.out.println(s.score);
    }
}
// END Q10

// Q11 无参构造方法 / No-argument constructor
// 构造方法与类同名，创建时把 score 设为 60。 / The constructor matches the class name and initializes score to 60.
// BEGIN Q11
class Student11 {
    int score;
    Student11() { score = 60; }
}
class Task11 {
    public static void main(String[] args) {
        Student11 s = new Student11();
        System.out.println(s.score);
    }
}
// END Q11

// Q12 带参构造方法 / Parameterized constructor
// 创建对象时传入 initialScore。 / Pass initialScore when creating the object.
// BEGIN Q12
class Student12 {
    int score;
    Student12(int value) { score = value; }
}
class Task12 {
    public static void main(String[] args) {
        int initialScore = 88;
        Student12 s = new Student12(initialScore);
        System.out.println(s.score);
    }
}
// END Q12

// Q13 构造方法中的 this / this in a constructor
// 把构造参数 name 保存到当前对象。 / Save the name parameter in the current object.
// BEGIN Q13
class Student13 {
    String name;
    Student13(String name) { this.name = name; }
}
class Task13 {
    public static void main(String[] args) {
        Student13 s = new Student13("Li");
        System.out.println(s.name);
    }
}
// END Q13

// Q14 两个构造参数 / Two constructor arguments
// 按姓名、分数的顺序传入变量。 / Pass the name and score variables in that order.
// BEGIN Q14
class Student14 {
    String name; int score;
    Student14(String n, int s) { name = n; score = s; }
}
class Task14 {
    public static void main(String[] args) {
        String name = "Li";
        int score = 90;
        Student14 s = new Student14(name, score);
        System.out.println(s.name);
        System.out.println(s.score);
    }
}
// END Q14

// Q15 矩形对象面积 / Rectangle area
// area 返回宽乘高，结果由对象属性计算。 / Return width times height from the fields.
// BEGIN Q15
class Rectangle15 {
    int width, height;
    Rectangle15(int w, int h) { width = w; height = h; }
    int area() { return width * height; }
}
class Task15 {
    public static void main(String[] args) {
        Rectangle15 r = new Rectangle15(4, 3);
        System.out.println(r.area());
    }
}
// END Q15

// Q16 两个对象调用同一方法 / Same method, different objects
// 分别创建边长 3 和 5 的正方形，输出各自面积。 / Create squares with sides 3 and 5 and print their areas.
// BEGIN Q16
class Square16 {
    int side;
    Square16(int side) { this.side = side; }
    int area() { return side * side; }
}
class Task16 {
    public static void main(String[] args) {
        Square16 a = new Square16(3);
        Square16 b = new Square16(5);
        System.out.println(a.area());
        System.out.println(b.area());
    }
}
// END Q16

// Q17 引用赋值 / Assign a reference
// alias 和 original 指向同一对象，修改 alias 后读取 original。 / Make alias refer to original, update alias, then read original.
// BEGIN Q17
class Student17 { int score = 60; }
class Task17 {
    public static void main(String[] args) {
        Student17 original = new Student17();
        Student17 alias = original;
        alias.score = 95;
        System.out.println(original.score);
    }
}
// END Q17

// Q18 比较同一对象的引用 / Compare aliases
// a 与 b 引用同一对象，用 == 比较。 / Compare a and b, which refer to the same object.
// BEGIN Q18
class Student18 { int score = 60; }
class Task18 {
    public static void main(String[] args) {
        Student18 a = new Student18();
        Student18 b = a;
        System.out.println(a == b);
    }
}
// END Q18

// Q19 相同属性不是同一对象 / Same values, different objects
// 创建两个 score 都为 60 的对象，比较引用。 / Create two objects with score 60 and compare references.
// BEGIN Q19
class Student19 { int score = 60; }
class Task19 {
    public static void main(String[] args) {
        Student19 a = new Student19();
        Student19 b = new Student19();
        System.out.println(a == b);
        System.out.println(a.score == b.score);
    }
}
// END Q19

// Q20 null 与对象 / null and an object
// 先声明 null 引用，再创建对象。 / Start with a null reference, then create the object.
// BEGIN Q20
class Student20 { int score = 60; }
class Task20 {
    public static void main(String[] args) {
        Student20 s = null;
        System.out.println(s == null);
        s = new Student20();
        System.out.println(s.score);
    }
}
// END Q20

// Q21 private 与 getter / Private field and getter
// 分数字段设为 private，通过 getter 读取。 / Make the score private and read it through the getter.
// BEGIN Q21
class Student21 {
    private int score = 80;
    int getScore() { return score; }
}
class Task21 {
    public static void main(String[] args) {
        Student21 s = new Student21();
        System.out.println(s.getScore());
    }
}
// END Q21

// Q22 setter 更新私有字段 / Update a private field
// 通过 setScore 修改字段，再由 getter 读取。 / Update through setScore and read through getScore.
// BEGIN Q22
class Student22 {
    private int score;
    void setScore(int score) { this.score = score; }
    int getScore() { return score; }
}
class Task22 {
    public static void main(String[] args) {
        Student22 s = new Student22();
        s.setScore(91);
        System.out.println(s.getScore());
    }
}
// END Q22

// Q23 setter 检查范围 / Validate a setter
// 只接收 0–100，非法值保留旧分数。 / Accept 0–100 and keep the previous score for invalid input.
// BEGIN Q23
class Student23 {
    private int score = 60;
    void setScore(int value) {
        if (value >= 0 && value <= 100) { score = value; }
    }
    int getScore() { return score; }
}
class Task23 {
    public static void main(String[] args) {
        Student23 s = new Student23();
        s.setScore(105);
        System.out.println(s.getScore());
    }
}
// END Q23

// Q24 对象作为参数 / An object parameter
// Teacher 的 addPoint 接收 Student，给它加 1 分。 / Teacher.addPoint receives a Student and adds one point.
// BEGIN Q24
class Student24 { int score = 60; }
class Teacher24 {
    void addPoint(Student24 student) { student.score++; }
}
class Task24 {
    public static void main(String[] args) {
        Student24 s = new Student24();
        Teacher24 teacher = new Teacher24();
        teacher.addPoint(s);
        System.out.println(s.score);
    }
}
// END Q24

// Q25 重新指定引用 / Reassign a reference
// b 改为引用新对象后，a 仍引用旧对象。 / After b points to a new object, a still refers to the original.
// BEGIN Q25
class Student25 { int score = 60; }
class Task25 {
    public static void main(String[] args) {
        Student25 a = new Student25();
        Student25 b = a;
        b = new Student25();
        b.score = 90;
        System.out.println(a.score);
        System.out.println(b.score);
    }
}
// END Q25

// Q26 static 共享计数 / A shared static counter
// count 属于类，每创建一个对象加 1，创建两个对象。 / count belongs to the class and increases for each of two objects.
// BEGIN Q26
class Student26 {
    static int count = 0;
    Student26() { count++; }
}
class Task26 {
    public static void main(String[] args) {
        Student26 a = new Student26();
        Student26 b = new Student26();
        System.out.println(Student26.count);
    }
}
// END Q26

// Q27 对象数组的元素 / Object array elements
// 数组分配后元素为 null，给第一个位置创建对象。 / Array slots start as null; create an object in the first slot.
// BEGIN Q27
class Student27 { int score = 80; }
class Task27 {
    public static void main(String[] args) {
        Student27[] students = new Student27[2];
        System.out.println(students[0] == null);
        students[0] = new Student27();
        System.out.println(students[0].score);
    }
}
// END Q27

// Q28 遍历对象数组 / Traverse an object array
// 对每个 Student 调用 getScore，打印 70 和 90。 / Call getScore on each Student to print 70 and 90.
// BEGIN Q28
class Student28 {
    int score;
    Student28(int value) { score = value; }
    int getScore() { return score; }
}
class Task28 {
    public static void main(String[] args) {
        Student28[] students = {new Student28(70), new Student28(90)};
        for (Student28 s : students) {
            System.out.println(s.getScore());
        }
    }
}
// END Q28

// Q29 对象组合 / Object composition
// Radio 保存 Battery 引用，输出电池电量。 / Radio stores a Battery reference; print its power.
// BEGIN Q29
class Battery29 { int power = 100; }
class Radio29 {
    Battery29 battery;
    Radio29(Battery29 b) { battery = b; }
    int getPower() { return battery.power; }
}
class Task29 {
    public static void main(String[] args) {
        Battery29 battery = new Battery29();
        Radio29 radio = new Radio29(battery);
        System.out.println(radio.getPower());
    }
}
// END Q29

// Q30 小综合：学生信息卡 / Mini task: student card
// 构造对象、调用方法，按姓名和分数输出信息卡。 / Construct an object and call its method to print the name and score.
// BEGIN Q30
class Student30 {
    private String name;
    private int score;
    Student30(String name, int score) {
        this.name = name;
        this.score = score;
    }
    void show() {
        System.out.println(name);
        System.out.println(score);
    }
}
class Task30 {
    public static void main(String[] args) {
        String name = "Li";
        int score = 86;
        Student30 s = new Student30(name, score);
        s.show();
    }
}
// END Q30
