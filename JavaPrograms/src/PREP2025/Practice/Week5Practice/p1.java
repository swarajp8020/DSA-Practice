package PREP2025.Practice.Week5Practice;
/// PHASE-A → Fixed Window (warm-ups)
/// These should feel like breathing.
/// Task	Example Input	Output
/// 	arr=[1,3,2,5,1], k=3	10 → [3,2,5]
/// 2. Min Sum of size K	same arr	6 → [1,3,2]
/// 3. Count subarrays size K divisible by 2	arr=[2,3,4,1,2],k=3	2
/// 4. Count subarrays size K with sum % 3 == 0	arr=[3,1,2,6,4],k=3	3
public class p1 {
    ///  Count subarrays size K with sum % 3
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2};
        int k = 3;
        System.out.println(countSubarrayK(arr,k));
    }
    static int countSubarrayK(int[] arr, int k){
        int count = 0;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        if(windowSum%3==0) count++;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i-k];
            if (windowSum%3==0) count++;
        }
        return count;
    }
    /// 3. Count subarrays size K divisible by 2
//    public static void main(String[] args) {
//        int[] arr = {2,3,4,1,2};
//        int k = 3;
//        System.out.println(countSubarrayK(arr,k));
//    }
//    static int countSubarrayK(int[] arr, int k){
//        int count = 0;
//        int windowSum = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        if(windowSum%2==0) count++;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i] - arr[i-k];
//            if (windowSum%2==0) count++;
//        }
//        return count;
//    }


    /// 2. Min Sum of size K
//    public static void main(String[] args) {
//        int[] arr = {1,3,2,5,1};
//        int k =3;
//        System.out.println(minSubarrayK(arr,k));
//    }
//    static int minSubarrayK(int[] arr, int k){
//        int windowSum = 0;
//        int minSum = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        minSum = windowSum;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i]-arr[i-k];
//            minSum = Math.min(minSum, windowSum);
//        }
//        return minSum;
//    }



    /// 1. Max Sum of size K
//    public static void main(String[] args) {
//        int[] arr = {1,3,2,5,1};
//        int k =3;
//        System.out.println(maxSubarrayK(arr,k));
//    }
//    static int maxSubarrayK(int[] arr, int k){
//        int windowSum = 0;
//        int maxSum = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        maxSum = windowSum;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i]-arr[i-k];
//            maxSum = Math.max(maxSum, windowSum);
//        }
//        return maxSum;
//    }
}
