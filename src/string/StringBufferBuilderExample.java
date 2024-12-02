package string;

public class StringBufferBuilderExample {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(", World!");
        System.out.println("1. sb1 after append: " + sb1); // Hello, World!

        sb1.insert(5, " Beautiful");
        System.out.println("2. sb1 after insert: " + sb1); // Hello Beautiful, World!

        sb1.delete(5, 15);
        System.out.println("3. sb1 after delete: " + sb1); // Hello, World!

        sb1.replace(7, 12, "Java");
        System.out.println("4. sb1 after replace: " + sb1); // Hello, Java!

        sb1.reverse();
        System.out.println("5. sb1 after reverse: " + sb1); // !avaJ ,olleH

        System.out.println("6. Length of sb1: " + sb1.length()); // 13

        char ch = sb1.charAt(0);
        System.out.println("7. First character of sb1: " + ch); // !

        StringBuilder sb2 = new StringBuilder("Welcome");
        sb2.append(" to Java");
        System.out.println("8. sb2 after append: " + sb2); // Welcome to Java

        String str = sb2.toString();
        System.out.println("9. String version of sb2: " + str); // Welcome to Java

        StringBuffer sb3 = new StringBuffer();
        System.out.println("10. Initial capacity of sb3: " + sb3.capacity()); // 16 (по умолчанию)
        sb3.append("This is a test");
        System.out.println("10. Capacity of sb3 after append: " + sb3.capacity()); // 34 (увеличение)

        String string = "Hello, World!";
        StringBuffer sbuffer = new StringBuffer(string); // Используем конструктор StringBuffer
        System.out.println("String to StringBuffer: " + sbuffer);

        StringBuilder sbuilder = new StringBuilder(string); // Используем конструктор StringBuilder
        System.out.println("String to StringBuilder: " + sbuilder);

        StringBuffer sbuf = new StringBuffer("StringBuffer");
        String strFromBuffer = sbuf.toString();
        System.out.println("StringBuffer to String: " + strFromBuffer);

        StringBuilder sbuild = new StringBuilder("StringBuilder");
        String strFromBuilder = sbuild.toString();
        System.out.println("StringBuilder to String: " + strFromBuilder);

        StringBuilder sbuilder2 = new StringBuilder("StringBuilder to StringBuffer");
        StringBuffer sb = new StringBuffer(sbuilder2);
        System.out.println("StringBuilder to StringBuffer: " + sb);

        StringBuffer sbuffer2 = new StringBuffer("StringBuffer to StringBuilder");
        StringBuilder sbuilder22 = new StringBuilder(sbuffer2);
        System.out.println("StringBuffer to StringBuilder: " + sbuilder22);
    }
}

