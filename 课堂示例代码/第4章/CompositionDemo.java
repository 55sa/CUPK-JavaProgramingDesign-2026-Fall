class DemoBattery {
    int power;

    DemoBattery(int power) {
        this.power = power;
    }
}

class DemoRadio {
    private DemoBattery battery;

    DemoRadio(DemoBattery battery) {
        this.battery = battery;
    }

    void play() {
        if (battery.power >= 10) {
            battery.power -= 10;
            System.out.println("播放中，剩余电量：" + battery.power);
        } else {
            System.out.println("电量不足");
        }
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        DemoBattery battery = new DemoBattery(20);
        DemoRadio radio = new DemoRadio(battery);
        radio.play();
        radio.play();
        radio.play();
    }
}
