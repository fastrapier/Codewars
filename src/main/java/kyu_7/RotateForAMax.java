package main.java.kyu_7;

public class RotateForAMax {
    public static void main(String[] args) {
        System.out.println(maxRot(38458215));

    }
//TODO: Доделать
    public static long maxRot(long n) {
        // your code
        int count = 1;
        long x = n;
        int pow = 1;
        while ((x /= 10) > 0) {
            count++;
            pow *= 10;
        }

        int shift = -2;

        if (shift > 0) {
            for (int i = 0; i < shift; i++) {
                n = (n % 10) * pow + (n / 10);
            }
        } else {
            for (int i = shift; i < 0; i++) {
                long firstDigit = n / pow;
                n = (n - firstDigit * pow) * 10 + firstDigit;
            }
        }

        System.out.println(String.format("%0" + count + "d", n));
        return n;
    }
}
