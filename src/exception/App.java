package exception;

public class App {
    final static int START_COUNTER;
    static {
        START_COUNTER = Integer.parseInt("Y-"); //нельзя преобразовать Y- в число -> выброс исключения,
                                                   // которое нигде не ловится, программа экстренно завершается
    }
    public static void main(String[] args) {
        System.out.println("Hello");              // не успеет напечататься
    }
}
