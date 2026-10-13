package PREP2025.Practice.WeekdayPractice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Dec18Morning {

    /// SlidingWindowMaximum
    static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k  = 3;
        sol sss = new sol();
        System.out.println(Arrays.toString(sss.slidingWindowMaximum(nums,k)));
    }
    static class sol{
        public int[] slidingWindowMaximum(int[] nums, int k){
            if (nums.length == 0 || k == 0)return new int[0];
            Deque<Integer> dq = new ArrayDeque<>();
            int[] res = new int[nums.length - k+1];
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                    dq.pollFirst();
                }
                while (!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                    dq.pollLast();
                }
                dq.offerLast(i);
                if (i >= k - 1) {
                    res[index++] = nums[dq.peekFirst()];
                }
            }
            return res;
        }
    }

    /// Longest Repeating Character Replacement
//    static void main(String[] args) {
//        String s = "sada";
//        int k = 2;
//        sol soo = new sol();
//        System.out.println(soo.characterReplacement(s,k));
//    }
//    static class sol {
//        public int characterReplacement(String s, int k){
//            int[] freq = new int[26];
//            int left = 0, maxFreq = 0, maxLen = 0;
//            for (int right = 0; right < s.length(); right++) {
//                char c = s.charAt(right);
//                freq[c-'a']++;
//                maxFreq = Math.max(maxFreq,freq[c-'a']);
//                int windowSize = right - left + 1;
//                int charsToChange = windowSize - maxFreq;
//                if (charsToChange > k){
//                    freq[s.charAt(left)-'a']--;
//                    left++;
//                }
//                maxLen = Math.max(maxLen, right-left+1);
//            }
//            return maxLen;
//        }
//    }
    /// lengthOfLongestSubstring
//    static void main(String[] args) {
//        String s = "asvavsaffg";
//        LongestSubstring ls = new LongestSubstring();
//        System.out.println(ls.lengthOfLongestSubString(s));
//    }
//    static class LongestSubstring{
//        public int lengthOfLongestSubString(String s) {
//            int[] freq = new int[128];
//            int left = 0, maxLen = 0;
//            for (int right = 0; right < s.length(); right++) {
//                char c = s.charAt(right);
//                freq[c]++;
//                while (freq[c-'a']>1){
//                    freq[s.charAt(left)-'a']--;
//                    left++;
//                }
//                maxLen = Math.max(maxLen, right-left+1);
//            }
//            return maxLen;
//        }
//    }

    /// PermutationInString
//    static void main(String[] args) {
//        String s1 = "sad";
//        String s2 = "sadasda";
//        sol s = new sol();
//        System.out.println(s.checkInclusion(s1,s2));
//    }
//    static class sol{
//        public boolean checkInclusion(String s1, String s2){
//            if (s1.length()>s2.length())return false;
//            int[] freq1 = new int[26];
//            int[] freq2 = new int[26];
//            for (char c:s1.toCharArray()){
//                freq1[c-'a']++;
//            }
//            int k = s1.length();
//            for (int i = 0; i < k; i++) {
//                freq2[s2.charAt(i)-'a']++;
//            }
//            if (matches(freq1,freq2))return true;
//            for (int i = k; i < s2.length(); i++) {
//                freq2[s2.charAt(i)-'a']++;
//                freq2[s2.charAt(i-k)-'a']--;
//                if (matches(freq1,freq2))return true;
//            }
//            return false;
//        }
//        static boolean matches(int[] a, int[] b){
//            for (int i = 0; i < 26; i++) {
//                if (a[i] != b[i]) return false;
//            }
//            return true;
//        }
//    }
}
