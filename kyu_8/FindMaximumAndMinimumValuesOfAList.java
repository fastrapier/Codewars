import java.util.Arrays;

public class FindMaximumAndMinimumValuesOfAList {
    public int min(int[] list) {
        Arrays.sort(list);
        return list[0];
    }

    public int max(int[] list) {
        Arrays.sort(list);
        return list[list.length - 1];
    }
}
