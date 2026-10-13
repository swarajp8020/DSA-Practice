package PREP2025.recapImpTopics.sorting;

import java.util.Arrays;

public class mergeTwoSortedArrays {
    static void main(String[] args) {
        int[] a = {1,3,5,7};
        int[] b = {2,4,6,8};
        int[] res = merge(a, b);
        System.out.println(Arrays.toString(res));
    }
    static int[] merge(int[] a, int[] b){
        int[] temp = new int[a.length+ b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]){
                temp[k++] = a[i++];
            }else temp[k++] = b[j++];
        }
        while (i< a.length) temp[k++] = a[i++];
        while (j <b.length) temp[k++] = b[j++];
        return temp;
    }
}
