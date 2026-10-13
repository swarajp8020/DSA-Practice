package PREP2025.stage1;

import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount in rupees: ");
        double rupees = scanner.nextDouble();

        double exchangeRate = 83.0;

        double USD = rupees / exchangeRate ;

        System.out.println("Equivalent to "+ USD);

        scanner.close();
    }
}
