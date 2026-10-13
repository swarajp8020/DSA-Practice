package PREP2025.Practice.WeekdayPractice;


public class Nov27Morning {
/// 1. Longest Unique Subarray
/// freq[]
/// duplicate → shrink left
//public static void main(String[] args) {
//    int[] arr = {2,3,4,2,3,5};
//    System.out.println(longestUnique(arr));
//}
//static int longestUnique(int[] arr){
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

/// 2. Longest Subarray Sum ≤ X
/// expand right
/// shrink left when sum > X
//public static void main(String[] args) {
//    int[] arr = {2,3,4,1,2,3};
//    int x = 5;
//    System.out.println(longestSubarrayX(arr,x));
//}
//static int longestSubarrayX(int[]arr, int x){
//    int windowSum = 0;
//    int left = 0;
//    int maxLen = 0;
//    for (int right = 0; right < arr.length; right++) {
//        windowSum+=arr[right];
//        while (windowSum>x){
//            windowSum -= arr[left];
//            left++;
//        }
//        maxLen = Math.max(maxLen, right-left+1);
//    }
//    return maxLen;
//}

/// 3. Subarrays of size K divisible by 3 (or even)
/// fixed window update using sum += new - old

public static void main(String[] args) {
    int[] arr = {2,3,4,1,2,3};
    int k = 3;
    System.out.println(longestEvenSubarrayK(arr,k));
}
    static int longestEvenSubarrayK(int[]arr, int k){
        int windowSum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        if (windowSum%2==0) count++;
        for (int i = k; i < arr.length; i++) {
            windowSum+=arr[i]-arr[i-k];
            if (windowSum%2==0)count++;
        }
        return count;
}






/// Longest Sum ≤ X
//public static void main(String[] args) {
//    int[] arr = {1,2,3,4,5,6};
//    int x = 2;
//    int res = longestSumX(arr,x);
//    System.out.println(res);
//}
//static int longestSumX(int[] arr, int  x){
//    int maxLen = 0;
//    int left = 0;
//    int windowSum=0;
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
/// Longest Unique Subarray
//public static void main(String[] args) {
//    int[] arr = {1,2,3,4,5,6};
//    System.out.println(longesUniqueSubarray(arr));
//}
//static int longesUniqueSubarray(int[] arr){
//    int[] freq = new int[1001];
//    int maxLen = 0;
//    int left = 0;
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


/// Count subarrays of size K with even / %3
//public static void main(String[] args) {
//    int[] arr = {3,4,1,23,4,5,30};
//    int k = 3;
//    int res = longestSubArrayEvenK(arr,k);
//    System.out.println(res);
//}
//static int longestSubArrayEvenK(int[] arr, int k){
//    int count = 0;
//    int windowSum =0;
//    for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//
//    if (windowSum%2==0)count++;
//
//    for (int i = k; i < arr.length; i++) {
//        windowSum += arr[i] - arr[i-k];
//        if (windowSum%2==0)count++;
//    }
//    return count;
//
//}

    /// Min Sum K
//    public static void main(String[] args) {
//        int[] arr = {2,3,4,1,2,3};
//        int k = 3;
//        int res = minSumSubArrayK(arr,k);
//        System.out.println(res);
//    }
//    static int minSumSubArrayK(int[] arr, int k){
//        int minSum = 0;
//        int windowSum = 0;
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
/// Max Sum K
//public static void main(String[] args) {
//    int[] arr = {2,3,4,1,2,3};
//    int k = 3;
//    int res = maxSumSubArrayK(arr,k);
//    System.out.println(res);
//}
//static int maxSumSubArrayK(int[] arr, int k){
//    int maxSum = 0;
//    int windowSum = 0;
//    for (int i = 0; i < k; i++) {
//        windowSum += arr[i];
//    }
//    maxSum = windowSum;
//    for (int i = k; i < arr.length; i++) {
//        windowSum += arr[i]-arr[i-k];
//        maxSum = Math.max(windowSum, maxSum);
//    }
//    return maxSum;
//}

/// Remove Duplicates (sorted)
//public static void main(String[] args) {
//    int[] arr = {1,1,1,2,2,2,3,3,3,3};
//    int res = removeDuplicates(arr);
//    System.out.println(res);
//    System.out.println(Arrays.toString(arr));
//}
//static int removeDuplicates(int[] arr){
//    if (arr.length==0) return 0;
//    int slow = 0;
//    for (int fast = 1; fast < arr.length; fast++) {
//        if (arr[fast]!=arr[slow]){
//            slow++;
//            arr[slow] = arr[fast];
//        }
//    }
//    return slow+1;
//}

/// Move Zeros
//public static void main(String[] args) {
//    int[] arr = {5,0,2,3,0,23,0,2,2,3};
//    moveZeros(arr);
//    System.out.println(Arrays.toString(arr));
//}
//static void moveZeros(int[] arr){
//    int slow=0;
//    for (int fast = 0; fast < arr.length; fast++) {
//        if (arr[fast]!=0){
//            int temp = arr[slow];
//            arr[slow] = arr[fast];
//            arr[fast] = temp;
//            slow++;
//            }
//        }
//    }
}
