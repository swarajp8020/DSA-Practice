package PREP2025.Practice.WeekdayPractice;

public class Nov27Afternoon {
    /// Phase-A Fixed Window (easy warm-up)
    /// A1. Max sum of subarray size K
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int k = 3;
//        int res = maxSumSubArrayK( arr,  k);
//        System.out.println(res);
//    }
//    static int maxSumSubArrayK(int[] arr, int k){
//        int windowSum = 0;
//        int maxSum = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        maxSum = windowSum;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i]-arr[i-k];
//            maxSum = Math.max(windowSum, maxSum);
//        }
//        return maxSum;
//    }
//    /// A2. Min sum of subarray size K
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int k = 3;
//        int res = minSumSubArrayK( arr,  k);
//        System.out.println(res);
//    }
//    static int minSumSubArrayK(int[] arr, int k){
//        int windowSum = 0;
//        int minSum = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        minSum = windowSum;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i]-arr[i-k];
//            minSum = Math.min(windowSum, minSum);
//        }
//        return minSum;
//    }
    ///  A3. Count subarrays size K divisible by X (even / %3)
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        int res = countSubarrayK( arr,  k);
        System.out.println(res);
    }
    static int countSubarrayK(int[] arr, int k){
        int count= 0;
        int windowSum = 0;
        int left = 0;
        for (int righht = 0; righht < k; righht++) {
            windowSum += arr[righht];
        }
        if (windowSum%2==0)count++;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i-k];
            if (windowSum%2==0)count++;
        }
        return count;
    }

}
