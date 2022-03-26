package main.java.kyu_4.MostFrequentlyUsedWordsInAText;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TopWords { public static final int LIMIT = 3;

    public static List<String> top3(String string) {
        final Pattern pattern = Pattern.compile("[A-Za-z][A-Za-z']*");
        final Matcher matcher = pattern.matcher(string.toLowerCase());
        final Map<String, Integer> wordsCount = new HashMap<>();

        while (matcher.find()) {
            String s = matcher.group();
            wordsCount.put(s, wordsCount.getOrDefault(s, 1) + 1);
        }

        return wordsCount.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                .limit(LIMIT)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        String text = "In a village of La Mancha, the name of which I have no desire to call to,n" +
                "mind, there lived not long since one of those gentlemen that keep a lance," +
                "in the lance-rack, an old buckler, a lean hack, and a greyhound for," +
                "coursing. An olla of rather more beef than mutton, a salad on most," +
                "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra," +
                "on Sundays, made away with three-quarters of his income.";
        String anotherText = "  //wont won't won't ";
        String text1 = "'";
        top3(anotherText).forEach(System.out::println);
        top3(text).forEach(System.out::println);
        top3(text1).forEach(System.out::println);

    }
}
