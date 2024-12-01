package thisAndSuper;

class Superclass {
    protected String name;

    public Superclass(String name) {
        this.name = name;
        System.out.println("Superclass constructor called.");
    }

    public void display() {
        System.out.println("Superclass method: Name is " + name);
    }
}

class Subclass extends Superclass {
    private int id;

    public Subclass(String name, int id) {
        super(name); // Обращение к конструктору суперкласса
        this.id = id;
        System.out.println("Subclass constructor called.");
    }

    public void display() {
        super.display(); // Доступ к методу суперкласса
        System.out.println("Subclass method: ID is " + id);
    }

    public void printSuperclassName() {
        System.out.println("Accessing superclass field: Name is " + super.name); // Доступ к полю суперкласса
    }
}

public class Main1 {
    public static void main(String[] args) {
        Subclass obj = new Subclass("John", 101);

        obj.display();

        // Доступ к полю суперкласса через метод подкласса
        obj.printSuperclassName();
    }
}

