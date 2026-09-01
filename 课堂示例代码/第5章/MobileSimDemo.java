abstract class DemoSim {
    private String number;

    void setNumber(String number) {
        this.number = number;
    }

    String getNumber() {
        return number;
    }

    abstract String getCompanyName();
}

class DemoMobileSim extends DemoSim {
    @Override
    String getCompanyName() {
        return "中国移动";
    }
}

class DemoUnicomSim extends DemoSim {
    @Override
    String getCompanyName() {
        return "中国联通";
    }
}

class DemoMobilePhone {
    private DemoSim card;

    void useSim(DemoSim card) {
        this.card = card;
    }

    void showMessage() {
        System.out.println(card.getCompanyName() + "：" + card.getNumber());
    }
}

public class MobileSimDemo {
    public static void main(String[] args) {
        DemoSim mobile = new DemoMobileSim();
        mobile.setNumber("13800000000");
        DemoSim unicom = new DemoUnicomSim();
        unicom.setNumber("18600000000");

        DemoMobilePhone phone = new DemoMobilePhone();
        phone.useSim(mobile);
        phone.showMessage();
        phone.useSim(unicom);
        phone.showMessage();
    }
}
