package PREP2025.Practice.Week13Practice;

public class Jan29Morning {
    public static int climbStairs(int n){
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        } return b;
    }
    static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }
}
