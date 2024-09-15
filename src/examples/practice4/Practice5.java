package examples.practice4;

public class Practice5 {
    public static void main(String[] args){
        int a = 5;
        double b = 4.5;
        double result1 = a + b; // Результатом будет double. Java приведет int к double перед сложением
        System.out.println(a + " + " + b + " = " + result1); // 9.5

        int c = 5;
        char d = 'A'; // Код символа 'A' - 65
        int result2 = c + d; // Результатом будет int. Java преобразует char в его числовое представление по кодировке ASCII
        System.out.println(c + " + " + d + " = " + result2); // 70

        float e = 0.5f;
        int f = 2;
        float result3 = e * f; // результатом будет float. Java приведет int к float перед умножением
        System.out.println(e + " * " + f + " = " + result3); // 1.0
    }
}
