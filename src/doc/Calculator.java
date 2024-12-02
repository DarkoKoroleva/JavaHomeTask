package doc;

/**
 * Калькулятор с базовыми операциями.
 *
 * @author Daria Koroleva
 * @version 1.0
 * @since 2024
 */
public class Calculator {

    /**
     * Складывает два числа.
     *
     * @param a первое число
     * @param b второе число
     * @return сумма чисел
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Делит два числа.
     *
     * @param a делимое
     * @param b делитель
     * @return результат деления
     * @throws ArithmeticException если делитель равен нулю
     */
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль запрещено!");
        }
        return a / b;
    }
}
