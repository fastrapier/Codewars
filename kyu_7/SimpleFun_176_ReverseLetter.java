import java.util.Arrays;

public class SimpleFun_176_ReverseLetter {
    public static void main(String[] args) {
        System.out.println(reverseLetter("murwewffovdqcixwmdj[]xndzbkgovumkj"));
    }
    //Bad solution
//    public static String reverseLetter(final String str) {
//        StringBuilder stringBuilder = new StringBuilder();
////        String andro = str.replaceAll("(?U)[^\\p{L}\\p{N}\\s]+", "");
//        String andro = str.replaceAll("[^A-Za-zА-Яа-я]", "");
//        String[] strings = andro.split("");
//        for (int i = strings.length - 1; i >= 0; i--) {
//            stringBuilder.append(strings[i]);
//        }
//        return stringBuilder.toString(); //coding and coding..
//    }

    //Best solution
    public static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }

}
