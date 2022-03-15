public class CalculateAverage {
    public static void main(String[] args) {

    }
    public static double find_average(int[] array) {
        double sum = 0;
        for(double i: array) {
            sum+=i;
        }
        return sum/array.length;
    }
}
