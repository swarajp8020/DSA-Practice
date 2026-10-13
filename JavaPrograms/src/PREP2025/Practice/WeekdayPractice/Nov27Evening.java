package PREP2025.Practice.WeekdayPractice;
/// PHASE-B (the tricky one you struggled earlier)
public class Nov27Evening {
    /// B1 → Longest subarray sum ≤ X
//    public static void main(String[] args) {
//        int[] arr = {3,4,1,3,5,2};
//        int x = 2;
//        int res = longestSubarrayX(arr, x);
//        System.out.println(res);
//    }
//    static int longestSubarrayX(int[] arr, int x){
//        int windowSum = 0;
//        int maxLen = 0;
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
    /// B2 → Longest subarray sum = X
//    public static void main(String[] args) {
//        int[] arr = {3,4,1,3,5,2};
//        int x = 2;
//        int res = longestSubarrayX(arr, x);
//        System.out.println(res);
//    }
//    static int longestSubarrayX(int[] arr, int x){
//        int windowSum = 0;
//        int maxLen = 0;
//        int left = 0;
//        for (int right = 0; right < arr.length; right++) {
//            windowSum += arr[right];
//            while (windowSum>x){
//                windowSum -= arr[left];
//                left++;
//            }
//            if (windowSum == x){
//                maxLen = Math.max(maxLen, right-left+1);
//            }
//        }
//        return maxLen;
//    }

    /// B3 → Longest Unique Subarray (PEek 1 time)
//    public static void main(String[] args) {
//        int[] arr = {4,2,1,6,3,5};
//        System.out.println(longestUniqueSubarray(arr));
//    }
//    static int longestUniqueSubarray(int[] arr){
//        int[] freq = new int[1001];
//        int left = 0;
//        int maxLen = 0;
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
    /// Exactly K Distinct (PEEK 3times)
    public static void main(String[] args) {
        int[] arr = {4,2,1,6,3,5};
        int k = 3;
        System.out.println(longestDistinctK(arr,k));
    }
    static int longestDistinctK(int[] arr, int k){
        int[] freq = new int[1001];
        int left = 0;
        int unique = 0;
        int maxLen = 0;
        for (int right = 0; right < arr.length; right++) {
            if (freq[arr[right]]==0) unique++;
            freq[arr[right]]++;
            while (unique>k){
                freq[arr[left]]--;
                if (freq[arr[left]]==0) unique--;
                left++;
            }
            if (unique==k) maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }

}
