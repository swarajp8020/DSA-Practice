package PREP2025.sorting;

import java.util.Arrays;

//Problem 2 — Merge Two Sorted Arrays Using Merge Technique
//
//Input:
//a = [1,3,5,7]
//b = [2,4,6,8]
//Output:
//[1,2,3,4,5,6,7,8]
//
//👉 Same logic as merge(), but easier.
public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,3,5,7};
        int[] b = {2,4,6,8};
        int[] res = merge(a, b);
        System.out.println(Arrays.toString(res));
    }

    static int[] merge(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        // Pick smallest from both
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) temp[k++] = a[i++];
            else temp[k++] = b[j++];
        }

        // Copy leftovers
        while (i < a.length) temp[k++] = a[i++];
        while (j < b.length) temp[k++] = b[j++];

        return temp;
    }
}
