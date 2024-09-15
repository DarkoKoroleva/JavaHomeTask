package operators;

public class Main {
    public static void main(String[] args){
        int x = 5;
        int y;

        y = ++x; // x становится 6, y = 6

        x = 5;
        y = x++; // y = 5, x становится 6

        x = 5;
        y = --x; // x становится 4, y = 4

        x = 5;
        y = x--; // y = 5, x становится 4

        int a = 10;
        int b = 20;

        boolean isEqual = (a == b); // false
        boolean isNotEqual = (a != b); // true
        boolean isGreater = (a > b); // false
        boolean isLess = (a < b); // true
        boolean isGreaterOrEqual = (a >= b); // false
        boolean isLessOrEqual = (a <= b); // true

        boolean ternaryOperator = (a == b ? true : false);

        boolean t = true;
        boolean f = false;

        boolean andResult = t && f; // false
        boolean orResult = t || f; // true
        boolean notResult = !t; // false

        int p = 5; // 0101
        int q = 3; // 0011

        int notP = ~p; // 1111 1111 1111 1111 1111 1111 1111 1010 = -6
        int andResult2 = p & q; // 0011 = 3
        int orResult2 = p | q; // 0111 = 7
        int xorResult = p ^ q; // 0100 = 4
        int leftShift = p << 1; // 1010 = 10
        int rightShift = p >> 1; // 0010 = 2

        int r = 10;
        r += 5; // r = 15
        r -= 3; // r = 12
        r *= 2; // r = 24
        r /= 4; // r = 6
        r %= 5; // r = 1

        String str1 = "Hello, ";
        String str2 = "World";
        String result = str1 + str2; // "Hello, World"
        String str3 = null;

        boolean isString = str1 instanceof String; // true
        boolean nullIsString = str3 instanceof String; // false

        int[] numbers = {1, 2, 3, 4, 5}; // просто массив
    }
}
