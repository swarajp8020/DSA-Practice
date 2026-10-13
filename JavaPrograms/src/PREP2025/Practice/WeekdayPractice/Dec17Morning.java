package PREP2025.Practice.WeekdayPractice;

public class Dec17Morning {

    /// CharacterReplacement
    static class sol{
        public int characterReplacement(String s, int k){
            int[] freq = new int[26];
            int left = 0, maxFreq = 0, maxLen = 0;
            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);
                freq[c-'a']++;
                maxFreq = Math.max(maxFreq, freq[c-'a']);
                int windowSize = right - left + 1;
                int charsToChange = windowSize - maxFreq;
                if (charsToChange > k) {
                    freq[s.charAt(left)-'a']--;
                    left++;
                }
                maxLen = Math.max(maxLen, right-left+1);
            }
            return maxLen;
        }
    }

    static void main(String[] args) {
        String s= "sadaaadadasssssssaaaaa";
        int k =2;
        sol sb = new sol();
        System.out.println(sb.characterReplacement(s,k));
    }

    /// PermutationInString
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
//        private boolean matches(int[] a, int[] b){
//            for (int i = 0; i < 26; i++) {
//                if (a[i]!=b[i])return false;
//            }
//            return true;
//        }
//    }
//
//    static void main(String[] args) {
//        String s1 = "dsa";
//        String s2 = "sadasd";
//        sol s = new sol();
//        System.out.println(s.checkInclusion(s1,s2));
//    }

//    static class sol{
//        public int longestSubstring(String s){
//            int[] freq = new int[128];
//            int left = 0, maxLen = 0;
//            for (int right = 0; right < s.length(); right++) {
//                char c = s.charAt(right);
//                freq[c]++;
//                if (freq[c]>1){
//                    freq[s.charAt(left)]--;
//                    left++;
//                }
//                maxLen= Math.max(maxLen,right-left+1);
//            }
//            return maxLen;
//        }
//    }
    //longestSubstring
//    static void main(String[] args) {
//        String s =  "sadasda";
//        sol dec = new sol();
//        System.out.println(dec.longestSubstring(s));
//    }

    /// isPalindrome
//    static void main(String[] args) {
//        String s = "namaan";
//        Dec17Morning dc = new Dec17Morning();
//        System.out.println(dc.isPalindrome(s));
//    }
//    boolean isPalindrome(String s){
//        int left = 0, right = s.length()-1;
//        while (left < right) {
//            if (s.charAt(left)!=s.charAt(right))return false;
//            left++;
//            right--;
//        }
//        return true;
//    }

    /// has duplicate
//    static void main(String[] args) {
//        String s = "pqdv";
//        Dec17Morning dec = new Dec17Morning();
//        System.out.println(dec.hasDuplicate(s));
//    }
//    boolean hasDuplicate(String s){
//        int[] freq = new int[26];
//        for (char c: s.toCharArray()){
//            if (freq[c-'a']>0) return true;
//            freq[c-'a']++;
//        }
//        return false;
//    }
    /// Frequency Array
//    static void main(String[] args) {
//        String s = "asav";
//        int[] freq = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            int Index = s.charAt(i) - 'a';
//            freq[Index]++;
//        }
//        System.out.println(Arrays.toString(freq));
//    }

    /// reverse String
//    static void main(String[] args) {
//        String s = "swaraj";
//        StringBuilder sb = new StringBuilder(s);
//        int left = 0, right = sb.length()-1;
//        while (left < right) {
//            char temp = sb.charAt(left);
//            sb.setCharAt(left, sb.charAt(right));
//            sb.setCharAt(right, temp);
////            left++;
//            right--;
//            left++;
//        }
//        System.out.println(sb.toString());
//    }
}
