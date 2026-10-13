package PREP2025.Practice.Week12Practice;

import java.util.HashSet;

public class Jan23Morning {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    static void main(String[] args) {
        String s = "asvavsaffg";
        System.out.println(lengthOfLongestSubstring(s));
    }
//    public static int maxProfit(int[] prices) {
//        int minPrices = Integer.MAX_VALUE;
//        int maxProfit = 0;
//        for (int p:prices) {
//            minPrices = Math.min(minPrices, p);
//            maxProfit = Math.max(maxProfit, p - minPrices);
//        }
//        return maxProfit;
//    }
//    static void main() {
//        int[] prices = {7,1,5,3,6,4};
//        System.out.println(maxProfit(prices));
//    }
//    public static int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[n];
//        int PREP2025.prefix = 1;
//        for (int i = 0; i < n; i++) {
//            ans[i] = PREP2025.prefix;
//            PREP2025.prefix *= nums[i];
//        }
//         int suffix = 1;
//        for (int i = n - 1; i >= 0; i--) {
//            ans[i] *= suffix;
//            suffix *= nums[i];
//        } return ans;
//    }
//    static void main() {
//        int[] nums = {1,2,3,4};
//        System.out.println(Arrays.toString(productExceptSelf(nums)));
//    }
//    public static int[] topKFrequent(int[] nums, int k) {
//        PREP2025.HashMap<Integer, Integer> freq = new PREP2025.HashMap<>();
//        for (int x:nums){
//            freq.put(x, freq.getOrDefault(x, 0)+1);
//        }
//        PriorityQueue<Integer> pq = new PriorityQueue<>(
//                (a,b) -> freq.get(b) - freq.get(a)
//        );
//        pq.addAll(freq.keySet());
//        int[] ans = new int[k];
//        for (int i = 0; i < k; i++) {
//            ans[i] = pq.poll();
//        } return ans;
//    }
//
//    static void main() {
//        int[] nums = {1,1,1,2,2,3};
//        int k = 2;
//        System.out.println(Arrays.toString(topKFrequent(nums,k)));
//    }
//    public static boolean containsDuplicate(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int x:nums) {
//            if (set.contains(x)) return true;
//            set.add(x);
//        } return false;
//    }
//    static void main() {
//        int[] nums = {1,2,3,1};
//        System.out.println(containsDuplicate(nums));
//    }
}
