package modificatorFinal;

// Финальный класс
final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}

// Попытка унаследовать финальный класс
class Subclass extends FinalClass { // Ошибка компиляции: Cannot inherit from final class
    // Нельзя добавить какую-либо логику, так как наследование запрещено
}

public class Main {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display(); // Вызов метода финального класса
    }
}

