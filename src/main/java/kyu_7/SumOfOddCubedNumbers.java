package main.java.kyu_7;

public class SumOfOddCubedNumbers {
    public static void main(String[] args) {
        System.out.println(cubeOdd(new int[]{1, 2, 3, 4}));
    }

    public static int cubeOdd(int arr[]) {
        int sum = 0;
        for (int j : arr) {
            int temp = (int) Math.pow(j, 3);
            if (temp % 2 != 0) {
                sum += temp;
            }
        }

        return sum;
    }
}
