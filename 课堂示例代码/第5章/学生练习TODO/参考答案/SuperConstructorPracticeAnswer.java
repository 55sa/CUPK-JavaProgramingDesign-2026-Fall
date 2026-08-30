class SuperVehiclePracticeAnswer {
    protected String brand;

    SuperVehiclePracticeAnswer(String brand) {
        this.brand = brand;
    }
}

class SuperCarPracticeAnswer extends SuperVehiclePracticeAnswer {
    private String model;

    SuperCarPracticeAnswer(String brand, String model) {
        super(brand);
        this.model = model;
    }

    void showInfo() {
        System.out.println(brand + " " + model);
    }
}

public class SuperConstructorPracticeAnswer {
    public static void main(String[] args) {
        new SuperCarPracticeAnswer("BYD", "Seal").showInfo();
    }
}
