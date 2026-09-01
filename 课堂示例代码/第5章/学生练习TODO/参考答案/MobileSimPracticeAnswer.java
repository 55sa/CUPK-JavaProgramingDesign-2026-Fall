abstract class SimPracticeAnswer {
    private String number;

    void setNumber(String number) {
        this.number = number;
    }

    String getNumber() {
        return number;
    }

    abstract String getCompanyName();
}

class MobileSimPracticeCardAnswer extends SimPracticeAnswer {
    @Override
    String getCompanyName() {
        return "中国移动";
    }
}

class UnicomSimPracticeCardAnswer extends SimPracticeAnswer {
    @Override
    String getCompanyName() {
        return "中国联通";
    }
}

class MobilePhonePracticeAnswer {
    private SimPracticeAnswer card;

    void useSim(SimPracticeAnswer card) {
        this.card = card;
    }

    void showMessage() {
        System.out.println(card.getCompanyName() + "：" + card.getNumber());
    }
}

public class MobileSimPracticeAnswer {
    public static void main(String[] args) {
        SimPracticeAnswer mobile = new MobileSimPracticeCardAnswer();
        mobile.setNumber("13800000000");
        SimPracticeAnswer unicom = new UnicomSimPracticeCardAnswer();
        unicom.setNumber("18600000000");

        MobilePhonePracticeAnswer phone = new MobilePhonePracticeAnswer();
        phone.useSim(mobile);
        phone.showMessage();
        phone.useSim(unicom);
        phone.showMessage();
    }
}
