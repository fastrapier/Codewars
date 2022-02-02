public class Solution {
    public static void main(String[] args) {
        System.out.println(repeatStr(3,"123"));
    }

    public static String repeatStr(final int repeat, final String str) {
        return str.repeat(repeat);
    }
}
