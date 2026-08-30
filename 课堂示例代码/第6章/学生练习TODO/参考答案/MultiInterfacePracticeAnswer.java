interface ChargeablePracticeAnswer {
    void charge();
}

interface ConnectablePracticeAnswer {
    void connect();
}

class SmartDevicePracticeAnswer implements ChargeablePracticeAnswer, ConnectablePracticeAnswer {
    @Override
    public void charge() {
        System.out.println("Charging");
    }

    @Override
    public void connect() {
        System.out.println("Connected");
    }
}

public class MultiInterfacePracticeAnswer {
    public static void main(String[] args) {
        SmartDevicePracticeAnswer device = new SmartDevicePracticeAnswer();
        device.charge();
        device.connect();
    }
}
