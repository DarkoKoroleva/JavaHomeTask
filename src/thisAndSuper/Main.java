package thisAndSuper;

class Parent {
    int x;

    Parent(int x) {
        this.x = x;
    }

    void print() {
        System.out.println("Parent x: " + x);
    }
}

class Child extends Parent {
    int y;

    Child(int x, int y) {
        super(x); // Вызов конструктора родительского класса
        this.y = y; // Инициализация поля текущего класса
    }

    @Override
    void print() {
        super.print(); // Вызов метода родительского класса
        System.out.println("Child y: " + y);
    }

    void testSuper() {
        System.out.println("Super x: " + super.x); // Доступ к полю родительского класса
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child(10, 20);
        child.print(); // Вызов переопределенного метода
        child.testSuper(); // Доступ к полю родительского класса
    }
}

