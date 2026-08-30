class SalaryEmployeePracticeAnswer {
    protected double basePay;

    SalaryEmployeePracticeAnswer(double basePay) {
        this.basePay = basePay;
    }

    double salary() {
        return basePay;
    }
}

class SalaryManagerPracticeAnswer extends SalaryEmployeePracticeAnswer {
    private double bonus;

    SalaryManagerPracticeAnswer(double basePay, double bonus) {
        super(basePay);
        this.bonus = bonus;
    }

    @Override
    double salary() {
        return super.salary() + bonus;
    }
}

public class OverrideSalaryPracticeAnswer {
    public static void main(String[] args) {
        System.out.println(new SalaryEmployeePracticeAnswer(6000).salary());
        System.out.println(new SalaryManagerPracticeAnswer(6000, 2000).salary());
    }
}
