class FinalParentPractice {
    final void rule() {
        System.out.println("This rule cannot be overridden");
    }
}

class FinalChildPractice extends FinalParentPractice {
    // TODO 1: 尝试重写 rule()，观察错误后将代码注释掉。
    // TODO 2: 再增加一个普通方法 show()。
}

public class FinalMethodPractice {
    public static void main(String[] args) {
        // TODO 3: 创建子类对象并调用 rule() 和 show()。
    }
}
