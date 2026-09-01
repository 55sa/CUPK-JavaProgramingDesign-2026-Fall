interface CallbackShowMessage {
    void showTrademark();

    default void outputStart() {
        System.out.println("---- 开始显示商标 ----");
    }
}

class CallbackTv implements CallbackShowMessage {
    @Override
    public void showTrademark() {
        System.out.println("电视机商标：海尔");
    }
}

class CallbackPc implements CallbackShowMessage {
    @Override
    public void showTrademark() {
        System.out.println("计算机商标：联想");
    }
}

public class InterfaceCallbackDemo {
    public static void main(String[] args) {
        CallbackShowMessage message = new CallbackTv();
        message.outputStart();
        message.showTrademark();

        message = new CallbackPc();
        message.outputStart();
        message.showTrademark();
    }
}
