package thisAndSuper;

class Parent {
    int x;

    Parent(int x) {
        this.x = x; // Использование this для ссылки на текущий объект
    }

    void print() {
        System.out.println("Parent: " + x);
    }
}

class Child extends Parent {
    int y;

    Child(int x, int y) {
        super(x); // Вызов конструктора родительского класса
        this.y = y; // Инициализация поля y текущего объекта
    }

    void print() {
        super.print(); // Вызов метода родительского класса
        System.out.println("Child: " + y);
    }

    void testThis() {
        System.out.println(this); // Вывод текущего объекта
    }
}

