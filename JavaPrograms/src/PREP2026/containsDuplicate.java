package PREP2026;

import java.util.HashSet;

public class containsDuplicate {

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

//    public boolean contDup(int[] nums){
//        HashSet<Integer> seen = new HashSet<>();
//        for (int num: nums){
//            if (seen.contains(num)) {
//                return true;
//            }
//            seen.add(num);
//        }
//        return false;
//    }
//
//    static void main() {
//        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
//
//        int[] nums = {1, 2, 4, 5};
//
//        boolean result = containsDuplicate.contDup(nums);
//        System.out.println(result);
//    }

//    Problem: Contains Duplicate — variation
//    Write a Java method that returns true if an array contains at least one duplicate, otherwise false.
//    Test these inputs:
//    int[] nums1 = {8, 3, 6, 2};
//    int[] nums2 = {8, 3, 6, 3};
//    int[] nums3 = {5, 5};
//    int[] nums4 = {9};
//
//
//    Expected results:
//    Input	Expected output
//    nums1	false
//    nums2	true
//    nums3	true
//    nums4	false

    public static boolean contDup(int[] nums){
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
        containsDuplicate containsDuplicate = new containsDuplicate();

        int[] nums1 = {8, 3, 6, 2};
        int[] nums2 = {8, 3, 6, 3};
        int[] nums3 = {5, 5};
        int[] nums4 = {9};

        System.out.println(PREP2026.containsDuplicate.contDup(nums1)); // false
        System.out.println(PREP2026.containsDuplicate.contDup(nums2)); // true
        System.out.println(PREP2026.containsDuplicate.contDup(nums3)); // true
        System.out.println(PREP2026.containsDuplicate.contDup(nums4)); // false

    }
}
