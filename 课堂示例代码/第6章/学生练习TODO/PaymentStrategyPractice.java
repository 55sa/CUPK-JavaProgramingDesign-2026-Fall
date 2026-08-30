interface PaymentMethodPractice {
    void pay(double amount);
}

class CashPaymentPractice implements PaymentMethodPractice {
    @Override
    public void pay(double amount) {
        // TODO 1: 实现现金支付。
    }
}

class CardPaymentPractice implements PaymentMethodPractice {
    @Override
    public void pay(double amount) {
        // TODO 2: 实现银行卡支付。
    }
}

public class PaymentStrategyPractice {
    static void checkout(PaymentMethodPractice strategy, double amount) {
        // TODO 3: 通过接口调用 pay()。
    }

    public static void main(String[] args) {
        // TODO 4: 分别使用两种支付策略。
    }
}
