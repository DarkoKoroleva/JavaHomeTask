package interfaces;

interface MyInterface {
    // Абстрактный метод (должен быть реализован в классе)
    void abstractMethod();

    // Неабстрактный метод с реализацией (default метод)
    default void defaultMethod() {
        System.out.println("Default method in MyInterface");
    }

    // Статический метод (с вызовом через имя интерфейса)
    static void staticMethod() {
        System.out.println("Static method in MyInterface");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implemented in MyClass");
    }

    // Mожно переопределить default метод (опционально)
    @Override
    public void defaultMethod() {
        System.out.println("Default method overridden in MyClass");
    }
}

public class TestInterfaceMethods {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Вызов абстрактного метода (через объект класса)
        myClass.abstractMethod();

        // Вызов default метода (через объект класса)
        myClass.defaultMethod();

        // Вызов static метода (через имя интерфейса)
        MyInterface.staticMethod();

        // Нельзя вызвать staticMethod через объект:
        // myClass.staticMethod();
    }
}

