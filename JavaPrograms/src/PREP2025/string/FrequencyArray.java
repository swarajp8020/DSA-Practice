package PREP2025.string;

import java.util.Arrays;

public class FrequencyArray {
    static void main() {
        String s = "abc";
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            freq[index]++;
        }
        ///  Use Arrays.toString (recommended)
        System.out.println(Arrays.toString(freq));
        /// Print meaningful output (better for learning)
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + " -> " + freq[i]);
            }
        }

    }
}
