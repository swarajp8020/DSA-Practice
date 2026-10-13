package PREP2025.stage1;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");

        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is Even Number");
        } else {
            System.out.println(num + " is Odd Number");
        }
        scanner.close();
    }
}
