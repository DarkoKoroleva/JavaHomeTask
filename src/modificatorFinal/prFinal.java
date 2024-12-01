package modificatorFinal;

class Superclass {
    public final void finalMethod() {
        System.out.println("This is a final method in the superclass.");
    }
}

class Subclass extends Superclass {
    // Попытка переопределить final-метод вызовет ошибку компиляции
    // @Override
    // public void finalMethod() { // Ошибка: Cannot override the final method from Superclass
    //     System.out.println("Trying to override the final method.");
    // }
}

public class prFinal {
    public static void main(String[] args) {
        Superclass obj = new Superclass();
        obj.finalMethod(); // Вызов метода из суперкласса
    }
}
