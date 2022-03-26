package main.java.kyu_7;

import java.util.Arrays;

public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    public static String highAndLow(String numbers) {
        // Code here or
        int[] numArr = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numArr);
        return numArr[numArr.length - 1] + " " + numArr[0];
    }
}
