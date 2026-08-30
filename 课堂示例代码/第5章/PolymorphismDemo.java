class PolyAnimal {
    void speak() {
        System.out.println("Animal sound");
    }
}

class PolyDog extends PolyAnimal {
    @Override
    void speak() {
        System.out.println("Woof");
    }
}

class PolyCat extends PolyAnimal {
    @Override
    void speak() {
        System.out.println("Meow");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        PolyAnimal[] animals = {new PolyDog(), new PolyCat()};
        for (PolyAnimal animal : animals) {
            animal.speak();
        }
    }
}
