package PREP2025.Practice.WeekdayPractice;

public class maxSumSubArrayK {
    public static void main(String[] args) {
        int[] arr = {4,2,4,6,2,3};
        int k =3;
        System.out.println(maxSum(arr,k));
    }

    static int maxSum(int[] arr, int k){
        int windowSum =0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i]- arr[i-k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }























//    static int maxSum(int[] arr, int k){
//        int windowSum = 0;
//        int maxSum = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        maxSum = windowSum;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i] - arr[i-k];
//            maxSum = Math.max(windowSum, maxSum);
//        }
//        return maxSum;
//    }
}
