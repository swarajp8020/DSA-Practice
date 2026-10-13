package PREP2025.Practice.Week22Practice;
/// Edit Distance
public class April01Morning {
    public static int minDistance(String sourceWord, String targetWord) {

        int length1 = sourceWord.length();
        int length2 = targetWord.length();

        int[][] dpTable = new int[length1 + 1][length2 + 1];

        for (int i = 0; i <= length1; i++) {
            dpTable[i][0] = i;
        }

        for (int j = 0; j <= length2; j++) {
            dpTable[0][j] = j;
        }

        for (int i = 1; i <= length1; i++) {

            for (int j = 1; j <= length2; j++) {

                if (sourceWord.charAt(i - 1) == targetWord.charAt(j - 1)) {

                    dpTable[i][j] = dpTable[i - 1][j - 1];

                } else {

                    int deleteOperation = dpTable[i - 1][j];
                    int insertOperation = dpTable[i][j - 1];
                    int replaceOperation = dpTable[i - 1][j - 1];

                    dpTable[i][j] = 1 + Math.min(
                            deleteOperation,
                            Math.min(insertOperation, replaceOperation)
                    );
                }
            }
        }

        return dpTable[length1][length2];
    }

    public static void main(String[] args) {

        String sourceWord = "horse";
        String targetWord = "ros";

        System.out.println(minDistance(sourceWord, targetWord)); // 3
    }
}
