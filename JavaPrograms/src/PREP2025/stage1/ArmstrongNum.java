package PREP2025.stage1;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");

        int num = scanner.nextInt();
        int originalNum = num;
        int digits = String.valueOf(num).length();  // Find how many digits
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, digits); // Raise digit to power of digits
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println("This is Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        scanner.close();
    }
}
