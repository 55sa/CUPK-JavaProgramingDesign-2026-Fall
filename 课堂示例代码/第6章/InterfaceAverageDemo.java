interface AverageComputer {
    double average(double[] values);
}

class ArithmeticAverage implements AverageComputer {
    @Override
    public double average(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}

class GeometricAverage implements AverageComputer {
    @Override
    public double average(double[] values) {
        double product = 1;
        for (double value : values) {
            product *= value;
        }
        return Math.pow(product, 1.0 / values.length);
    }
}

public class InterfaceAverageDemo {
    public static void main(String[] args) {
        double[] values = {1, 4, 16};
        AverageComputer computer = new ArithmeticAverage();
        System.out.printf("算术平均值：%.2f%n", computer.average(values));

        computer = new GeometricAverage();
        System.out.printf("几何平均值：%.2f%n", computer.average(values));
    }
}
