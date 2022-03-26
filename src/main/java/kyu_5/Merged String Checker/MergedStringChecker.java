public class MergedStringChecker {

    public static void main(String[] args) {
        System.out.println(isMerge("TG6v+8\\zFEIUpGjrYojfL0QWM1N", "NG+8EIjrL01","6v\\zFUpGYojfQWMT"));
    }
    public static boolean isMerge(String s, String part1, String part2) {
        char[] answer = s.toCharArray();
        char[] answerFromParts = (part1 + part2).toCharArray();
        int answerCount = 0;
        int answerFromPartsCount = 0;
        for (char c : answer) {
            answerCount += c;
        }
        for (char c : answerFromParts) {
            answerFromPartsCount += c;
        }
        System.out.println(answerCount);
        System.out.println(answerFromPartsCount);
        if (answerCount != answerFromPartsCount) {
            System.out.println(s + " are not " + (part1 + part2));
            return false;
        } else {
            System.out.println(s + " can be created from " + part1 + " and " + part2);
            return true;
        }
    }
}
