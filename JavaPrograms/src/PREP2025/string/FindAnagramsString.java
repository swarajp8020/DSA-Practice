package PREP2025.string;
// 438. Find All Anagrams in a String https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
/// ELI5
/// Find all starting indices where substring is an anagram of p.
/// Example:
/// s = "cbaebabacd"
/// p = "abc"
/// Output = [0, 6]
/// Core idea
/// Window size = len(p)
/// Maintain frequency of window
/// Compare with target frequency
/// Pattern
/// Fixed-size sliding window
/// Frequency PREP2025.arrays (26)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagramsString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length() > s.length()) return res;
        int[] pFreq = new int[26];
        int[] winFreq = new int[26];
        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            winFreq[s.charAt(i) - 'a']++;
            if (i >= p.length()) {
                winFreq[s.charAt(i - p.length()) - 'a']--;
            }
            if (Arrays.equals(pFreq, winFreq)) {
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
}
