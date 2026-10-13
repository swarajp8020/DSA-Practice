package PREP2025.Practice.WeekdayPractice;

public class Dec19Morning {
    /// slidingWindowMin
    static class sol {
        public String minWindow(String s, String t){
            if (s.length()<t.length())return "";
            int[] need = new int[128]; //ASCII
            for (char c : t.toCharArray()){
                need[c]++;
            }
            int left = 0, start = 0, count = t.length(), minLen = Integer.MAX_VALUE;
            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);
                if (need[c]>0) count--;
                need[c]--;
                while (count == 0) {
                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1;
                        start = left;
                    }
                    char lc = s.charAt(left);
                    need[lc]++;
                    if (need[lc]>0) count++;
                    left++;
                }
            }
            return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start+minLen);
        }
    }

    static void main(String[] args) {
        String s = "sadafaad";
        String t = "dsa";
        sol ss = new sol();
        System.out.println(ss.minWindow(s,t));
    }

    /// slidingWindowMax
//    static class sol{
//        public int[] slidingWindowMax(int[] nums, int k){
//            if (nums.length == 0 || k == 0) return new int[0];
//            Deque<Integer> dq = new ArrayDeque<>();
//            int[] res = new int[nums.length - k + 1];
//            int index = 0;
//            for (int i = 0; i < nums.length; i++) {
//                if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
//                    dq.pollFirst();
//                }
//                while (!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
//                    dq.pollLast();
//                }
//                dq.offerLast(i);
//                if (i >= k - 1) {
//                    res[index++] = nums[dq.peekFirst()];
//                }
//            }
//            return res;
//        }
//    }
//    static void main(String[] args) {
//        int[] nums = {1,3,-1,-3,5,3,6,7};
//        int k  = 3;
//        sol s = new sol();
//        System.out.println(Arrays.toString(s.slidingWindowMax(nums,k)));
//    }
}
