class ReferenceBoxModel {
    int value;
}

public class ReferenceSharingPractice {
    public static void main(String[] args) {
        ReferenceBoxModel first = new ReferenceBoxModel();
        ReferenceBoxModel second = new ReferenceBoxModel();
        first.value = 10;
        second.value = 20;

        // TODO 1：让 second 指向 first 的实体。
        // TODO 2：通过 second 修改 value，再输出 first.value 与 second.value。
    }
}
