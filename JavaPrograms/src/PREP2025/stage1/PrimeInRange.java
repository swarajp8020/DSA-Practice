package PREP2025.stage1;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = in.nextInt();
        System.out.print("Enter end number: ");
        int end = in.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        printPrimesInRange(start, end);
        in.close();
    }
    static void printPrimesInRange(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
