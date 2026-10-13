package PREP2025.stage1;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String string = scanner.nextLine();

        String original = string.toLowerCase().replaceAll("[^a-z0-9]","");
        String reverse = "";

        for (int i = original.length()-1; i >= 0 ; i--) {
            reverse += original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("Yes, it is a palindrome.");
        } else {
            System.out.println("No, it is not a palindrome.");
        }
        scanner.close();
    }
}
