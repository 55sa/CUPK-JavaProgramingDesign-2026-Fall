public class UnicodeDemo {
    public static void main(String[] args) {
        char letter = 'A';
        char chinese = '好';
        char symbol = '\u2605';

        System.out.println(letter + " 的 Unicode 编码是 " + (int) letter);
        System.out.println(chinese + " 的 Unicode 编码是 " + (int) chinese);
        System.out.println(symbol + " 的 Unicode 编码是 " + (int) symbol);

        int code = 66;
        System.out.println(code + " 对应的字符是 " + (char) code);
    }
}

