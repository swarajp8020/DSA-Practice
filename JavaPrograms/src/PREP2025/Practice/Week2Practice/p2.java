package Week2Practice;
//"Count occurrences of a number
//Problem:Given an array, count how many times a number appears.
//Example:
//Input: arr = [2, 3, 5, 3, 7, 3, 9], target = 3
//Output: 3
//🧠 Hint: Use a counter, don’t stop early — count all appearances."
public class p2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 5, 3, 7, 3, 9, 3, 3};
        int target = 3;
        int count = countOccurrence(arr,target);
        if (count == -1 ){
            System.out.println("Not found: ");
        } else {
            System.out.println("found "+count);
        }
    }
    static int countOccurrence(int[] arr, int target){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                count++;
            }
        }
        return count;
    }
}
