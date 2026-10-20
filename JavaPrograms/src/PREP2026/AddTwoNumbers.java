package PREP2026;

import java.util.Arrays;
import java.util.HashMap;

public class AddTwoNumbers {
    static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        return nums;
    }

    static void main() {
        int[] nums = {2, 3, 4};
        int target = 7;
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}