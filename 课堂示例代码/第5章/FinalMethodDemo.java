class FinalParent {
    final void rule() {
        System.out.println("final 方法只能继承，不能重写");
    }
}

class FinalChild extends FinalParent {
    void ownMethod() {
        System.out.println("子类可以增加自己的方法");
    }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        FinalChild child = new FinalChild();
        child.rule();
        child.ownMethod();
    }
}
