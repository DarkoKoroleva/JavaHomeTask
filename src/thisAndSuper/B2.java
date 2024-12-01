package thisAndSuper;

class A2 {
    int a;
    void method() {
    //...
    }

}

class B2 extends A2 {
  //...
}

class C2 extends B2 {
  //...
    void method() {
    //...
        int a = super.a;
        super.method();
    }
  //...
}

//Метод method() класса C2 вызывается у объекта C2.
//Внутри метода method() класса C2:
//Локальная переменная a инициализируется значением поля a из класса A через super.a.
//Вызывается метод method() суперкласса A2 через super.method().
//Метод method() из класса A2 выполняется
