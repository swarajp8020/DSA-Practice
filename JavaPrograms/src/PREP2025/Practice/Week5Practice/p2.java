package PREP2025.Practice.Week5Practice;

/// PHASE-B → Sliding Window Expand-and-Shrink
/// Task	Sample Input	Expected
/// 5. Longest subarray sum ≤ X	arr=[2,1,5,1,3,2],X=7	4 → [2,1,5,1]
/// 6. Longest subarray sum = X	arr=[1,2,1,1,1,3],X=4	3 → [2,1,1]
/// 7. Longest subarray with Unique elements	arr=[1,2,3,1,2,3,4]	4 → [1,2,3,4]
/// 8. Exactly K distinct elements	arr=[1,2,1,2,3],k=2	3 → [1,2,1] or [2,1,2]
public class p2 {
/// Exactly K distinct elements
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        int k = 2;
        System.out.println(longestSubarrayUnique(arr, k));
    }
    static int longestSubarrayUnique(int[] arr, int k){
        int[] freq = new int[1001];
        int maxLen = 0;
        int unique = 0;
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (freq[arr[right]]==0)unique++;
            freq[arr[right]]++;
            while (unique>k){
                freq[arr[left]]--;
                if (freq[arr[left]]==0) unique--;
                left++;
            }
           if (unique==k){
               maxLen = Math.max(maxLen, right-left+1);
           }
        }
        return maxLen;
    }
/// Longest subarray with Unique elements
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,1,2,3,4};
//        System.out.println(longestSubarrayUnique(arr));
//    }
//    static int longestSubarrayUnique(int[] arr){
//        int[] freq = new int[1001];
//        int maxLen = 0;
//        int left = 0;
//        for (int right = 0; right < arr.length; right++) {
//            freq[arr[right]]++;
//            while (freq[arr[right]]>1){
//                freq[arr[left]]--;
//                left++;
//            }
//            maxLen = Math.max(maxLen, right-left+1);
//        }
//        return maxLen;
//    }
/// Longest subarray sum = X
//    public static void main(String[] args) {
//        int[] arr = {1,2,1,1,1,3};
//        int x = 4;
//        System.out.println(longestSubarraySumX(arr,x));
//    }
//    static int longestSubarraySumX(int[] arr, int x){
//        int maxLen = 0;
//        int windowSum = 0;
//        int left = 0;
//        for (int right = 0; right < arr.length; right++) {
//            windowSum += arr[right];
//            while (windowSum>x){
//                windowSum -= arr[left];
//                left++;
//            }
//            if (windowSum ==x){
//                maxLen = Math.max(maxLen, right-left+1);
//            }
//        }
//        return maxLen;
//    }
    /// Longest subarray sum ≤ X
//    public static void main(String[] args) {
//        int[] arr = {2,1,5,1,3,2};
//        int x = 7;
//        System.out.println(longestSubarraySumX(arr,x));
//    }
//    static int longestSubarraySumX(int[] arr, int x){
//        int maxLen = 0;
//        int windowSum = 0;
//        int left = 0;
//        for (int right = 0; right < arr.length; right++) {
//            windowSum += arr[right];
//            while (windowSum>x){
//                windowSum -= arr[left];
//                left++;
//            }
//            maxLen = Math.max(maxLen, right-left+1);
//        }
//        return maxLen;
//    }
}
