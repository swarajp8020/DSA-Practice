package PREP2025.stage1;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hi "+name + ", Have a good Day!");
        scanner.close();
    }
}
