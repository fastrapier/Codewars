package DetectPangram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DetectPangram {
    public static void main(String[] args) {
        String pangram = "The quick brown fox jumps over the lazy dog.";
        System.out.println(new DetectPangram().check(pangram));
    }
    public boolean check(String sentence){
        //code
        String replaced = sentence.replaceAll("[^A-Za-z]","");
        Set<String> letters = new HashSet<>(Arrays.asList(replaced.split("")));
        return letters.size() >= 26;
    }
//    public boolean check(String sentence){
//        for (char c = 'a'; c<='z'; c++)
//            if (!sentence.toLowerCase().contains("" + c))
//                return false;
//        return true;
//
//    }
}
