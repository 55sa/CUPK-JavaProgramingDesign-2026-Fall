class BatteryPracticeModel {
    int power;

    BatteryPracticeModel(int power) {
        this.power = power;
    }
}

class RadioPracticeModel {
    private BatteryPracticeModel battery;

    // TODO：构造方法接收 BatteryPracticeModel。

    void play() {
        // TODO：电量至少 10 时消耗 10，否则输出“电量不足”。
    }
}

public class BatteryRadioPractice {
    public static void main(String[] args) {
        // TODO：创建电量为 20 的电池与收音机，并连续播放三次。
    }
}
