package PREP2025.Practice.Week22Practice;
/// Permutation in String
public class April05Morning {
    public static boolean checkInclusion(String patternString, String mainString) {
        if (patternString.length() > mainString.length()) {
            return false;
        }
        int[] patternFrequency = new int[26];
        int[] windowFrequency = new int[26];
        for (char character : patternString.toCharArray()) {
            patternFrequency[character - 'a']++;
        }
        int windowSize = patternString.length();
        for (int index = 0; index < mainString.length(); index++) {
            char currentChar = mainString.charAt(index);
            windowFrequency[currentChar - 'a']++;
            if (index >= windowSize) {
                char leftChar = mainString.charAt(index - windowSize);
                windowFrequency[leftChar - 'a']--;
            }
            if (matches(patternFrequency, windowFrequency)) {
                return true;
            }
        }
        return false;
    }
    private static boolean matches(int[] patternFrequency, int[] windowFrequency) {
        for (int i = 0; i < 26; i++) {
            if (patternFrequency[i] != windowFrequency[i]) {
                return false;
            }
        }
        return true;
    }
    static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2)); // true
    }
}
