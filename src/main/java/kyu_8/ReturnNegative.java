package main.java.kyu_8;

public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(9));
    }

    public static int makeNegative(final int x) {
        if (x < 0) {
            return x;
        } else if (x == 0) {
            return 0;
        } else
            return -1 * x;
        //return -Math.abs(x) is better;
    }
}
