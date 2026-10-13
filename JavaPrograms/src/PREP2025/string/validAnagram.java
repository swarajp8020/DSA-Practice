package PREP2025.string;
/// LC 242: Valid Anagram
public class validAnagram {
    static void main(String[] args) {
        String s = "rat";
        String t = "cat";
        System.out.println(isAnagram(s, t));
    }
    static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int count : freq){
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
