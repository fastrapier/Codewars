package WhereIsMyParentCry;

import java.util.Arrays;

public class WhereIsMyParent {
    //TODO:Доделать сортировку заглавных

    public static void main(String[] args) {
        System.out.println(findChildren("aAbaBb"));
    }
    static String findChildren(final String text) {
        char[] arr = text.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
