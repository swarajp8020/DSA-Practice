package PREP2025.stage1;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Num: ");
        int num = in.nextInt();

        if (num % 2 ==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

}
