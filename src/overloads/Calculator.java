package overloads;

public class Calculator {

    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public int multiply(int... numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 1, 2, 3: " + calc.sum(1, 2, 3)); // 6
        System.out.println("Product of 1, 2, 3: " + calc.multiply(1, 2, 3)); // 6

        System.out.println("Sum of 5 and 10: " + calc.sum(5, 10)); // 15
    }
}
