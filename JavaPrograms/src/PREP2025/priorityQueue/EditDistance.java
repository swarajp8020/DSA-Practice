package PREP2025.priorityQueue;
// Edit Distance (LC 72)
/// 🧠 ELI5 Explanation
/// You want to transform one word into another.
/// At every position, you have three choices:
/// Insert
/// Delete
/// Replace
/// And you want minimum total operations.
/// This is classic:
/// 👉 2D Dynamic Programming
/// 🔎 Pattern Identification
/// Whenever you see:
/// Two strings
/// Minimum operations
/// Transform one into another
/// Think:
/// 👉 DP on two strings
/// 💡 Core Idea
/// Let:
/// dp[i][j]
/// = minimum operations to convert
/// first i characters of word1
/// into first j characters of word2.
/// If characters match:
/// dp[i][j] = dp[i-1][j-1]
/// Else:
/// dp[i][j] = 1 + min(
///     dp[i-1][j],    // delete
///     dp[i][j-1],    // insert
///     dp[i-1][j-1]   // replace
/// )
// Interview Explanation (4 lines)
//This is a classic 2D DP problem.
//dp[i][j] represents minimum operations to convert first i characters of word1 into first j characters of word2.
//If characters match, we copy diagonal value.
//Otherwise we take 1 plus the minimum of insert, delete, or replace.
//📊 Complexity
//Time: O(m × n)
//Space: O(m × n)
public class EditDistance {
    public int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        // Base cases
        for(int i = 0; i <= m; i++)
            dp[i][0] = i;

        for(int j = 0; j <= n; j++)
            dp[0][j] = j;

        for(int i = 1; i <= m; i++) {

            for(int j = 1; j <= n; j++) {

                if(word1.charAt(i - 1) ==
                        word2.charAt(j - 1)) {

                    dp[i][j] = dp[i - 1][j - 1];

                } else {

                    dp[i][j] = 1 + Math.min(
                            dp[i - 1][j],        // delete
                            Math.min(
                                    dp[i][j - 1],    // insert
                                    dp[i - 1][j - 1] // replace
                            )
                    );
                }
            }
        }

        return dp[m][n];
    }

    static void main(String[] args) {

        EditDistance s = new EditDistance();

        String word1 = "horse";
        String word2 = "ros";

        System.out.println("Edit Distance: "
                + s.minDistance(word1, word2));
    }
}
