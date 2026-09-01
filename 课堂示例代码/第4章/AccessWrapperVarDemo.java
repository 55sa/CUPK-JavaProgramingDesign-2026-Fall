class EncapsulatedScore {
    private int value;

    public void setValue(int value) {
        if (value >= 0 && value <= 100) {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }
}

public class AccessWrapperVarDemo {
    public static void main(String[] args) {
        EncapsulatedScore score = new EncapsulatedScore();
        score.setValue(92);

        Integer boxed = Integer.valueOf(score.getValue());
        var message = "包装后的成绩：" + boxed.intValue();
        System.out.println(message);
    }
}
