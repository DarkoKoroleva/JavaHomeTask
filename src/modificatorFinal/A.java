package modificatorFinal;

public class A {
    public final int a = 1; //1st variant

    public A(int value) {
        this.a = value;  // 2nd
    }

    {
        a = 20; //3rd
    }
}
