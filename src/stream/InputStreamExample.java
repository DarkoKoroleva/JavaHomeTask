package stream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("stream/example.txt")) {
            int data;
            // Чтение данных побайтово
            while ((data = fis.read()) != -1) {
                System.out.print((char) data); // Выводим символы, считанные из файла
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
