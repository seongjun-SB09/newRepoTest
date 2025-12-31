package org.example.Head01_javaProgrammingStart;

import java.util.Arrays;

public class DeepCopyArray {
    public static void main(String[] args) {
        int [] original = {1, 2, 3};
        int [] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy [i] = original [i];
        }
        copy[0] = 100;
        System.out.println(original[0]);

        int [] original2 = {4, 5, 6};
        int [] copy2 = Arrays.copyOf(original2, original2.length);

        copy2[2] = 500;
        System.out.println("original2: " + Arrays.toString(original2));
        System.out.println("copy2: " + Arrays.toString(copy2));
    }
}
