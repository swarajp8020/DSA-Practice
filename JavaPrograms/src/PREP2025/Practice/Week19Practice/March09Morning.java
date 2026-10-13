package PREP2025.Practice.Week19Practice;

import java.util.HashSet;
import java.util.Set;

/// Longest Substring Without Repeating Characters

public class March09Morning {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++) {

            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        March09Morning sol = new March09Morning();

        String s = "abcabcbb";

        System.out.println("Longest substring length: "
                + sol.lengthOfLongestSubstring(s));
    }
}
