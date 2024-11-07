package accessRights.practice11;

public class A {
    public int publicField = 1;
    protected int protectedField = 2;
    int packagePrivateField = 3; // По умолчанию
    private int privateField = 4;

    public void showFields() {
        System.out.println("publicField: " + publicField);
        System.out.println("protectedField: " + protectedField);
        System.out.println("packagePrivateField: " + packagePrivateField);
        System.out.println("privateField: " + privateField);
    }
}
