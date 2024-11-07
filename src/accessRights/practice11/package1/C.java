package accessRights.practice11.package1;

import accessRights.practice11.A;

public class C extends A {
    public void display() {
        System.out.println("Accessing fields from class C (subclass of A in another package):");
        System.out.println("publicField: " + publicField);             // Доступен
        System.out.println("protectedField: " + protectedField);       // Доступен через наследование
        // System.out.println("packagePrivateField: " + packagePrivateField); // Ошибка! Недоступен
        // System.out.println("privateField: " + privateField);         // Ошибка! Недоступен
    }
}
