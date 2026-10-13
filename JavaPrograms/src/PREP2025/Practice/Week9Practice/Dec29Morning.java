package PREP2025.Practice.Week9Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dec29Morning {


    /// group Anagram
    static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for (String s:strs){
            int[] freq = new int[26];
            for (char c: s.toCharArray()){
                freq[c - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            for (int count:freq){
                key.append('#').append(count);
            }
            map.computeIfAbsent(key.toString(), k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
    /// Anagram
//    static void main(String[] args) {
//        String s = "rat";
//        String t = "cat";
//        System.out.println(isAnagram(s, t));
//    }
//    static boolean isAnagram(String s, String t){
//        if (s.length() != t.length()) return false;
//        int[] freq = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            freq[s.charAt(i) - 'a']++;
//            freq[t.charAt(i) - 'a']--;
//        }
//        for (int count: freq){
//            if (count != 0)return false;
//        }
//        return true;
//    }
    /// LongestPalindromeSubstring
//    static void main(String[] args) {
//        String s = "babad";
//        System.out.println(longestPalindrome(s));
//    }
//    static String longestPalindrome(String s){
//        if (s == null || s.length() < 2)return s;
//        int start = 0, maxLen = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int len1 = expand(s, i, i);
//            int len2 = expand(s, i, i +1);
//            int len = Math.max(len1, len2);
//            if (len > maxLen) {
//                maxLen = len;
//                start = i - (len - 1) / 2;
//            }
//        }
//        return s.substring(start, start + maxLen);
//    }
//    static int expand(String s, int left, int right){
//        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
//            left--;
//            right++;
//        }
//        return right - left - 1;
//    }
}
