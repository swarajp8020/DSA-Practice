package PREP2025.slidingWindows;

public class MaxSumSubarrayK {
    public static void main(String[] args) {
        int[] arr = {3,5,1,5,1,2};
        int k = 3;
        System.out.println(maxSum(arr,k));
    }
    static int maxSum(int[] arr, int k){
        int windowSum =0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum =windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] -arr[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
}
