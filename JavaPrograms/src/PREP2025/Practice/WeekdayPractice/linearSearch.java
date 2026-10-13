package PREP2025.Practice.WeekdayPractice;
//Problem:
//Given an array of integers, find whether a number exists in it.
//Return the index if found, else return -1.
//
//Example:
//
//Input: arr = [4, 8, 15, 16, 23, 42], target = 23
//Output: 4
public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 8, 15, 16, 23, 42};
        int target = 23;
        int result = search(arr, target);
        if (result == -1){
            System.out.println("-1");
        } else {
            System.out.println("Found: "+result);
        }
    }
    static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
