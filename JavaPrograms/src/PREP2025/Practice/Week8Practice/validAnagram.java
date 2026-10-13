package PREP2025.Practice.Week8Practice;

public class validAnagram {
    static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
    static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int count:freq){
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
