package PREP2025.Practice.WeekdayPractice;

//2. Count occurrences of an element
//
//Problem:
//Given an array, count how many times a number appears.
//
//Example:
//
//Input: arr = [2, 3, 5, 3, 7, 3, 9], target = 3
//Output: 3
//
//
//🧠 Hint: Don’t break when you find the element — keep looping and count.
public class linearSearch2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 3, 7, 3, 9,3};
        int target = 3;
        int count = countOccurence(arr, target);
        if (count == -1){
            System.out.println("-1");
        } else {
            System.out.println("Count: "+ count);
        }
    }
    static int countOccurence(int[] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                count++;
            }
        }
        return count;
    }
}
