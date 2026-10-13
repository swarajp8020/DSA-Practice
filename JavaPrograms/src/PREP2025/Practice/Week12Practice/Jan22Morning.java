package PREP2025.Practice.Week12Practice;

import java.util.Arrays;

public class Jan22Morning {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }
    static void main() {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
//    public static int[] topKFrequent(int[] nums, int k) {
//        PREP2025.HashMap<Integer, Integer> freq = new PREP2025.HashMap<>();
//        for (int x:nums) {
//            freq.put(x, freq.getOrDefault(x, 0) + 1);
//        }
//        PriorityQueue<Integer> pq = new PriorityQueue<>(
//                (a,b) -> freq.get(b) - freq.get(a)
//        );
//        pq.addAll(freq.keySet());
//        int[] ans = new int[k];
//        for (int i = 0; i < k; i++) {
//            ans[i] = pq.poll();
//        }
//        return ans;
//    }
//    static void main() {
//        int[] nums = {1,1,1,2,2,3};
//        int k = 2;
//        System.out.println(Arrays.toString(topKFrequent(nums,k)));
//    }
//    public static boolean containsDuplicate(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int x: nums) {
//            if (set.contains(x)) return true;
//            set.add(x);
//        } return false;
//    }
//
//    static void main() {
//        int[] nums = {1,2,3,1};
//        System.out.println(containsDuplicate(nums));
//    }
//    public static int[] twoSum(int[] nums, int target) {
//        PREP2025.HashMap<Integer, Integer> map = new PREP2025.HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement)) {
//                return new int[]{map.get(complement), i};
//            }
//            map.put(nums[i], i);
//        }
//        return new int[]{-1,-1};
//    }
//
//    static void main() {
//        int[] nums = {2,7,11,15};
//        int target = 9;
//        System.out.println(Arrays.toString(twoSum(nums, target)));
//    }
}
