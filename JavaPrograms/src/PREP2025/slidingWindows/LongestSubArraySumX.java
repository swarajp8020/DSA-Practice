package PREP2025.slidingWindows;

public class LongestSubArraySumX {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int x = 7;
        int res = longestXArray(arr,x);
        System.out.println(res);
    }
    static int longestXArray(int[] arr, int x){
        int maxLen = 0;
        int left = 0;
        int windowSum=0;
        for (int right = 0; right < arr.length; right++) {
            windowSum += arr[right];
            while (windowSum>x){
                windowSum -= arr[left];
                left++;
            }
            maxLen =Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
