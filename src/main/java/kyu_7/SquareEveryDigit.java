package main.java.kyu_7;

public class SquareEveryDigit {
    public static void main(String[] args) {
        SquareEveryDigit squareEveryDigit = new SquareEveryDigit();
        System.out.println(squareEveryDigit.squareDigits(9119));
    }

    public int squareDigits(int n) {
        String[] arr = String.valueOf(n).split("");
        StringBuilder sum = new StringBuilder();
        for (String s : arr) {
            sum.append((int)Math.pow(Integer.parseInt(s), 2));
        }
        return Integer.parseInt(String.valueOf(sum));
    }
}
