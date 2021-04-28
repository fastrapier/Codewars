package EnglishBeggars;

import java.util.Arrays;

public class EnglishBeggars {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(beggars(test, 3)));
    }

    public static int[] beggars(int[] values, int n) {
        // show me the code!
        if (n == 0) {
            return new int[]{};
        }
        int[] answer = new int[n];
        int step = 0;

        for (int gold : values) {
            if (step == n) {
                step = 0;
            }
            if (step <= n) {
                answer[step] += gold;
                step++;
            }
        }
        return answer;
    }
}
