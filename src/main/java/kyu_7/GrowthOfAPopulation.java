package main.java.kyu_7;

public class GrowthOfAPopulation {
    public static void main(String[] args) {
        System.out.println(nbYear(1500000, 2.5, 10000, 2000000));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        int counter = 0;
        while (p0 < p) {
            System.out.println(p0);
            p0 += p0 * (percent/100) + aug;
            counter++;
            System.out.println(p0);
        }
        return counter;
    }
}
