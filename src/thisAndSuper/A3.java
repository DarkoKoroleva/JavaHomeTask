package thisAndSuper;

class A3 {
    int a;
    int b;
    int c;
    int z;

    public A3() {
        this(0, 0, 0);
    }

    public A3(int a) {
        this(a, 0, 0);
    }

    public A3(int a, int b) {
        this(a, b, 0);
    }

    public A3(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1; // Общая логика
    }
}
