package wrapperClasses;

public class Practice1 {
    public static void main(String[] args) {
        String decimal = "1020";
        String hexa = "0X0F";
        String octal = "0717";

        Integer number = Integer.decode(decimal);
        System.out.println("Decimal [" + decimal + "] = " + number);

        number = Integer.decode(hexa);
        System.out.println("Hexa [" + hexa + "] = " + number);

        number = Integer.decode(octal);
        System.out.println("Octal [" + octal + "] = " + number);
    }
}
