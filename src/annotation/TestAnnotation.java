package annotation;

import java.util.ArrayList;
import java.util.List;

class Parent {
    void display() {
        System.out.println("Parent display method");
    }
    @Deprecated
    void oldMethod() {
        System.out.println("This method is deprecated.");
    }

    void newMethod() {
        System.out.println("Use this new method instead.");
    }

    @SuppressWarnings("unchecked") // Подавление предупреждений о неявных приведениях типов
    public void addRawTypeExample() {
        List list = new ArrayList(); // Использование raw type (без дженериков)
        list.add("String");
        list.add(123); // Компилятор обычно выдаст предупреждение о типах

        System.out.println(list);
    }
}

class Child extends Parent {
    @Override
    void display() { // Компилятор проверяет, что метод действительно переопределяет метод суперкласса.
        System.out.println("Child display method");
    }

    // Ошибка компиляции, если имя или сигнатура метода неверны:
    // @Override
    // void dispaly() { // Ошибка: метод с таким именем отсутствует в суперклассе
    //     System.out.println("Incorrect method");
    // }
}

public class TestAnnotation {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display(); // Вывод: "Child display method"
        obj.oldMethod(); // Компилятор выдаст предупреждение
        obj.newMethod(); // Современный метод
        obj.addRawTypeExample();
    }
}
