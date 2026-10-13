package PREP2025.Practice.Week22Practice;
/// Longest Common Subsequence
public class April02Morning {
    public static int longestCommonSubsequence(String firstString, String secondString) {
        int length1 = firstString.length();
        int length2 = secondString.length();
        int[][] dpTable = new int[length1 + 1][length2 + 1];
        for (int i = 1; i <= length1; i++) {
            for (int j = 1; j <= length2; j++) {
                if (firstString.charAt(i - 1) == secondString.charAt(j - 1)) {
                    dpTable[i][j] = 1 + dpTable[i - 1][j - 1];
                } else {
                    dpTable[i][j] = Math.max(
                            dpTable[i - 1][j],
                            dpTable[i][j - 1]
                    );
                }
            }
        }
        return dpTable[length1][length2];
    }
    static void main(String[] args) {
        String firstString = "abcde";
        String secondString = "ace";
        System.out.println(longestCommonSubsequence(firstString, secondString)); // 3
    }
}
