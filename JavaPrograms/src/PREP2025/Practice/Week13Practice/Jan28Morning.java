package PREP2025.Practice.Week13Practice;

public class Jan28Morning {
    public static int missingNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i <= nums.length; i++) {
            res ^= i;
        }
        for (int x: nums){
            res ^= x;
        } return res;
    }
    static void main() {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums)                                                                          );
    }
    /// twoSum2
//    public static int[] twoSum(int[] numbers, int target) {
//        int left = 0, right = numbers.length - 1;
//        while (left < right) {
//            int sum = numbers[left] + numbers[right];
//            if (sum == target) {
//                return new int[]{left + 1, right + 1};
//            } else if (sum < target) left++;
//            else right--;
//        } return new int[]{-1, -1};
//    }
//    static void main(String[] args) {
//        int[] numbers = {2,7,11,15};
//        int target = 9;
//        System.out.println(Arrays.toString(twoSum(numbers, target)));
//    }
}
