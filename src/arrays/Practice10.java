package arrays;

import java.util.Arrays;

public class Practice10 {

    //PRACTICE1
    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5};
        int a2[] = {6,7,8,9,10};
        a1 = a2; //both variables a1 and a2 will point to the same array {6, 7, 8, 9, 10}.



        //PRACTICE2
        int[] array = {3, 1, 4, 5, 2};

        System.out.println("Array as string: " + Arrays.toString(array));
        // Array as string: [3, 1, 4, 5, 2]

        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        //Sorted array: [1, 2, 3, 4, 5]

        int index = Arrays.binarySearch(array, 4);
        System.out.println("Index of element 4: " + index);
        //Index of element 4: 3

        int[] array2 = {1, 2, 3, 4, 5};
        boolean areEqual = Arrays.equals(array, array2);
        System.out.println("Arrays are equal: " + areEqual);
        //Arrays are equal: true

    }
}
