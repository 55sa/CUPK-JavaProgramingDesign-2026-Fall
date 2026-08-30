interface PaymentMethodPracticeAnswer {
    void pay(double amount);
}

class CashPaymentPracticeAnswer implements PaymentMethodPracticeAnswer {
    @Override
    public void pay(double amount) {
        System.out.println("Cash payment: " + amount);
    }
}

class CardPaymentPracticeAnswer implements PaymentMethodPracticeAnswer {
    @Override
    public void pay(double amount) {
        System.out.println("Card payment: " + amount);
    }
}

public class PaymentStrategyPracticeAnswer {
    static void checkout(PaymentMethodPracticeAnswer strategy, double amount) {
        strategy.pay(amount);
    }

    public static void main(String[] args) {
        checkout(new CashPaymentPracticeAnswer(), 99.5);
        checkout(new CardPaymentPracticeAnswer(), 199.0);
    }
}
