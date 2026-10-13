package PREP2025.stage1;

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your Age: ");
        int age = in.nextInt();

        if (age>=18){
            System.out.println("You're eligible for Voting");
        }else {
            System.out.println("You're not eligible for Voting");
        }

    }
}
