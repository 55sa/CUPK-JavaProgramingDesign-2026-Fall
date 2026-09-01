class ThisBook {
    private String title;
    private double price;

    ThisBook() {
        this("Untitled", 0.0);
    }

    ThisBook(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void show() {
        System.out.println(this.title + "：" + this.price);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        new ThisBook().show();
        new ThisBook("Java Programming", 59.0).show();
    }
}
