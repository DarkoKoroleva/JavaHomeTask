package accessRights.practice11;

public class B {
    public void display() {
        A a = new A();
        System.out.println("Accessing fields from class B:");
        System.out.println("publicField: " + a.publicField);           // Доступен
        System.out.println("protectedField: " + a.protectedField);     // Доступен
        System.out.println("packagePrivateField: " + a.packagePrivateField); // Доступен
        // System.out.println("privateField: " + a.privateField);       // Ошибка! Недоступен
    }
}