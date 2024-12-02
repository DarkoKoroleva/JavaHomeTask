package stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String data = "abcdefghijklmnop";
            // Запись данных побайтово
            for (char c : data.toCharArray()) {
                fos.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

