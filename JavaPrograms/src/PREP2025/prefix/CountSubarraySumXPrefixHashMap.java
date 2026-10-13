package PREP2025.prefix;

import java.util.HashMap;

public class CountSubarraySumXPrefixHashMap {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,1,3};
        int X =5;
        System.out.println(countSubarraysXPrefixHashMap(arr,X));
    }
    static int countSubarraysXPrefixHashMap(int[] arr, int X){
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int num : arr){
            prefixSum+=num;
            if (map.containsKey(prefixSum-X)){
                count+=map.get(prefixSum-X);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
