package PREP2025.arrays;
//"Closest element to target
//Problem: Find the element in the array closest to a given target.
//Example:
//Input: arr = [4, 9, 1, 32, 13], target = 10
//Output: 9
//🧠 Hint:
//Use Math.abs(arr[i] - target) to calculate difference.
//Keep track of smallest difference and corresponding element."
public class ClosestElement {
    public static void main(String[] args) {
        int[] arr ={4, 9, 1, 32, 13};
        int target = 10;

        int closest = arr[0];
        int minDiff = Math.abs(arr[0] - target);

        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - target);

            if (diff<minDiff){
                minDiff = diff;
                closest = arr[i];
            }
        }
        System.out.println(closest);
    }
}
