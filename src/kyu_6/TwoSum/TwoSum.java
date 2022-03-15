import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 4)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 4)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i]+numbers[j]==target){
                    answer[0]=i;
                    answer[1]=j;
                    return answer;
                }
            }
        }
        return answer; // Do your magic!
    }
}
