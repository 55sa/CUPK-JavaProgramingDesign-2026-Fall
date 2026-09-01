class TypePerson {
}

class TypeStudent extends TypePerson {
    void study() {
        System.out.println("Student is studying");
    }
}

public class InstanceofDemo {
    public static void main(String[] args) {
        TypePerson person = new TypeStudent();

        System.out.println("person instanceof TypePerson: " + (person instanceof TypePerson));
        System.out.println("person instanceof TypeStudent: " + (person instanceof TypeStudent));

        if (person instanceof TypeStudent) {
            TypeStudent student = (TypeStudent) person;
            student.study();
        }
    }
}
