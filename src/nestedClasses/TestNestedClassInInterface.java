package nestedClasses;

interface OuterInterface {
    void interfaceMethod();

    // Вложенный класс в интерфейс
    class NestedClass {
        public void displayMessage() {
            System.out.println("Message from NestedClass inside OuterInterface.");
        }
    }
}


public class TestNestedClassInInterface {
    public static void main(String[] args) {
        OuterInterface.NestedClass nested = new OuterInterface.NestedClass();
        nested.displayMessage();
    }
}
