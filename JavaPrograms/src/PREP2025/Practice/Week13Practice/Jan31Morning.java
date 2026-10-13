package PREP2025.Practice.Week13Practice;

public class Jan31Morning {

    //minimum window substring
    public static String minWindow(String s, String t){
        if (s.length() < t.length()) return "";
        int[] need = new int[128];
        for (char c:t.toCharArray())need[c]++;
        int left = 0, count = t.length(), minLen = Integer.MAX_VALUE, start = 0;
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
        return minLen == Integer.MAX_VALUE ? "":s.substring(start, start + minLen);
    }
    static void main(String[] args) {
        String s = "ssadafa";
        String t = "sad";
        System.out.println(minWindow(s,t));
    }
}
