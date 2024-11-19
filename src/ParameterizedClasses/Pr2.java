package ParameterizedClasses;

import java.util.ArrayList;
import java.util.List;

public class Pr2 {
    public static void printNumbers(List<? extends Number> numbers) {
        for (Number num : numbers) {
            System.out.println(num);
        }
    }
    public static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
    }


    public static void main(String[] arg){
        List<Integer> intList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        printNumbers(intList);    // can pass a List<Integer>
        printNumbers(doubleList); // can pass a  List<Double>

        List<? extends Number> numbers = new ArrayList<Integer>();
        // numbers.add(10); // Error compilation: the specific type is unknown
        Number num = numbers.get(0);

        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        addNumbers(numberList);  // can pass a List<Number>
        addNumbers(objectList);  // can pass a List<Object>

        List<? super Integer> list = new ArrayList<Number>();
        list.add(5);  // correct, 5 — Integer
        // Integer num = list.get(0); // Error compilation: the specific type is unknown
        Object obj = list.get(0); // correct
    }
}
