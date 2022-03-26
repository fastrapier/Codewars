package main.java.kyu_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//TODO: Не решил
public class TwoToOne {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        String s = "abacabaabracadabra";
        System.out.println(s.length());
//        String a = "xyaabbbccccdefww";
//        String b = "xxxxyyyyabklmopq";
//        System.out.println(longest(a, b));
    }
//    public static String longest(String s1, String s2) {
//        String[] arr1 = s1.split("");
//        String[] arr2 = s2.split("");
//    }


    //    public static String longest(String s1, String s2) {
//        // your code
//        StringBuilder test = new StringBuilder(s1);
//        StringBuilder test2 = new StringBuilder(s2);
//        HashSet<String> strings = new HashSet<>();
//        HashSet<String> strings1 = new HashSet<>();
//        for (int i = 0; i < test.length(); i++) {
//            strings.add(test.charAt(i) + "");
//
//        }
//        for (int i = 0; i < test2.length(); i++) {
//            strings1.add(test2.charAt(i) + "");
//        }
//        String[] arr1 = new String[strings.size()];
//        String[] arr2 = new String[strings1.size()];
//        System.out.println(strings.toString());
//        System.out.println(strings1.toString());
//        return Arrays.toString(arr1);
//    }
//    public static String longest(String s1, String s2) {
//        String[] arr1 = s1.split("");
//        String[] arr2 = s2.split("");
//        String[] answArr1 = new String[arr1.length];
//        for (int i = 0; i < arr1.length; i++) {
//            if (answArr1[i].contains(arr1[i]))
//                answArr1[i] = arr1[i];
//        }
//        Set<String> stringSet = Arrays.stream(arr1).collect(Collectors.toSet());
//        Set<String> stringsSet1 = Arrays.stream(arr2).collect(Collectors.toSet());
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        arr1 = (String[]) stringSet.toArray();
//        System.out.println(stringsSet1.toString());
//        return stringSet.toString();
//    }
}
