package PREP2025.prefix;

import java.util.HashMap;

public class CountSubarraySumEqualsZeroX {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1};
        int x =3;
        System.out.println(countSubarraySumEqualsX(arr,x));
    }
    static int countSubarraySumEqualsX(int[] arr, int x){
        int count=0,prefixSum=0;
        HashMap<Integer, Integer>map=new HashMap<>();
        map.put(0,1);
        for (int num:arr){
            prefixSum+=num;
            if (map.containsKey(prefixSum-x)){
                count+=map.get(prefixSum-x);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
