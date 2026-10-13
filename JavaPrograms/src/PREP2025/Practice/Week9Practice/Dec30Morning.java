package PREP2025.Practice.Week9Practice;

public class Dec30Morning {
    /// hasDupicates
    static void main(String[] args) {
        String s = "swaraj";
        System.out.println(hasDuplicate(s));
    }
    static boolean hasDuplicate(String s){
        int[] freq = new int[26];
        for (char c: s.toCharArray()){
            if (freq[c -'a'] > 0) return true;
            freq[c - 'a']++;
        }
        return false;
    }
    /// isPalindrome
//    static void main(String[] args) {
//        String s = "naman";
//        System.out.println(isPalindrome(s));
//    }
//    static boolean isPalindrome(String s){
//        int left = 0, right = s.length()-1;
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right)) return false;
//            left++;
//            right--;
//        }
//        return true;
//    }

    /// LongestPalindromicSubstring
//    static void main(String[] args) {
//        String s = "babad";
//        System.out.println(longestPalindrome(s));
//    }
//    static String longestPalindrome(String s){
//        if (s == null || s.length() < 2) return s;
//        int start = 0, maxLen = 1;
//        for (int i = 0; i < s.length(); i++) {
//            int len1 = expand(s, i, i);
//            int len2 = expand(s, i, i + 1);
//            int len = Math.max(len1, len2);
//            if (len > maxLen) {
//                maxLen = len;
//                start = i - (len - 1) / 2;
//            }
//        }
//        return s.substring(start, start + maxLen);
//    }
//    static int expand(String s, int left, int right){
//        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
//            left--;
//            right++;
//        }
//        return right - left - 1;
//    }
    /// ReverseString
//    static void main(String[] args) {
//        String s = "hello";
//        StringBuilder sb = new StringBuilder(s);
//        int left = 0, right = sb.length() - 1;
//        while (left < right) {
//            char temp = sb.charAt(left);
//            sb.setCharAt(left, sb.charAt(right));
//            sb.setCharAt(right, temp);
//            left++;
//            right--;
//        }
//        System.out.println(sb.toString());
//    }

    /// FrequencyArray
//    static void main(String[] args) {
//        String s = "abc";
//        int[] freq = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            freq[c - 'a']++;
//        }
//        System.out.println(Arrays.toString(freq));
//    }

    /// palindromicSubstrings
//    static void main(String[] args) {
//        String s = "abc";
//        System.out.println(countSubstrings(s));
//    }
//    static int countSubstrings(String s){
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            count += expand(s, i, i);
//            count += expand(s, i, i + 1);
//        }
//        return count;
//    }
//    static int expand(String s, int left, int right){
//        int count = 0;
//        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
//            count++;
//            left--;
//            right++;
//        }
//        return count;
//    }
}
