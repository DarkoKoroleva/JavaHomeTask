package switchCase;

public class Practice1 {
    public static void main(String[] args) {
        int i1 = 2;
        switch (i1) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2"); // print 2
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("idk");
        }

        Integer i2 = i1;
        switch (i1) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2"); //print 2
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("idk");
        }
        //Аналогично для всех остальных примитивных типов данных и их классов-оберток

        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Today is MONDAY");
                break;
            case TUESDAY:
                System.out.println("Today is TUESDAY");
                break;
            default:
                System.out.println("Today isn't monday/tuesday");
        }

        // если будет отсутствовать break, то будут выполняться команды в других кейсах,
        // пока они не закончатся/встретится брейк
    }
}
