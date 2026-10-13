package PREP2025.string;
/// ELI5 FIRST - In LC 647, you asked:
/// “How many palindromes can I form from each center?”
/// In LC 5, you ask:
/// “What is the biggest palindrome I can form from each center?”
/// Same expansion. Different goal.
/// CORE IDEA (DO NOT OVERTHINK)
/// Every palindrome expands from a center.
/// For each index i, check:
/// (i, i) → odd-length palindromes
/// (i, i + 1) → even-length palindromes
/// While expanding:
/// If current length > best length → update answer
/// WHAT WE TRACK
/// Two things only:
/// start → starting index of longest palindrome
/// maxLen → length of longest palindrome
/// That’s it.
/// Why this works
/// For odd palindromes → center is exact
/// For even palindromes → center is between characters
/// This formula correctly shifts start in both cases
/// You don’t need to derive it in interviews.
/// You just need to understand that it maps length → start index.
/// INTERVIEW ONE-LINER (MEMORIZE THIS)
/// “I expand around each possible center and track the longest palindrome found so far.”
/// COMMON INTERVIEW FOLLOW-UPS
/// Q: Can this be optimized further -> Yes, Manacher’s Algorithm in O(n), but this solution is expected.
/// Q: Why not DP -> DP is harder to explain and uses extra space.
public class LongestPalindromicSubstring {
    static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
    static String longestPalindrome(String s){
        if (s == null || s.length() < 2) return s;

        int start = 0, maxLen = 1;

        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindromes
            int len1 = expand(s, i, i);
            // Even-length palindromes
            int len2 = expand(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + maxLen);
    }

    private static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
