package PREP2025.stage1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many terms you want: ");

        int n = scanner.nextInt();
        int first =0, second =1;

        System.out.print("PREP2025.stage1.Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.println(first+" ");
            int next = first + second;
            first = second;
            second = next;
        }
        scanner.close();
    }
}
