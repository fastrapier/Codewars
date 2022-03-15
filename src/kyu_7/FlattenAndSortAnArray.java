import java.util.Arrays;
import java.util.stream.Stream;

public class FlattenAndSortAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}})));
    }

    public static int[] flattenAndSort(int[][] array) {
        int[] arr = new int[Stream.of(array).mapToInt(m -> m.length).sum()];
        System.out.println(arr.length);
        int i = 0;
        for (int[] outArr : array) {
            for (int number : outArr) {
                arr[i] = number;
                i++;
            }
        }
        Arrays.sort(arr);


        return arr;
    }
}
