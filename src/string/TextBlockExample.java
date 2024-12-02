package string;

//три двойные кавычки позволяют работать с многострочными строками
//без необходимости вручную добавлять символ переноса строки

public class TextBlockExample {
    public static void main(String[] args) {
        // Многострочная строка (Text Block)
        String text = """
                       This is a text block.
                       It spans multiple lines.
                       No need to escape newline characters.
                       """;

        System.out.println(text);
    }
}
