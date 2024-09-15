package examples;

public class Practice6 {
    public static void main(String[] args){
        long l = 1L;
        int i = (int) l; // сузит long до int

        int bigNum = 1000000;
        byte smallNum = (byte) bigNum; //=64, тк в тип byte помешается только первые 8 бит числа bigNum
        System.out.println(smallNum);

        int x = 65537; //за пределами диапазона char -> произошло переполнение
        char c = (char) x ;
        System.out.println(c);
    }

}
