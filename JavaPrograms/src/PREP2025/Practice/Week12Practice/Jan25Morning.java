package PREP2025.Practice.Week12Practice;

public class Jan25Morning {
    /// Longest Repeating Character Replacement
    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left =0, maxFreq = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char c= s.charAt(right);
            freq[c -'a']++;
            maxFreq = Math.max(maxFreq, freq[c - 'a']);
            int windowSize = right - left + 1;
            int charsToChange = windowSize - maxFreq;
            if (charsToChange > k) {
                freq[s.charAt(left)-'a']--;
                left++;
            }
            maxLen = Math.max(maxFreq, right - left +1);
        }
        return maxLen;
    }
    static void main(String[] args) {
        String s = "sada";
        int k = 2;
        System.out.println(characterReplacement(s,k));
    }
    // Min Size
//    public static int minSubArrayLen(int target, int[] nums) {
//        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;
//        for (int right = 0; right < nums.length; right++) {
//            sum += nums[right];
//            while (sum >= target) {
//                minLen = Math.min(minLen, right - left + 1);
//                sum -= nums[left++];
//            }
//        } return minLen == Integer.MAX_VALUE ? 0 : minLen;
//    }
//
//    static void main() {
//        int[] nums = {2,3,1,2,4,3};
//        int target = 7;
//        System.out.println(minSubArrayLen(target, nums));
//    }
}
