package PREP2025.stage1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = scanner.nextInt();

        long fact = 1;

        for (int i = 1; i <= num ; i++) {
            fact = fact * i;
        }
        System.out.println("PREP2025.stage1.Factorial of "+num+" is "+fact);
        scanner.close();
    }

}
