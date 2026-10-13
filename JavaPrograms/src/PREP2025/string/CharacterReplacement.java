package PREP2025.string;
/// LC 424. Longest Repeating Character Replacement https://leetcode.com/problems/longest-repeating-character-replacement/description/
class sol {
    public int characterReplacement(String s, int k){
        int[] freq = new int[26];
        int left =0, maxFreq = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq[c-'a']++;
            maxFreq = Math.max(maxFreq, freq[c-'a']);
            int windowSize = right-left+1;
            int charsToChange = windowSize-maxFreq;
            if (charsToChange > k) {
                freq[s.charAt(left)-'a']--;
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
/// (interview explanation) - We maintain a sliding window and track the most frequent character inside it.
/// If the number of characters we need to change exceeds k, we shrink the window.
/// Otherwise, we expand it and update the maximum length.
public class CharacterReplacement {
    static void main(String[] args) {
        String s = "sada";
        int k = 2;
        sol so = new sol();
        System.out.println(so.characterReplacement(s,k));
    }
}
///❓ Important Question You’ll Be Asked
/// “Why don’t we reduce maxFreq when shrinking the window?”
/// Answer:
/// Because even if maxFreq is slightly outdated, it does not affect correctness.
/// It may allow a window that is slightly larger, but it never misses the optimal answer.
/// This is expected and accepted.