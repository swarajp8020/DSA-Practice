package PREP2025.Practice.WeekdayPractice;

public class Nov26Evening {

    ///

    public static void main(String[] args) {
        int[] arr ={14,151,51,51,5};
        int k = 3;
        int res = longestDistinctK(arr,k);
        System.out.println(res);
    }
    static int longestDistinctK(int[] arr, int k){
        int[] freq = new int[1001];
        int unique = 0;
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < arr.length; right++) {
            if (freq[arr[right]]==0) unique++;
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

    /// Longest Subarray Sum X
//    public static void main(String[] args) {
//        int[] arr ={14,151,51,51,5};
//        int x = 10;
//        int res = longestXArray(arr,x);
//        System.out.println(res);
//    }
//    static int longestXArray(int[] arr, int x){
//        int windowSum = 0;
//        int left = 0;
//        int maxLen = 0;
//        for (int right = 0; right < arr.length; right++) {
//            windowSum += arr[right];
//            while (windowSum>x){
//                windowSum -= arr[left];
//                left++;
//        }
//            maxLen = Math.max(maxLen, right-left+1);
//        }
//        return maxLen;
//    }


    /// Longest Unique Subarray
//    public static void main(String[] args) {
//        int[] arr ={14,151,51,51,5};
//        int res = longestUnique(arr);
//        System.out.println(res);
//    }
//    static int longestUnique(int[] arr){
//        int[] freq = new int[1001];
//        int left = 0;
//        int maxLen = 0;
//        for (int right = 0; right < arr.length; right++) {
//            freq[arr[right]]++;
//
//            while (freq[arr[right]]>1){
//                freq[arr[left]]--;
//                left++;
//            }
//            maxLen = Math.max(maxLen, right-left+1);
//        }
//        return maxLen;
//    }
}
