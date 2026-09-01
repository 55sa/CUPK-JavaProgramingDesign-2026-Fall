class PassingBattery {
    int power = 100;
}

public class ParameterPassingDemo {
    static void changeNumber(int number) {
        number = 99;
    }

    static void useBattery(PassingBattery battery) {
        battery.power -= 10;
    }

    static void replaceBattery(PassingBattery battery) {
        battery = new PassingBattery();
        battery.power = 500;
    }

    public static void main(String[] args) {
        int number = 10;
        changeNumber(number);
        System.out.println("基本类型调用后：" + number);

        PassingBattery battery = new PassingBattery();
        useBattery(battery);
        System.out.println("修改共享实体后：" + battery.power);

        replaceBattery(battery);
        System.out.println("形参改指向后，实参仍指向原实体：" + battery.power);
    }
}
