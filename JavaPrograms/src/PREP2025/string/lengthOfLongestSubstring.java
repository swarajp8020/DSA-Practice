package PREP2025.string;
/// LC 3. Longest Substring Without Repeating Characters

class Solution {
    public int longestSubstring(String s){
        int[] freq = new int[128];
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq[c]++;
            while (freq[c] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
/// Interview explanation (say this)
/// “I use a sliding window with a frequency array.
/// I expand the window using the right pointer.
/// If a character repeats, I shrink from the left until the window is valid again.
/// I track the maximum window length and its starting index.”
public class lengthOfLongestSubstring {
    static void main(String[] args) {
        String s = "asvavsaffg";
        Solution solu = new Solution();
        System.out.println(solu.longestSubstring(s));
    }
}
