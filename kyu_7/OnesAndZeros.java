import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnesAndZeros {
    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder binaryNum = new StringBuilder();
        for (Integer num : binary) {
            binaryNum.append(num);
        }
        return Integer.parseInt(binaryNum.toString(), 2);
    }
}