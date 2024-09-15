package conditionalOperators;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        i = (a == 1 ? 1 : (a == 2) ? 2 : 3);
        System.out.println(i);
    }
}
