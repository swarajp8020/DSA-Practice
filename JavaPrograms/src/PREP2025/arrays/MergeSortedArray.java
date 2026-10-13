package PREP2025.arrays;
// LC 88. Merge Sorted Array https://leetcode.com/problems/merge-sorted-array/description/
/// ELI5
/// You’re given:
/// nums1 with extra space at the end
/// nums2
/// Both sorted.
/// You must merge in-place.
/// Key insight
/// Start filling from the end, not the beginning.
/// Why? Because end has empty space.
/// Pattern
/// Three pointers:
/// i → last element of nums1
/// j → last element of nums2
/// k → last index of nums1
import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    static void main() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
