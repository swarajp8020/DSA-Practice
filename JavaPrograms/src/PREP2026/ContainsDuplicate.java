package PREP2026;

public class ContainsDuplicate {
    public boolean contDup(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    return true;
                }
            }
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
