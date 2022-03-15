import java.util.Locale;

public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
    }

    public static String accum(String s) {
        // your code
        StringBuilder stringBuilder = new StringBuilder();
        String m = s.toLowerCase();
        for (int i = 0; i < m.length(); i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0)
                    stringBuilder.append(m.substring(i, i + 1).toUpperCase());
                else
                    stringBuilder.append(m.charAt(i));
            }
            if (i != m.length() - 1)
                stringBuilder.append("-");
        }
        return String.valueOf(stringBuilder);

    }
}
