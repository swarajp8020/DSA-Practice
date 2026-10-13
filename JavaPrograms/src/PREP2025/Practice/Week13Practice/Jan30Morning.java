package PREP2025.Practice.Week13Practice;

public class Jan30Morning {
    public static boolean checkInclusion(String s1, String s2){
        if (s1.length() > s2.length()) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (char c:s1.toCharArray()) {
            freq1[c - 'a']++;
        }
        int k = s1.length();
        for (int i = 0; i < k; i++) {
            freq2[s2.charAt(i)- 'a']++;
        }
        if (matches(freq1, freq2)) return true;
        for (int right = k; right < s2.length(); right++) {
            freq2[s2.charAt(right) - 'a']++;
            freq2[s2.charAt(right - k)- 'a']--;
            if (matches(freq1, freq2)) return true;
        } return false;
    }
    private static boolean matches(int[] a, int[] b){
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        } return true;
    }

    static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
    //maximum product subarray
//    public static int maxProduct(int[] nums) {
//        int maxProd = nums[0];
//        int minProd = nums[0];
//        int ans = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            int x = nums[i];
//            if (x > 0) {
//                int temp = maxProd;
//                maxProd = minProd;
//                minProd = temp;
//            }
//            maxProd = Math.max(x, maxProd * x);
//            minProd = Math.min(x, minProd * x);
//            ans = Math.max(ans, maxProd);
//        } return ans;
//    }
//    static void main(String[] args) {
//        int[] nums = {2, 3, -2, 4};
//        System.out.println(maxProduct(nums));
//    }
    /// house robber
//    public static int rob(int[] nums) {
//        int prev1 = 0, prev2 = 0;
//        for (int x: nums){
//            int curr = Math.max(prev1, prev2 + x);
//            prev2 = prev1;
//            prev1 = curr;
//        } return prev1;
//    }
//    static void main(String[] args) {
//        int[] nums = {2,7,9,3,1};
//        System.out.println(rob(nums));
//    }
}
