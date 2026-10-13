package PREP2025.stage1;

import java.util.Scanner;

public class ProductOfNum {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter a 1st Num: ");
            int num1 = in.nextInt();

            System.out.print("Enter a 2nd Num: ");
            int num2 = in.nextInt();

            productSum(num1,num2);
            in.close();
        }

        static int productSum(int num1, int num2) {
            int sum = num1 * num2;
            System.out.println(sum);
            return sum;
        }
    }
