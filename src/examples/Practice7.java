package examples;

public class Practice7 {
    public static void main(String[] args){
        int a = 120;
        //byte b = a + 10; //ERROR тк большой тип int записывают в маленькую переменную byte без сужения
        byte c = (byte)(a + 10); // все хорошо, есть сужение. запишутся первые 8 бит числа 130 = -126
        //byte d = a + 1; //ERROR тк большой тип int записывают в маленькую переменную byte без сужения
    }
}
