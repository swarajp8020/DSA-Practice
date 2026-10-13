package PREP2025.prefix;

import java.util.HashMap;

/// Count Subarrays with Sum Divisible by K
///Example: arr = [2,4,3,9] , k = 3
/// Result = 4 → [3], [9], [2,4,3], [4,3,9]
public class CountSubarraySumDivKPrefixHashMap {
    public static void main(String[] args) {
        int[] arr = {2,4,3,9};
        int k = 3;
        System.out.println(countSubarraySumDivK(arr,k));
    }
    static int countSubarraySumDivK(int[] arr, int k){
        int count = 0, prefixSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1); // important -> remainder 0 exists before start

        for(int num : arr){

            prefixSum += num;
            int rem = prefixSum % k;

            if(rem < 0) rem += k;  // handles negative numbers

            if(map.containsKey(rem)){
                count += map.get(rem); // add how many times same remainder seen
            }

            map.put(rem, map.getOrDefault(rem,0)+1);
        }
        return count;
    }

}
