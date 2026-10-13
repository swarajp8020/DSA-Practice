package PREP2025.slidingWindows;

public class CountSubarraysWithSumX {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2,5,6};
        int x = 3;
        int res = countSubarraysWithSumX(arr,x);
        System.out.println(res);
    }
    static int countSubarraysWithSumX(int[] arr, int x){
        int left = 0;
        int count = 0;
        int sum = 0;
        for (int right = 0; right < arr.length; right++) {
            sum+=arr[right];
            while (sum>x){
                sum-=arr[left];
                left++;
            }
            if (sum==x)count++;
        }
        return count;
    }
}
