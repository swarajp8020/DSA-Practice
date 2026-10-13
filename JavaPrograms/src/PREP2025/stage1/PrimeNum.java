package PREP2025.stage1;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = in.nextInt();
        boolean isPrime = true;

        if (num<=1){
            isPrime = false;
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println(num +" is a prime number.");
        else
            System.out.println(num+ " is not a prime number.");
        in.close();
    }
}
