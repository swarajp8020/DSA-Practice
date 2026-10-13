package PREP2025.slidingWindows;

import java.util.Arrays;

/// Longest Subarray with Sum Exactly = X
public class LongestSubarrayEqualsX {
    public static void main(String[] args) {
        int[] arr = {4,1,1,2,1,3};
        int x = 5;
        System.out.println(longestSubarrayEqualsX(arr,x));
        System.out.println(Arrays.toString(arr));
    }
    static int longestSubarrayEqualsX(int[] arr, int x){
        int windowSum = 0;
        int left = 0;
        int maxLen =0;
        for (int right = 0; right < arr.length; right++) {
            windowSum += arr[right];
            while (windowSum >x){
                windowSum -= arr[left];
                left++;
            }
            if (windowSum == x){
                maxLen = Math.max(maxLen, right-left+1);
            }
        }
        return maxLen;
    }
}
