package exception;

public class Ex2 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        int[] array = {1, 2, 3};
        System.out.println(array[5]); // Приводит к ArrayIndexOutOfBoundsException
    }
}
