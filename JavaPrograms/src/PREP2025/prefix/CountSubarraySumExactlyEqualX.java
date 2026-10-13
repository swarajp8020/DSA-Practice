package PREP2025.prefix;

public class CountSubarraySumExactlyEqualX {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,1,3};
        int x = 5;
        System.out.println(countSubarraysSumX(arr,x));
    }
    // Count subarrays whose sum == X
    static int countSubarraysSumX(int[] arr, int x) {
        int count = 0;

        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];        // expand window to the right
                if (sum == x) {
                    count++;            // found one valid subarray
                }
            }
        }

        return count;
    }

}
