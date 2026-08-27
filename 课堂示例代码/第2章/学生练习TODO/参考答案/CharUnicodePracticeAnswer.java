public class CharUnicodePracticeAnswer {
    public static void main(String[] args) {
        char letter = 'Z';
        char chinese = '中';
        char symbol = '\u2605';

        System.out.println(letter + " 的编码：" + (int) letter);
        System.out.println(chinese + " 的编码：" + (int) chinese);
        System.out.println("Unicode 字符：" + symbol);
    }
}
