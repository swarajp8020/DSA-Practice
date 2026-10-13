package Week1Practice;
//Problem:
//Given an array of integers and a target value, check if the target exists in the array.
//If found, print its index. If not found, print “Not found.”
//
//Example:
//Input:
//arr = {3, 8, 1, 9, 5}
//target = 9
//Output:
//Element found at index 3

public class LinearSearchArray {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 9, 5};
        int target = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                System.out.println("Found index");
                break;
            } else {
                System.out.println("Not Found index");
            }
        }
    }
}
