class HidingGoods {
    double weight = 12.5;

    void showWeight() {
        System.out.println("父类 weight：" + weight);
    }
}

class HidingCheapGoods extends HidingGoods {
    int weight = 8;

    void showBothWeights() {
        System.out.println("子类 weight：" + weight);
        System.out.println("super.weight：" + super.weight);
    }
}

public class MemberHidingDemo {
    public static void main(String[] args) {
        HidingCheapGoods goods = new HidingCheapGoods();
        goods.showBothWeights();
        goods.showWeight();
    }
}
