package PREP2025.string;
/// LC: 567 Permutation In String

class Solution1 {
    public boolean checkInclusion(String s1, String s2){
        if (s1.length()>s2.length())return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (char c: s1.toCharArray()){
            freq1[c-'a']++;
        }
        int k = s1.length();
        for (int i = 0; i < k; i++) {
            freq2[s2.charAt(i)-'a']++;
        }
        if (matches(freq1,freq2))return true;
        for (int right = k; right < s2.length(); right++) {
            freq2[s2.charAt(right)-'a']++;
            freq2[s2.charAt(right-k)-'a']--;
            if (matches(freq1,freq2))return true;
        }
        return false;
    }
    private boolean matches(int[] a, int[] b){
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
/// Why this works (say this in interview)
/// “A permutation has identical character frequencies.
/// I slide a fixed-size window over s2 and compare its frequency with s1.
/// If they match at any point, I return true.”
public class PermutationInString {
    static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        Solution1 sol = new Solution1();
        System.out.println(sol.checkInclusion(s1, s2));
    }
}
