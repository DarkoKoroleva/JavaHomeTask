package formatter;

public class FormatSpecifiersExample {
    public static void main(String[] args) {
        boolean boolValue = true;
        char charValue = 'A';
        int intValue = 12345;
        double doubleValue = 12345.6789;
        Object obj = new Object();

        System.out.printf("Boolean value: %b%n", boolValue);  // true

        System.out.printf("Character value: %c%n", charValue);  // A

        System.out.printf("Integer value: %d%n", intValue);  // 12345

        System.out.printf("Hash code: %h%n", obj);  // 1a2b3c (пример хэш-кода)

        System.out.printf("Exponential value: %e%n", doubleValue);  // 1.234568e+04
    }
}

