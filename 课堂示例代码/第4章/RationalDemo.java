class DemoRational {
    private long numerator;
    private long denominator;

    DemoRational(long numerator, long denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("分母不能为 0");
        }
        long divisor = gcd(Math.abs(numerator), Math.abs(denominator));
        this.numerator = numerator / divisor;
        this.denominator = denominator / divisor;
        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    DemoRational add(DemoRational other) {
        return new DemoRational(
                numerator * other.denominator + other.numerator * denominator,
                denominator * other.denominator);
    }

    DemoRational subtract(DemoRational other) {
        return new DemoRational(
                numerator * other.denominator - other.numerator * denominator,
                denominator * other.denominator);
    }

    DemoRational multiply(DemoRational other) {
        return new DemoRational(numerator * other.numerator, denominator * other.denominator);
    }

    DemoRational divide(DemoRational other) {
        return new DemoRational(numerator * other.denominator, denominator * other.numerator);
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}

public class RationalDemo {
    public static void main(String[] args) {
        DemoRational first = new DemoRational(1, 5);
        DemoRational second = new DemoRational(3, 2);
        System.out.println(first + " + " + second + " = " + first.add(second));
        System.out.println(first + " - " + second + " = " + first.subtract(second));
        System.out.println(first + " * " + second + " = " + first.multiply(second));
        System.out.println(first + " / " + second + " = " + first.divide(second));
    }
}
