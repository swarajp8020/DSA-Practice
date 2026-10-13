package PREP2025.Practice.easy;

public class factorialNum {
    public static void main(String[] args) {
        int n=5;
        double fact=1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
