package PREP2025.Practice.Week5Practice;

import java.util.Arrays;
import java.util.HashMap;

/// Q1) Count Subarrays With Sum Exactly = X
/// (arr may contain positive + negative numbers)
/// Input:
/// arr = [4,1,2,1,1,3]
/// X = 5
public class CountSubarraysSumExactlyX {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,1,3};
        int x = 5;
        System.out.println(countSubarraySumExactlyK(arr,x));
        System.out.println(Arrays.toString(arr));
    }
    static int countSubarraySumExactlyK(int[] arr, int x){
        int count = 0, prefixSum = 0;
        HashMap<Integer, Integer>map = new HashMap<>();
        map.put(0,1);
        for (int num:arr){
            prefixSum+=num;
            if (map.containsKey(prefixSum-x)){
                count+=map.get(prefixSum-x);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
