package switchCase;

//Поддерживаемые типы для переменной в switch:
//Примитивные целочисленные типы (byte, short, int, char)
//Перечисления (enum)
//Класс String
//Обёртки для чисел и символов (Byte, Short, Integer, Character)
//Тип var, если значение, назначенное переменной, является совместимым с одним из вышеперечисленных типов.

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

        var value = "Hello";
        switch (value) {
            case "Hello":
                System.out.println("Привет");
                break;
            case "Goodbye":
                System.out.println("Прощай");
                break;
            default:
                System.out.println("Неизвестное слово");
        }

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

        int i = 0;
        int value2 = 2;

        switch (value2) {
            case 1:
                i = 1;
                break; // Выход из switch после выполнения case 1
            case 2:
                i = 2; // Установка i = 2
                // Отсутствует break, поэтому выполнение продолжится в следующем case
            case 3:
                i = 3; // Перезапись i, теперь i = 3
                break; // Выход из switch
        }
        System.out.println("i = " + i);
    }
}
