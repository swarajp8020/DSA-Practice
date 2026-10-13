package PREP2025.Practice.Week13Practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jan26Morning {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length() > s.length()) return res;
        int[] pfreq = new int[26];
        int[] winFreq = new int[26];
        for (char c:p.toCharArray()) {
            pfreq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            winFreq[s.charAt(i)-'a']++;
            if (i >= p.length()) {
                winFreq[s.charAt(i-p.length())-'a']--;
            }
            if (Arrays.equals(pfreq, winFreq)) {
                res.add(i - p.length() + 1);
            }
        }
        return res;
    }
    static void main() {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
//    public static int characterReplacement(String s, int k) {
//        int[] freq = new int[26];
//        int left = 0, maxLen = 0, maxFreq = 0;
//        for (int right = 0; right < s.length(); right++) {
//            char c = s.charAt(right);
//            freq[c - 'a']++;
//            maxFreq = Math.max(maxFreq, freq[c - 'a']);
//            int windowSize = right - left + 1;
//            int charsToChange = windowSize - maxFreq;
//            if (charsToChange > k) {
//                freq[s.charAt(left)-'a']--;
//                left++;
//            } maxLen = Math.max(maxFreq, right-left+1);
//        } return maxLen;
//    }
//    static void main(String[] args) {
//        String s = "sada";
//        int k = 2;
//        System.out.println(characterReplacement(s,k));
//    }
}
