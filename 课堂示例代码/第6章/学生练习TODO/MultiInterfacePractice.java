interface ChargeablePractice {
    void charge();
}

interface ConnectablePractice {
    void connect();
}

class SmartDevicePractice implements ChargeablePractice, ConnectablePractice {
    @Override
    public void charge() {
        // TODO 1: 实现充电功能。
    }

    @Override
    public void connect() {
        // TODO 2: 实现连接功能。
    }
}

public class MultiInterfacePractice {
    public static void main(String[] args) {
        // TODO 3: 创建设备并调用两个接口方法。
    }
}
