package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("stream/example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Чтение строки за строкой
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

