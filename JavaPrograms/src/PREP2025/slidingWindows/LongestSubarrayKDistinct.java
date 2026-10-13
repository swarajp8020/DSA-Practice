package PREP2025.slidingWindows;

public class LongestSubarrayKDistinct {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,4,4,5};
        int k = 2;
        System.out.println(longestExactlyK(arr, k)); // Expected output: 4  -> [1,2,1,2]
    }

    static int longestExactlyK(int[] arr, int K){
        int[] freq = new int[1001]; // value frequency tracker
        int unique = 0;              // how many distinct numbers in window
        int left = 0, maxLen = 0;

        for(int right = 0; right < arr.length; right++){

            // add new right element
            if(freq[arr[right]] == 0) unique++;
            freq[arr[right]]++;

            // if too many distinct → shrink window from left
            while(unique > K){
                freq[arr[left]]--;
                if(freq[arr[left]] == 0) unique--; // lost a unique number
                left++;
            }

            // only update when distinct == K
            if(unique == K){
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}
