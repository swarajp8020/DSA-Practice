package PREP2025.stage1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Principal amount = ");
        double pricipal = scanner.nextDouble();

        System.out.println("Enter your Time in years = ");
        double time = scanner.nextDouble();

        System.out.println("Enter your Rate of interest = ");
        double rate = scanner.nextDouble();

        double interest = pricipal * time * rate / 100;

        System.out.println("Simple Interest is " + interest);
        scanner.close();
    }

}
