package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoCloseableExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("stream/example.txt"))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Здесь BufferedReader автоматически закрыт.
    }
}
