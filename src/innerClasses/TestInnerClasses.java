package innerClasses;

class OuterClass {
     // Внутренний класс с модификатором private
    private class PrivateInner {
        void display() {
            System.out.println("Private Inner Class");
        }
    }

    // Внутренний класс с модификатором package-private (по умолчанию)
    class PackagePrivateInner {
        void display() {
            System.out.println("Package-Private Inner Class");
        }
    }

    // Внутренний класс с модификатором protected
    protected class ProtectedInner {
        void display() {
            System.out.println("Protected Inner Class");
        }
    }

    // Внутренний класс с модификатором public
    public class PublicInner {
        void display() {
            System.out.println("Public Inner Class");
        }
    }

    public void testInnerClasses() {
        // Доступ ко всем внутренним классам из внешнего класса
        PrivateInner privateInner = new PrivateInner();
        privateInner.display();

        PackagePrivateInner packagePrivateInner = new PackagePrivateInner();
        packagePrivateInner.display();

        ProtectedInner protectedInner = new ProtectedInner();
        protectedInner.display();

        PublicInner publicInner = new PublicInner();
        publicInner.display();

    }
}

public class TestInnerClasses {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // Доступ к public внутреннему классу
        OuterClass.PublicInner publicInner = outer.new PublicInner();
        publicInner.display();

        // Доступ к package-private классу (в том же пакете)
        OuterClass.PackagePrivateInner packagePrivateInner = outer.new PackagePrivateInner();
        packagePrivateInner.display();

        // Доступ к protected классу (в том же пакете)
        OuterClass.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.display();

        // PrivateInner недоступен:
        // OuterClass.PrivateInner privateInner = outer.new PrivateInner(); // Ошибка компиляции
    }
}

