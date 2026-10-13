package PREP2025.stage1;

import java.util.Scanner;

public class PracticeJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and PREP2025.string: ");
        int i = sc.nextInt();
        String j = sc.next();
        if(i >= 1 && i <= 10){
            System.out.println("Hi "+i);
        } else  {
            System.out.println(j);
        }
        sc.close();
    }
}
