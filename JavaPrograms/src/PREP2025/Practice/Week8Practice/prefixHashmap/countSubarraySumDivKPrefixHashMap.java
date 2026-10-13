package PREP2025.Practice.Week8Practice.prefixHashmap;

import java.util.HashMap;

public class countSubarraySumDivKPrefixHashMap {
    static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(countSubarraySumDivK(arr,k));
    }
    static int countSubarraySumDivK(int[] arr, int k){
        int count = 0, prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int num: arr){
            prefixSum += num;
            int rem = prefixSum % k;
            if (rem > 0) rem += k;
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }
        return count;
    }
}
