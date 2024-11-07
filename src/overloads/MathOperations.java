package overloads;

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

}

class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("add(int, int): " + math.add(5, 10)); // Вызов add(int, int)
        System.out.println("add(int, int, int): " + math.add(5, 10, 15)); // Вызов add(int, int, int)
        System.out.println("add(double, double): " + math.add(5.5, 10.5)); // Вызов add(double, double)
    }
}