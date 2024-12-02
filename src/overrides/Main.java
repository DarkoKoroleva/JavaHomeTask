package overrides;

class Superclass {
    public void display() {
        System.out.println("Superclass display method");
    }
}

class Subclass extends Superclass {
    public void display() {// Переопределение
        System.out.println("Subclass display method");
    }

    //ПРИМЕР КОГДА @override ПОМОГАЕТ НАЙТИ ОШИБКУ
    @Override
    public void disply() { // ошибка компиляции: неверная аннотация, метод не переопределяет метод суперкласса
        System.out.println("Subclass display method");
    }
}

public class Main {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.display(); // Вызов метода из наследника
    }
}
