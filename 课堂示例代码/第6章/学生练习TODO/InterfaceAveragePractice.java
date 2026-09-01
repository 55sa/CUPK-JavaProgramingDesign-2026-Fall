interface AveragePractice {
    double average(double[] values);
}

class ArithmeticAveragePractice implements AveragePractice {
    @Override
    public double average(double[] values) {
        // TODO 1: 计算并返回算术平均值。
        return 0;
    }
}

class GeometricAveragePractice implements AveragePractice {
    @Override
    public double average(double[] values) {
        // TODO 2: 计算并返回几何平均值。
        return 0;
    }
}

public class InterfaceAveragePractice {
    public static void main(String[] args) {
        double[] values = {1, 4, 16};
        // TODO 3: 用 AveragePractice 引用依次保存两个实现类对象并输出结果。
    }
}
