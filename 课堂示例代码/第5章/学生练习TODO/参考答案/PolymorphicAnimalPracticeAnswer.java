class AnimalPracticeBaseAnswer {
    void speak() {
        System.out.println("Animal sound");
    }
}

class DogPracticeChildAnswer extends AnimalPracticeBaseAnswer {
    @Override
    void speak() {
        System.out.println("Woof");
    }
}

class CatPracticeChildAnswer extends AnimalPracticeBaseAnswer {
    @Override
    void speak() {
        System.out.println("Meow");
    }
}

public class PolymorphicAnimalPracticeAnswer {
    public static void main(String[] args) {
        AnimalPracticeBaseAnswer[] animals = {
            new DogPracticeChildAnswer(), new CatPracticeChildAnswer()
        };
        for (AnimalPracticeBaseAnswer animal : animals) {
            animal.speak();
        }
    }
}
