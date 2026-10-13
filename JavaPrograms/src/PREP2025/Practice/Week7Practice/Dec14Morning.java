package PREP2025.Practice.Week7Practice;

public class Dec14Morning {
/// CountSubArrayKEvenSum
    static void main() {
        int[] arr = {4,2,4,6,2,3};
        int k =3;
        System.out.println(evenSum(arr,k));
    }
    static int evenSum(int[] arr, int k){
        int count = 0, windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        if (windowSum%2==0)count++;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i-k];
            if (windowSum%2==0)count++;
        }
        return count;
    }


/// CountAtLeastXEven
//static void main() {
//    int[] arr = {1,4,6,2,2,15,2,1};
//    int k =3;
//    int x = 2;
//    int res = countEvenSubarray(arr,k,x);
//    System.out.println(res);
//}
//static int countEvenSubarray(int[] arr, int k, int x){
//    int evenCount = 0, count = 0;
//    for (int i = 0; i < k; i++) {
//        if (arr[i]%2==0)evenCount++;
//    }
//    if (evenCount>=x)count++;
//    for (int i = k; i < arr.length; i++) {
//        if (arr[i-k]%2==0) evenCount--;
//        if (arr[i]%2==0) evenCount++;
//        if (evenCount>=x) count++;
//    }
//    return count;
//}
//


/// LongestSubarrayKDistinct
//    static void main() {
//        int[] arr = {1,2,1,2,3,4,4,5};
//        int k = 2;
//        System.out.println(longestSubarrayK(arr,k));
//    }
//    static int longestSubarrayK(int[] arr, int k){
//        int[] temp = new int[1001];
//        int left =0,unique =0, maxLen =0;
//        for (int right = 0; right < arr.length; right++) {
//            if (temp[arr[right]]==0) unique++;
//            temp[arr[right]]++;
//            while (unique>k){
//                temp[arr[left]]--;
//                if (temp[arr[left]]==0)unique--;
//                left++;
//            }
//            if (unique==k){
//                maxLen=Math.max(maxLen,right-left+1);
//            }
//        }
//        return maxLen;
//    }
}
