package PREP2025.Practice.Week8Practice;


public class Dec27Morning {

    /// MinimumWindowSubstring
    static void main(String[] args) {
        String s = "ssadafa";
        String t = "sad";
        sol ss = new sol();
        System.out.println(ss.minWindow(s,t));
    }
    static class sol{
        public String minWindow(String s, String t){
            if (s.length() < t.length()) return "";
            int[] need = new int[128];
            for (char c: t.toCharArray()){
                need[c]++;
            }
            int left = 0, count = t.length(), start = 0, minLen = Integer.MAX_VALUE;
            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);
                if (need[c] > 0) count--;
                need[c]--;
                while (count == 0) {
                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1;
                        start = left;
                    }
                    char lc = s.charAt(left);
                    need[lc]++;
                    if (need[lc] > 0) count++;
                    left++;
                }
            }
            return minLen == Integer.MAX_VALUE?"":s.substring(start, start+minLen);
        }
    }

    ///Longest Repeating Character Replacement
//    static void main(String[] args) {
//        String s = "sada";
//        int k = 2;
//        Solution sol = new Solution();
//        System.out.println(sol.characterReplacement(s,k));
//    }
//    static class Solution {
//        public int characterReplacement(String s, int k){
//            int[] freq = new int[26];
//            int left = 0, maxFreq = 0, maxLen = 0;
//            for (int right = 0; right < s.length(); right++) {
//                char c = s.charAt(right);
//                freq[c-'a']++;
//                maxFreq = Math.max(maxFreq, freq[c-'a']);
//                int windowSize = right - left + 1;
//                int charsToChange = windowSize - maxFreq;
//                if (charsToChange > k){
//                    freq[s.charAt(left)]--;
//                    left++;
//                }
//                maxLen = Math.max(maxLen, right-left+1);
//            }
//            return maxLen;
//        }
//    }

    /// Permutation in String
//    static void main(String[] args) {
//        String s1 = "ab";
//        String s2 = "eidbaooo";
//        Solution solution = new Solution();
//        System.out.println(solution.checkInclusion(s1,s2));
//    }
//    static class Solution{
//        public boolean checkInclusion(String s1, String s2){
//            if (s1.length() > s2.length()) return false;
//            int[] freq1 = new int[26];
//            int[] freq2 = new int[26];
//            for (char c: s2.toCharArray()){
//                freq1[c - 'a']++;
//            }
//            int k = s1.length();
//            for (int i = 0; i < k; i++) {
//                freq2[s2.charAt(i) - 'a']++;
//            }
//            if (matches(freq1, freq2)) return true;
//            for (int right = k; right < s2.length(); right++) {
//                freq2[s2.charAt(right) - 'a']++;
//                freq2[s2.charAt(right - k) - 'a']--;
//                if (matches(freq1, freq2)) return true;
//            }
//            return false;
//        }
//        private boolean matches(int[] a, int[] b){
//            for (int i = 0; i < 26; i++) {
//                if (a[i] != b[i]) return true;
//            }
//            return false;
//        }
//    }

    /// LongestSubstringWithoutRepeatingCharacters
//    static void main(String[] args) {
//        String s= "adadasf";
//        Solution solution = new Solution();
//        System.out.println(solution.longestSubString(s));
//    }
//    static class Solution{
//        public int longestSubString(String s){
//            int[] freq = new int[128];
//            int left = 0, maxLen = 0;
//            for (int right = 0; right < s.length(); right++) {
//                char c = s.charAt(right);
//                freq[c]++;
//                while (freq[c] > 1) {
//                    freq[s.charAt(left)]--;
//                    left++;
//                }
//                maxLen = Math.max(maxLen, right-left+1);
//            }
//            return maxLen;
//        }
//    }
}
