package PREP2025.Practice.WeekdayPractice;

public class Nov25Evening {

/// Longest subarray sum ≤ X
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,2,1};
        int k = 3;
        int res = LongestUniqueSubarray(arr, k);
        System.out.println(res);
    }
    static int LongestUniqueSubarray(int[] arr, int k){
    int windowSum = 0;
    int left = 0;
    int maxLen = 0;
        for (int right = 0; right < arr.length; right++) {
            windowSum += arr[right];
            while (windowSum>k){
                windowSum -=  arr[left];
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }

/// Longest unique subarray
//public static void main(String[] args) {
//        int[] arr = {2,1,4,5,2,1};
//        int k = 3;
//        int res = LongestUniqueSubarray(arr, k);
//        System.out.println(res);
//    }
//    static int LongestUniqueSubarray(int[] arr, int k){
//    int[] freq = new int[1001];
//    int left = 0;
//    int maxLen = 0;
//        for (int right = 0; right < arr.length; right++) {
//            freq[arr[right]]++;
//            while (freq[arr[right]]>1){
//                freq[arr[left]]--;
//                left--;
//            }
//            maxLen = Math.max(maxLen, right-left+1);
//        }
//        return maxLen;
//    }


    /// Minimum subarray sum of size K
//    public static void main(String[] args) {
//        int[] arr = {2,1,4,5,2,1};
//        int k = 3;
//        int res =minSumSubArrayK(arr, k);
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
//            windowSum += arr[i] - arr[i-k];
//            minSum = Math.min(windowSum,minSum);
//        }
//        return minSum;
//    }

    /// Subarrays of size K divisible by 3
//    public static void main(String[] args) {
//        int[] arr = {2,1,4,5,2,1};
//        int k = 3;
//        int res =countEvenSubArrayK(arr, k);
//        System.out.println(res);
//    }
//    static int countEvenSubArrayK(int[] arr, int k){
//        int count = 0;
//        int windowSum= 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        if (windowSum%3 == 0) count++;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i] - arr[i-k];
//            if (windowSum%3==0)count++;
//        }
//        return count;
//    }

/// Count even sum subarrays of size K
//public static void main(String[] args) {
//    int[] arr = {2,1,4,5,2,1};
//    int k = 3;
//    int res =countEvenSubArrayK(arr, k);
//    System.out.println(res);
//}
//static int countEvenSubArrayK(int[] arr, int k){
//    int count = 0;
//    int windowSum= 0;
//    for (int i = 0; i < k; i++) {
//        windowSum += arr[i];
//    }
//    if (windowSum%2 == 0) count++;
//    for (int i = k; i < arr.length; i++) {
//        windowSum += arr[i] - arr[i-k];
//        if (windowSum%2==0)count++;
//    }
//    return count;
//}

    /// Max sum subarray of size K
//    public static void main(String[] args) {
//        int[] arr = {2,1,4,5,2,1};
//        int k = 3;
//        int res =maxSumSubArrayK(arr, k);
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
//            windowSum += arr[i] - arr[i-k];
//            maxSum = Math.max(windowSum,maxSum);
//        }
//        return maxSum;
//    }
}
