package formatter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//Метод flush используется для принудительного сброса содержимого буфера в его поток вывода (файл, консоль и тд)

public class FlushExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"))) {
            writer.write("Hello, ");
            writer.write("world!");

            // Принудительно сбрасываем данные из буфера в файл
            writer.flush();

            // Данные теперь записаны в файл
            System.out.println("Data flushed to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

