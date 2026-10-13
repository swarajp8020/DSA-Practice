package PREP2025.stage1;

import java.util.Scanner;
/*
 * Java Program to find largest and smallest of three numbers
 */
public class LargestSmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to JAVA Program");
        System.out.print("Enter 1st Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = in.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = in.nextInt();

        int largest = largest(num1,num2,num3);
        int smallest = smallest(num1,num2,num3);

        System.out.println("Largest Num: "+largest);
        System.out.println("Smallest Num: "+smallest);
        in.close();
    }

    private static int largest(int num1, int num2, int num3) {
        int max = num1;
        if (max<num2){
        max = num2;
        }
        if (max<num3){
            max=num3;
        }
        return max;
    }

    private static int smallest(int num1, int num2, int num3) {
        int min= num1;
        if (min>num2){
            min=num2;
        }
        if (min>num3){
            min=num3;
        }
        return min;
    }

}
