interface PrintablePracticeAnswer {
    void print();
}

class DocumentPracticeAnswer implements PrintablePracticeAnswer {
    private String text;

    DocumentPracticeAnswer(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }
}

public class PrintableInterfacePracticeAnswer {
    public static void main(String[] args) {
        PrintablePracticeAnswer item = new DocumentPracticeAnswer("Hello interface");
        item.print();
    }
}
