class BasicPhonePracticeAnswer {
    void call(String number) {
        System.out.println("Calling " + number);
    }
}

class SmartPhonePracticeAnswer extends BasicPhonePracticeAnswer {
    void browse(String url) {
        System.out.println("Opening " + url);
    }
}

public class PhoneInheritancePracticeAnswer {
    public static void main(String[] args) {
        SmartPhonePracticeAnswer phone = new SmartPhonePracticeAnswer();
        phone.call("10086");
        phone.browse("example.com");
    }
}
