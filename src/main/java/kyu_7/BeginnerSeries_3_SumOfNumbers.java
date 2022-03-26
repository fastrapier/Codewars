package main.java.kyu_7;

public class BeginnerSeries_3_SumOfNumbers {
    public static void main(String[] args) {
        BeginnerSeries_3_SumOfNumbers beginnerSeries_3_sumOfNumbers = new BeginnerSeries_3_SumOfNumbers();
        System.out.println(beginnerSeries_3_sumOfNumbers.GetSum(1, 0));
        System.out.println(beginnerSeries_3_sumOfNumbers.GetSum(1, 2));
    }

    public int GetSum(int a, int b) {
        int sum = 0;
        //Good luck!
        if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        } else if (b > a) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else
            return a;
        return sum;
    }

    public int GetSum1(int a, int b) {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
        //Не знаю что за формула, но работает  :)
    }

    public int GetSum2(int a, int b) {
        int sum = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            sum += i;
        }
        return a == b ? a : sum;
    }
    //думаю лучшее решение
}
