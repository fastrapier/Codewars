package main.java.kyu_8;

import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {
    public static void main(String[] args) {
        int[] arr = null;
        System.out.println(sum(arr));

    }

    public static int sum(int[] numbers) {
        if (numbers != null && numbers.length > 1) {
            Arrays.sort(numbers);
            int sum = 0;
            for (int i = 1; i < numbers.length - 1; i++) {
                sum += numbers[i];
            }
            return sum;
        }
        return 0;
    }
}
