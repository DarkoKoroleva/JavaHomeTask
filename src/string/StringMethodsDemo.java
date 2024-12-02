package string;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String anotherStr = "  hello, world!  ";

        System.out.println("1. Length of str: " + str.length()); // 13

        System.out.println("2. Character at index 7: " + str.charAt(7)); // W

        System.out.println("3. Substring from index 7 to 12: " + str.substring(7, 12)); // World

        System.out.println("4. str equals anotherStr: " + str.equals(anotherStr)); // false

        System.out.println("5. str equalsIgnoreCase anotherStr: " + str.equalsIgnoreCase(anotherStr.trim())); // true

        System.out.println("6. Uppercase version of str: " + str.toUpperCase()); // HELLO, WORLD!

        System.out.println("7. Lowercase version of str: " + str.toLowerCase()); // hello, world!

        System.out.println("8. Trimmed anotherStr: '" + anotherStr.trim() + "'"); // 'hello, world!'

        System.out.println("9. Replace 'World' with 'Java': " + str.replace("World", "Java")); // Hello, Java!

        System.out.println("10. Does str contain 'Hello': " + str.contains("Hello")); // true
    }
}

