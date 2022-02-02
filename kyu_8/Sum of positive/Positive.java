public class Positive {
    public static void main(String[] args) {

    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0)
                sum += i;
        }
        return sum;
    }
}
