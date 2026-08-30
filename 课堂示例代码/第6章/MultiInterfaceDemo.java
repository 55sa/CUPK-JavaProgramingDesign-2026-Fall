interface ChargeableDevice {
    void charge();
}

interface ConnectableDevice {
    void connect();
}

class SmartDeviceDemo implements ChargeableDevice, ConnectableDevice {
    @Override
    public void charge() {
        System.out.println("Charging");
    }

    @Override
    public void connect() {
        System.out.println("Connected to Wi-Fi");
    }
}

public class MultiInterfaceDemo {
    public static void main(String[] args) {
        SmartDeviceDemo device = new SmartDeviceDemo();
        device.charge();
        device.connect();
    }
}
