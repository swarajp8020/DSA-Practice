package PREP2025.Practice.WeekdayPractice;
/// PHASE B (Prime muscle 30–40 mins)
public class Nov28Morning {
/// Longest Subarray Sum ≤ X (no peek)
public static void main(String[] args) {
    int[] arr= {1,2,1,1,3,2};
    int x= 4;
    System.out.println(longestUniqueSubarrayX(arr,x));
}
    static int longestUniqueSubarrayX(int[] arr, int x){
        int windowSum = 0;
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < arr.length; right++) {
            windowSum += arr[right];
            while (windowSum>x){
                windowSum -= arr[left];
                left++;
        }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }

/// Longest Unique Subarray (no peek)
//public static void main(String[] args) {
//    int[] arr= {1,2,3,4,5,6,7};
//    System.out.println(longestUniqueSubarray(arr));
//}
//static int longestUniqueSubarray(int[] arr){
//    int[] freq = new int[1001];
//    int left = 0;
//    int maxLen = 0;
//    for (int right = 0; right < arr.length; right++) {
//        freq[arr[right]]++;
//        while (freq[arr[right]]>1){
//            freq[arr[left]]--;
//            left++;
//        }
//        maxLen = Math.max(maxLen, right-left+1);
//    }
//    return maxLen;
//}















//    /// ✔ Longest Subarray with Exactly K Distinct  ← new checkpoint [3 times peek]
//    public static void main(String[] args) {
//        int[] arr = {3,1,2,5,4,6};
//        int k =3;
//        System.out.println(exactlyKDistinct(arr,k));
//    }
//    static int exactlyKDistinct(int[] arr, int k){
//        int[] freq = new int[1001];
//        int unique = 0;
//        int left = 0;
//        int maxLen = 0;
//        for (int right = 0; right < arr.length; right++) {
//            if (freq[arr[right]]==0) unique++;
//            freq[arr[right]]++;
//
//            while (unique>k){
//                freq[arr[left]]--;
//                if (freq[arr[left]]==0)unique--;
//                left++;
//            }
//            if (unique==k) {
//                maxLen = Math.max(maxLen, right - left + 1);
//            }
//        }
//        return maxLen;
//
//    }

/// ✔ Longest Unique Subarray
//public static void main(String[] args) {
//    int[] arr = {3,1,2,5,4,6};
//    System.out.println(longestUniqueSubarray(arr));
//}
//static int longestUniqueSubarray(int[] arr){
//    int[] freq = new int[1001];
//    int left = 0;
//    int maxLem = 0;
//    for (int right = 0; right < arr.length; right++) {
//        freq[arr[right]]++;
//        while (freq[arr[right]]>1){
//            freq[arr[left]]--;
//            left++;
//        }
//        maxLem = Math.max(maxLem, right-left+1);
//    }
//    return maxLem;
//}


/// ✔ Longest Sum = X
//public static void main(String[] args) {
//    int[] arr = {3,1,2,5,4,6};
//    int x = 5;
//    int res = longestSumX(arr,x);
//    System.out.println(res);
//}
//static int longestSumX(int[] arr, int x){
//    int windowSum= 0;
//    int left=0;
//    int maxLen = 0;
//    for (int right = 0; right < arr.length; right++) {
//        windowSum += arr[right];
//        while (windowSum>x){
//            windowSum -= arr[left];
//            left++;
//        }
//        if (windowSum==x){
//            maxLen = Math.max(maxLen, right-left+1);
//        }
//    }
//    return maxLen;
//}


/// ✔ Longest Sum ≤ X
//public static void main(String[] args) {
//    int[] arr = {3,1,2,5,4,6};
//    int x = 5;
//    int res = longestSumX(arr,x);
//    System.out.println(res);
//}
//static int longestSumX(int[] arr, int x){
//    int windowSum= 0;
//    int left=0;
//    int maxLen = 0;
//    for (int right = 0; right < arr.length; right++) {
//        windowSum += arr[right];
//        while (windowSum>x){
//            windowSum -= arr[left];
//            left++;
//        }
//        maxLen = Math.max(maxLen, right-left+1);
//    }
//    return maxLen;
//}



    /// ✔ Max Sum K
//    public static void main(String[] args) {
//        int[] arr = {3,5,2,1,4,6};
//        int k = 3;
//        int res = maxSumSubArrayK(arr, k);
//        System.out.println(res);
//    }
//    static int maxSumSubArrayK(int[] arr, int k){
//        int maxSum = 0;
//        int windowSum = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        maxSum = windowSum;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i] - arr[i-k];
//            maxSum = Math.max(maxSum, windowSum);
//        }
//        return maxSum;
//    }
///// ✔ Min Sum K
//public static void main(String[] args) {
//    int[] arr = {3,5,2,1,4,6};
//    int k = 3;
//    int res = minSumSumSubArrayK(arr, k);
//    System.out.println(res);
//}
//    static int minSumSumSubArrayK(int[] arr, int k){
//        int minSum = 0;
//        int windowSum = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        minSum = windowSum;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i] - arr[i-k];
//            minSum = Math.min(minSum, windowSum);
//        }
//        return minSum;
//    }

    /// ✔ Count K divisible by 2 or 3
//public static void main(String[] args) {
//    int[] arr = {3,5,2,1,4,6};
//    int k = 3;
//    int res = countSubarrayDivK(arr, k);
//    System.out.println(res);
//}
//    static int countSubarrayDivK(int[] arr, int k) {
//        int count = 0;
//        int windowSum = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        if (windowSum%2==0) count++;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i]-arr[i-k];
//            if (windowSum%2==0)count++;
//        }
//        return count;
//    }
}
