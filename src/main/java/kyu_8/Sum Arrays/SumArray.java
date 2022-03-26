class SumArray {
    public static void main(String[] args) {
        System.out.println(sum(new double[] {1, 5.2, 4, 0, -1}));
        System.out.println(sum(new double[] {}));
        System.out.println(sum(new double[] {-2.398}));
    }

    public static double sum(double[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}
