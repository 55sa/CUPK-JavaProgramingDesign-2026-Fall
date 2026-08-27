class BatteryPracticeModelAnswer {
    int power;
    BatteryPracticeModelAnswer(int power) { this.power = power; }
}

class RadioPracticeModelAnswer {
    private BatteryPracticeModelAnswer battery;
    RadioPracticeModelAnswer(BatteryPracticeModelAnswer battery) { this.battery = battery; }
    void play() {
        if (battery.power >= 10) {
            battery.power -= 10;
            System.out.println("播放中，电量：" + battery.power);
        } else System.out.println("电量不足");
    }
}

public class BatteryRadioPracticeAnswer {
    public static void main(String[] args) {
        RadioPracticeModelAnswer radio = new RadioPracticeModelAnswer(new BatteryPracticeModelAnswer(20));
        radio.play(); radio.play(); radio.play();
    }
}
