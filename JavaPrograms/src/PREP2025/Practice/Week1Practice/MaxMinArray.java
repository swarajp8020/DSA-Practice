package Week1Practice;
//Given an array of integers, find the largest and smallest number
// without using built-in functions like Arrays.sort().
public class MaxMinArray {
    public static void main(String[] args) {
       int[] arr = {10, 2, 30, 14, 7};
       int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
                System.out.println(max);
            } else if (arr[i]<min) {
                min =arr[i];
                System.out.println(min);
            }
        }
    }
}
