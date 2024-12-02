package exception;

//Throwable - Базовый класс для всех ошибок и исключений.
//Error - Используется для критических ошибок, которые обычно не могут быть обработаны.
//Exception - Базовый класс для всех исключений, которые можно обрабатывать.
//IOException - Используется для ошибок ввода/вывода.
//SQLException - Используется для обработки ошибок взаимодействия с базой данных.
//ClassNotFoundException - Возникает, если указанный класс не найден в пути загрузки.
//NullPointerException - Возникает при попытке доступа к члену объекта через null
//и тд

public class ExceptionExample {

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("Age is set to: " + age);
    }

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        try {
            int[] arr = {1, 2, 3};
            int value = arr[5]; // Индекс выходит за пределы массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            setAge(-5); // Передаём некорректное значение
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        try {
            Object obj = "Hello";
            Integer num = (Integer) obj; // Неверное приведение типов
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }

        try {
            String str = null;
            int length = str.length(); // Попытка вызова метода на null
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
