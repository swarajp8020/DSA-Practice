package PREP2026;

import java.util.HashSet;

public class ContainsDuplicate {

    //brute force approach
//    public boolean contDup(int[] nums){
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] == nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public boolean contDup(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for (int num: nums){
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    static void main() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int[] nums = {1, 2, 4, 5};

        boolean result = containsDuplicate.contDup(nums);
        System.out.println(result);
    }
}
