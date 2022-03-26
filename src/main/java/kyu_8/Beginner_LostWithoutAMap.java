package main.java.kyu_8;

import java.util.Arrays;

public class Beginner_LostWithoutAMap {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[]{1, 1, 1, 1, 1, 1})));
    }

    public static int[] map(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i] * 2;
        }
        return arr2;
    }
}
