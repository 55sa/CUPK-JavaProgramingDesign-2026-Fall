abstract class SimPractice {
    private String number;

    void setNumber(String number) {
        // TODO 1: 保存手机号码。
    }

    String getNumber() {
        // TODO 2: 返回手机号码。
        return "";
    }

    abstract String getCompanyName();
}

class MobileSimPracticeCard extends SimPractice {
    @Override
    String getCompanyName() {
        // TODO 3: 返回“中国移动”。
        return "";
    }
}

class UnicomSimPracticeCard extends SimPractice {
    @Override
    String getCompanyName() {
        // TODO 4: 返回“中国联通”。
        return "";
    }
}

class MobilePhonePractice {
    private SimPractice card;

    void useSim(SimPractice card) {
        // TODO 5: 更换手机中的 SIM 卡。
    }

    void showMessage() {
        // TODO 6: 输出运营商名称和号码。
    }
}

public class MobileSimPractice {
    public static void main(String[] args) {
        // TODO 7: 创建移动卡和联通卡并设置号码。
        // TODO 8: 让同一部手机依次使用两张卡并显示信息。
    }
}
