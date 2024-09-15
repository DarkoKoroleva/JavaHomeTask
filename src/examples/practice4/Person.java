package examples.practice4;

public class Person {
    String name;
    int age;
    long passport;

    public Person(String name, int age, long passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return name + ", passport=" + passport;
    }
}
