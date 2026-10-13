package PREP2025.Practice.Week13Practice;


import java.util.Arrays;

public class Jan27Morning {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];
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
//    public static boolean isPalindrome(String s) {
//        StringBuilder clean = new StringBuilder();
//        for (char c:s.toCharArray()) {
//            if (Character.isLetterOrDigit(c)) {
//                clean.append(Character.toLowerCase(c));
//            }
//        }
//        int left = 0, right = clean.length() - 1;
//        while (left < right) {
//            if (clean.charAt(left) != clean.charAt(right)) return false;
//            left++;
//            right--;
//        } return true;
//    }
//    static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
//        System.out.println(isPalindrome(s));
//    }
}
