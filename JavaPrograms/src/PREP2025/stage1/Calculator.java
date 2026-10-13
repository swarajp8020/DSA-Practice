package PREP2025.stage1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result;

        System.out.println("Enter First Number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter Second Number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operator == '/') {
            result = num1 / num2;
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}
