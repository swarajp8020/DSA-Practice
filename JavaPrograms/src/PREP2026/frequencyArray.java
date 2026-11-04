
package PREP2026;

public class frequencyArray {

    public static void main(String[] args) {

        String word = "apple";

        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {

            int index = word.charAt(i) - 'a';

            count[index]++;
        }

        for (int i = 0; i < 26; i++) {

            if (count[i] > 0) {

                char ch = (char) (i + 'a');

                System.out.println(ch + " : " + count[i]);
            }
        }
    }
}
