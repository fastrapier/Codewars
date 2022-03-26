package main.java.kyu_6.IrreducibleSumOfRationals;

import static java.math.BigInteger.valueOf;
import static java.util.stream.Stream.of;

class IrreducibleSumOfRationals {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {2, 9}, {3, 18}, {4, 24}, {6, 48}};
        int[][] b = {{1, 2}, {1, 3}, {1, 4}};
        System.out.println(sumFracts(a));
        System.out.println(sumFracts(b));
    }
    static String sumFracts(int[][] l) {
        int d = of(l).mapToInt(a -> a[1]).reduce(1, (a, b) -> a * b);
        int n = of(l).mapToInt(a -> d * a[0] / a[1]).sum();
        int gcd = valueOf(n).gcd(valueOf(d)).intValue();
        return n % d > 0 ? "[" + n / gcd + ", " + d / gcd + "]" : (n /= d) > 0 ? n + "" : null;
    }
}