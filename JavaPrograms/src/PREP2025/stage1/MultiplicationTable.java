package PREP2025.stage1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = scanner.nextInt();

        System.out.println("Multiplication of table"+num);
        for (int i = 0; i < 11; i++) {
            System.out.println(num+" x "+i+" = "+ (num*i));
        }
        scanner.close();
    }
}
