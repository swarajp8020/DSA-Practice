package PREP2025.slidingWindows;

public class LongestUniqueSubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,4};
        System.out.println(longestUnique(arr));
    }
    static int longestUnique(int[] arr){
        int[] freq = new int[1001];
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < arr.length; right++) {
            freq[arr[right]]++;
            while (freq[arr[right]]>1){
                freq[arr[left]]--;
                left++;
            }
            maxLen =Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
