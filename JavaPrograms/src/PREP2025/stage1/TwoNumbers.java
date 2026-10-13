package PREP2025.stage1;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 1st Number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter a 2nd Number: ");
        int secondNum = scanner.nextInt();

        int sum = firstNum + secondNum ;
        System.out.println("Sum is "+ sum);
        scanner.close();
    }
}
