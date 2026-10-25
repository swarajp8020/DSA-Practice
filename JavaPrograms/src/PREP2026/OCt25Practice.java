package PREP2026;

import java.util.HashSet;
//Contains DUplicate practice
public class OCt25Practice {
//    static boolean containsDup(int[] nums){
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (set.contains(nums[i])){
//                return true;
//            }
//            set.add(nums[i]);
//        }
//        return false;
//    }
    static boolean containsDup(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    static void main() {
        int[] nums = {3,5,7};
        System.out.println(containsDup(nums));
    }
}
