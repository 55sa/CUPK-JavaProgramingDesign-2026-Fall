public class TypeConversionDemo {
    public static void main(String[] args) {
        int count = 100;
        double automatic = count;

        double price = 34.89;
        int forced = (int) price;

        int large = 130;
        byte narrowed = (byte) large;

        System.out.println("int 自动转换为 double：" + automatic);
        System.out.println("double 强制转换为 int：" + forced);
        System.out.println("130 强制转换为 byte：" + narrowed);
    }
}

