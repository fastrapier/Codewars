package main.java.kyu_8;

import java.util.Arrays;

public class TotalAmountsOfPoints {

    public static void main(String[] args) {
        System.out.println(points(new String[]
                {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}));
    }

    public static int points(String[] games) {
        int points = 0;
        for (String result : games) {
            int x = result.charAt(0);
            int y = result.charAt(2);
            if (x > y) {
                points += 3;
            }
            if (x == y) {
                points += 1;
            }
//            String[] arr = result.split(":");
//            if (Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])) {
//                points += 3;
//            } else if (Integer.parseInt(arr[0]) < Integer.parseInt(arr[1])) {
//                points += 0;
//            } else if (Integer.parseInt(arr[0]) == Integer.parseInt(arr[1])) {
//                points += 1;
//            }
        }
        return points;
    }
}
