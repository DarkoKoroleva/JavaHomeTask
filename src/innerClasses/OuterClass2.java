package innerClasses;
//Внутренний класс имеет доступ ко всем полям и методам внешнего класса,
//включая приватные, если он не является статическим. Доступ возможен благодаря тому,
//что внутренний класс "связан" с объектом внешнего класса. Однако для статических вложенных классов
//доступ ограничен только к статическим полям и методам внешнего класса.
//Спецификаторы доступа для полей и методов внешнего класса не влияют на доступ из внутреннего класса,
//поскольку внутренний класс всегда находится внутри области видимости внешнего класса.


public class OuterClass2 {
    private int privateField = 10;
    int defaultField = 20;
    protected int protectedField = 30;
    public int publicField = 40;

    private void privateMethod() {
        System.out.println("Private method in OuterClass");
    }

    public void publicMethod() {
        System.out.println("Public method in OuterClass");
    }

    // Нестатический внутренний класс
    class InnerClass {
        public void displayFields() {
            // Доступ ко всем полям внешнего класса
            System.out.println("Private Field: " + privateField);
            System.out.println("Default Field: " + defaultField);
            System.out.println("Protected Field: " + protectedField);
            System.out.println("Public Field: " + publicField);

            // Доступ к методам внешнего класса
            privateMethod();
            publicMethod();
        }
    }
}

class TestInnerClass2 {
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.displayFields();
    }
}
