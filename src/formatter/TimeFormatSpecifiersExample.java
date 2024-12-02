package formatter;

import java.util.Calendar;

public class TimeFormatSpecifiersExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        System.out.printf("Hour (00-23): %tH%n", now); // Например: 14

        System.out.printf("Hour (1-12): %tI%n", now); // Например: 2 (для 14:xx:xx)

        System.out.printf("Minutes: %tM%n", now); // Например: 30

        System.out.printf("Seconds: %tS%n", now); // Например: 45

        System.out.printf("Milliseconds: %tL%n", now); // Например: 123
    }
}
