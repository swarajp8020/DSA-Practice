package PREP2025.prefix;

public class CountSubarraysSumXPrefix {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,1,3};
        int x = 5;
        System.out.println(countSubarraysSumXPrefix(arr,x));
    }
    static int countSubarraysSumXPrefix(int[] arr, int x) {
        int n = arr.length;
        int[] prefix = new int[n + 1];
        prefix[0] = 0;

        // build PREP2025.prefix: PREP2025.prefix[i] = sum of arr[0..i-1]
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        int count = 0;
        // sum of arr[start..end] = PREP2025.prefix[end+1] - PREP2025.prefix[start]
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = prefix[end + 1] - prefix[start];
                if (sum == x) count++;
            }
        }
        return count;
    }

}
