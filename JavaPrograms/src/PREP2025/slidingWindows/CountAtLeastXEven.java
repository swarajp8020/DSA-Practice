package PREP2025.slidingWindows;

public class CountAtLeastXEven {
    ///countEvenSubarrays
    public static void main(String[] args) {
        int[] arr = {1,4,6,2,2,15,2,1};
        int k =3;
        int x = 2;
        int res = countEvenSubarrays(arr, k, x);
        System.out.println(res);
    }
    static  int countEvenSubarrays(int[] arr, int k, int x){
        int evenCount =0;
        int count=0;
        for (int i = 0; i < k; i++) {
            if (arr[i]%2==0) evenCount++;
        }
        if (evenCount>=x) count++;
        for (int i = k; i < arr.length; i++) {
            if (arr[i-k]%2==0) evenCount--;
            if (arr[i]%2==0) evenCount++;
            if (evenCount>=x) count++;
        }
        return count;
    }
}
