package PREP2025.string;
/// LC 76. Minimum Window Substring https://leetcode.com/problems/minimum-window-substring/description/
public class MinimumWindowSubstring {
    static class sol{
        public String minWindow(String s, String t){
            if (s.length()<t.length()) return "";
            int[] need = new int[128];
            for (char c: t.toCharArray()){
                need[c]++;
            }
            int left = 0, count = t.length(), minLen = Integer.MAX_VALUE, start = 0;
            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);
                if (need[c]>0)count--;
                need[c]--;
                while (count == 0) {
                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1;
                        start = left;
                    }
                    char lc =  s.charAt(left);
                    need[lc]++;
                    if (need[lc]>0)count++;
                    left++;
                }
            }
            return minLen == Integer.MAX_VALUE ? "":s.substring(start, start + minLen);
        }
    }
    /// Interview one-liner (keep this)
    /// You already wrote a great one. Slight polish:
    /// “We use a sliding window with a frequency map, expanding until all required characters are met, then shrinking greedily to find the minimum valid window.”
    static void main(String[] args) {
        String s = "ssadafa";
        String t = "sad";
        sol ss = new sol();
        System.out.println(ss.minWindow(s,t));
    }
    /// Interview one-liner explanation
    /// “We expand the window until it satisfies all required characters, then shrink it greedily to find the minimum.”
}
