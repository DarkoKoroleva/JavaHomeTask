package ParameterizedClasses;

import java.util.List;
import java.util.ArrayList;

public class Pr1 {
    public static void main(String[] arg){
        List<String> list = new ArrayList<>();
        if (list instanceof List) {
            System.out.println("list is an instance of List");
        }

        List<String> stringList = new ArrayList<>();
        // if (stringList instanceof List<String>) { // error compilation
        //     System.out.println("Это List<String>");
        // }

        ArrayList<Integer> intList = new ArrayList<>();
        if (intList instanceof List) {
            System.out.println("intList is an instance of List");
        }
        if (intList instanceof ArrayList) {
            System.out.println("intList is an instance of ArrayList");
        }

        List<?> unknownList = new ArrayList<String>();
        if (unknownList instanceof List<?>) {
            System.out.println("unknownList is an instance of List<?>");
        }

        ArrayList<Double> doubleList = new ArrayList<>();
        if (doubleList instanceof List<?>) {
            System.out.println("doubleList is an instance of List<?>");
        }

        List<String> stringList2 = new ArrayList<>();
        if (stringList2 instanceof List) {
            System.out.println("stringList is an instance of raw List");
        }
    }
}
