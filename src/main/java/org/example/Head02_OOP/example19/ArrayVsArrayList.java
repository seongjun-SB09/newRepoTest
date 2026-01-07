package org.example.Head02_OOP.example19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        //array
        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        System.out.println("Array: " + Arrays.toString(array));

        //Arraylist
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        System.out.println("ArrayList: " + list);
        list.remove(Integer.valueOf(10));
        System.out.println("removed 10 -> " + list);
    }
}
