package PREP2025.stage1;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = new String[5];
        System.out.println("Enter 5 PREP2025.string: ");

        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(str));
        scanner.close();

        //
//        int[] arr = new int[5];
//        System.out.println("Enter 5 PREP2025.arrays: ");
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//
//        scanner.close();
    }
}