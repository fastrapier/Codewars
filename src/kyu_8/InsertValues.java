import java.util.Arrays;

public class InsertValues {
    public static int[] invert(int[] array) {
        int[] another_arr = new int[array.length];
        if (another_arr.length > 0) {
            for (int i = 0; i < array.length; i++) {
                another_arr[i] = array[i] * -1;
            }
        }
        return another_arr;
    }
}
