package PREP2025.arrays;
//LC 70 – Climbing Stairs
/// ELI5
/// To reach step n, you can come from:
/// step n-1 (1 step)
/// step n-2 (2 steps)
/// So:
/// ways[n] = ways[n-1] + ways[n-2]
/// Pattern
/// DP with rolling variables (no array needed)

public class climbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }
}
