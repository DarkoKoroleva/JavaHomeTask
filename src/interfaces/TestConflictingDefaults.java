package interfaces;
//
//Если класс реализует два интерфейса, содержащих одинаковые default методы,
//то возникает конфликт.
//Компилятор выдаст ошибку, так как не может определить, какую реализацию использовать.
//Для разрешения конфликта необходимо переопределить метод в классе, явно указав, какую реализацию использовать.

interface InterfaceA {
    default void defaultMethod() {
        System.out.println("Default method in InterfaceA");
    }
}

interface InterfaceB {
    default void defaultMethod() {
        System.out.println("Default method in InterfaceB");
    }
}

// Класс, реализующий оба интерфейса
class MyClass2 implements InterfaceA, InterfaceB {
    // Компилятор потребует явного переопределения defaultMethod
    @Override
    public void defaultMethod() {
        // Разрешение конфликта
        InterfaceA.super.defaultMethod();
        InterfaceB.super.defaultMethod();
        System.out.println("Custom implementation in MyClass");
    }
}

public class TestConflictingDefaults {
    public static void main(String[] args) {
        MyClass2 myClass = new MyClass2();
        myClass.defaultMethod();
    }
}

