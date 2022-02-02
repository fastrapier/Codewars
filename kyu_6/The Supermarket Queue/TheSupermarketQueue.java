import java.util.Arrays;

public class TheSupermarketQueue {
    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[]{5, 3, 4}, 1));
        // should return 12
        // because when there is 1 till, the total time is just the sum of the times
        System.out.println(solveSuperMarketQueue(new int[]{10, 2, 3, 3}, 2));
        // should return 10
        // because here n=2 and the 2nd, 3rd, and 4th people in the
        // queue finish before the 1st person has finished.
        System.out.println(solveSuperMarketQueue(new int[]{2, 3, 10}, 2));
        // should return 12
        System.out.println(solveSuperMarketQueue(new int[]{2, 2, 3, 3, 4, 4}, 2));
        System.out.println(solveSuperMarketQueue(new int[]{1, 2, 3, 4, 5}, 1));
        System.out.println(solveSuperMarketQueue(new int[]{5, 6, 5, 2, 3, 1}, 3));
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
       int[] result = new int[n];
        for (int i = 0; i < customers.length; i++) {
            result[0] += customers[i];
            Arrays.sort(result);
        }
        return result[n-1];
    }
}
