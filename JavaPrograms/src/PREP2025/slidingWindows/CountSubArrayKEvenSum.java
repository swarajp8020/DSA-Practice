package PREP2025.slidingWindows;

public class CountSubArrayKEvenSum {
    public static void main(String[] args) {
        int[] arr = {4,2,4,6,2,3};
        int k =3;
        System.out.println(evenSum(arr,k));
    }
    // Step 1: Build first window
    static int evenSum(int[] arr, int k){
        int windowSum =0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        if (windowSum % 2 == 0) count++;

        // Step 2: Slide window
        for (int i = k; i < arr.length; i++) {
            windowSum+=arr[i] - arr[i-k];
            if (windowSum%2==0)count++;
        }
        return count;

    }
}
