interface AveragePracticeAnswer {
    double average(double[] values);
}

class ArithmeticAveragePracticeAnswer implements AveragePracticeAnswer {
    @Override
    public double average(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}

class GeometricAveragePracticeAnswer implements AveragePracticeAnswer {
    @Override
    public double average(double[] values) {
        double product = 1;
        for (double value : values) {
            product *= value;
        }
        return Math.pow(product, 1.0 / values.length);
    }
}

public class InterfaceAveragePracticeAnswer {
    public static void main(String[] args) {
        double[] values = {1, 4, 16};
        AveragePracticeAnswer computer = new ArithmeticAveragePracticeAnswer();
        System.out.printf("算术平均值：%.2f%n", computer.average(values));
        computer = new GeometricAveragePracticeAnswer();
        System.out.printf("几何平均值：%.2f%n", computer.average(values));
    }
}
