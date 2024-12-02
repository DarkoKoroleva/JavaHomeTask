package exception;

class Ex1 extends Exception {
    public Ex1(String message) {
        super(message);
    }
}

class Ex2 extends Ex1 {
    public Ex2(String message) {
        super(message);
    }
}

class Ex3 extends Ex2 {
    public Ex3(String message) {
        super(message);
    }
}

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            generateException(3); // Генерация исключения Ex3
        } catch (Ex1 e) { // аналогично (Ex1 | Ex2 | Ex3 e) - все исключения ловятся по родителю
            System.out.println("Caught an exception: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        try {
            generateException(2); // Генерация исключения Ex2
        } catch (Ex3 e) {
            System.out.println("Caught Ex3: " + e.getMessage());
        } catch (Ex2 e) {
            System.out.println("Caught Ex2: " + e.getMessage());
        } catch (Ex1 e) {
            System.out.println("Caught Ex1: " + e.getMessage());
        }
    }

    // Метод, который генерирует исключения по уровню
    public static void generateException(int level) throws Ex1, Ex2, Ex3 {
        switch (level) {
            case 1:
                throw new Ex1("Exception of type Ex1");
            case 2:
                throw new Ex2("Exception of type Ex2");
            case 3:
                throw new Ex3("Exception of type Ex3");
            default:
                System.out.println("No exception generated.");
        }
    }
}
//Что означает использование final при в данном объявлении?
//
//        try {
//        ...
//        } catch (final Exception e) {
//        ...
//        }
//final в объявлении переменной e в блоке catch означает,
// что переменная e является константой и её значение нельзя изменить после присвоения.


