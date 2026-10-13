package PREP2025.string;
/// LC https://leetcode.com/problems/palindromic-substrings/description/?envType=problem-list-v2&envId=rr2ss0g5
/// WHY THIS WORKS
/// Every palindrome is discovered exactly once
/// Time: O(n²) (unavoidable)
/// Space: O(1)
/// INTERVIEW ONE-LINER (MEMORIZE)
/// “I expand around each possible center to count palindromes, handling both odd and even lengths.”
/// That’s enough.
/// COMMON CONFUSIONS (CLEAR THESE)
/// Q: Why not DP?
/// DP works, but expand-around-center is simpler and faster to explain.
/// Q: Why two expansions per index?
/// Because palindromes can be odd or even length.
public class palindromicSubstrings {
    static void main(String[] args) {
        String s = "abc";
        System.out.println(countSubstrings(s));
    }
    static int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count += expand(s, i, i);     // odd
            count += expand(s, i, i + 1); // even
        }

        return count;
    }

    static int expand(String s, int left, int right) {
        int count = 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }

        return count;
    }
}
