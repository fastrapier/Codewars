package PersistentBugger;

import java.util.Arrays;

public class PersistentBugger {
    public static void main(String[] args) {
        System.out.println(persistence(39));
        System.out.println(persistence(4));
        System.out.println(persistence(25));
        System.out.println(persistence(999));

    }

    public static int persistence(long n) {

        int counter = 0;
        while (n / 10 != 0) {
            String[] nums = String.valueOf(n).split("");
            int answer = 1;
            for (String num : nums) {
                answer *= Integer.parseInt(num);
            }
            counter++;
            n = answer;

        }
        return counter;
    }
}

