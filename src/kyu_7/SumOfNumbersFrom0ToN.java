public class SumOfNumbersFrom0ToN {
    public static void main(String[] args) {
        System.out.println(showSequence(6));
        System.out.println(showSequence(-15));
        System.out.println(showSequence(0));
    }

    public static String showSequence(int value) {
        int answer = 0;
        int flag = 0;
        StringBuilder stringBuilder = new StringBuilder();
        if (value > 0) {
            while (flag < value) {
                answer += flag;
                stringBuilder.append(flag).append("+");
                flag++;
            }
            answer += flag;
            stringBuilder.append(flag).append(" = ").append(answer);
            return String.valueOf(stringBuilder);
        }
        if (value == 0)
            return String.valueOf(answer +"=" + value);
        else
            return value + "<" + 0;
    }
}
