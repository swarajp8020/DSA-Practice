package PREP2025.Practice.Week12Practice;

public class Jan24Morning {

    /// maxSubArray
    public static int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    /// longestSubstring
//    public static int lengthOfLongestSubstring(String s) {
//        HashSet<Character> set = new HashSet<>();
//        int left = 0, maxLen = 0;
//        for (int right = 0; right < s.length(); right++) {
//            char ch = s.charAt(right);
//            while (set.contains(ch)) {
//                set.remove(s.charAt(left));
//                left++;
//            }
//            set.add(ch);
//            maxLen = Math.max(maxLen, right - left + 1);
//        } return maxLen;
//    }
//    static void main(String[] args) {
//        String s = "asvavsaffg";
//        System.out.println(lengthOfLongestSubstring(s));
//    }
    /// ProductOfArrayExceptSelf
//    public static int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[n];
//        int PREP2025.prefix = 1;
//        for (int i = 0; i < n; i++) {
//            ans[i] = PREP2025.prefix;
//            PREP2025.prefix *= nums[i];
//        }
//        int suffix = 1;
//        for (int i = n - 1; i >= 0; i--) {
//            ans[i] *= suffix;
//            suffix *= nums[i];
//        }
//        return ans;
//    }
//    static void main() {
//        int[] nums = {1,2,3,4};
//        System.out.println(Arrays.toString(productExceptSelf(nums)));
//    }
    /// TopKFrequentElements
//    public static int[] topKFrequent(int[] nums, int k) {
//        PREP2025.HashMap<Integer, Integer> freq = new PREP2025.HashMap<>();
//        for (int x:nums) {
//            freq.put(x, freq.getOrDefault(x, 0) + 1);
//        }
//        PriorityQueue<Integer> pq = new PriorityQueue<>(
//                (a,b)->freq.get(b) - freq.get(a)
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
    /// BestTimeToBuyAndSellStock
//    public static int maxProfit(int[] prices) {
//        int minPrices = Integer.MAX_VALUE;
//        int maxProfit = 0;
//        for (int p:prices) {
//            minPrices = Math.min(minPrices, p);
//            maxProfit = Math.max(maxProfit, p - minPrices);
//        }
//        return maxProfit;
//    }
//    static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
//        System.out.println(maxProfit(prices));
//    }
}
