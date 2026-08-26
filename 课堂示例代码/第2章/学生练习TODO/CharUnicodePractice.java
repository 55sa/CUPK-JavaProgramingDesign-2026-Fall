public class CharUnicodePractice {
    public static void main(String[] args) {
        // TODO 1：把 letter 改成你的姓名拼音首字母。
        // TODO 1: Change letter to the first letter of your name in Pinyin.
        char letter = '?';

        // TODO 2：定义一个汉字字符和一个 Unicode 转义字符。
        // TODO 2: Define one Chinese character and one Unicode escape character.
        char chinese = '?';
        char symbol = '\u003F';

        System.out.println(letter + " 的编码：" + (int) letter);
        System.out.println(chinese + " 的编码：" + (int) chinese);
        System.out.println("Unicode 字符：" + symbol);
    }
}
