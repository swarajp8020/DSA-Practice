package PREP2026;

import java.util.Arrays;
import java.util.HashMap;

public class nov1Practice {

    static int[] add2Nums(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    static void main(String[] args) {
        int[] nums = {2,3,5,6};
        int target = 8;
        int[] res = add2Nums(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
