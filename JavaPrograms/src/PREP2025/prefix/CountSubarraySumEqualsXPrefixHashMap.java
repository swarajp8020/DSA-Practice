package PREP2025.prefix;

import java.util.HashMap;

public class CountSubarraySumEqualsXPrefixHashMap {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, -2, 3};
        System.out.println(countSubarraySumZero(arr));
    }
    static int countSubarraySumZero(int[] arr){
        int count=0,prefixSum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for (int num:arr){
            prefixSum+=num;
            if (map.containsKey(prefixSum)){
                count+=map.get(prefixSum);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
