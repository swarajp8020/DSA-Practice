package PREP2025.Practice.Week13Practice;


class ListNode{
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
class Solution2 {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;        // 1 step
            fast = fast.next.next;  // 2 steps
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
public class Feb01Morning {
    /// LinkedListCycle
    static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution2 sol = new Solution2();
        boolean hasCycle = sol.hasCycle(head);
        System.out.println("Has Cycle? " + hasCycle);
    }
    /// threeSum
//    public static List<List<Integer>> threeSum(int[] nums){
//        Arrays.sort(nums);
//        List<List<Integer>> res = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (i > 0 && nums[i] == nums[i - 1]) continue;
//            int left = i + 1, right = nums.length - 1;
//            while (left < right) {
//                int sum = nums[i] + nums[left] + nums[right];
//                if (sum == 0) {
//                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
//                    left++;
//                    right--;
//                    while (left<right && nums[left] == nums[left - 1]) left++;
//                    while (left<right && nums[right] == nums[right + 1]) right--;
//                }
//                else if (sum > 0)left++;
//                else right--;
//            }
//        } return res;
//    }
//    static void main(String[] args) {
//        int[] nums = {-1,0,1,2,-1,-4};
//        System.out.println(threeSum(nums));
//    }
}
