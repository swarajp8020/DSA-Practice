package Week3Practice;

import java.util.Arrays;

//✅ Problem 4 — Check if array becomes sorted after ONE insertion step
//Example:
//Input:
//[1, 2, 4, 5, 3]
//After inserting only the last element 3:
//Output:
//true (because it becomes sorted)
//If input: [1, 4, 3, 5, 2]
//Output:
//false (one insertion is not enough)
public class p4 {
    public static void main(String[] args) {
        int[] arr ={1, 2, 4, 5, 3 };
        canBeSortedWithOneInsertion(arr);
        System.out.println(canBeSortedWithOneInsertion(arr));
    }
    static boolean canBeSortedWithOneInsertion(int[] arr){
        int n = arr.length;
        int[] a = Arrays.copyOf(arr,n);

        int key = a[n-1];
        int j = n-2;

        while(j>= 0 && arr[j]>key){
            a[j+1]=a[j];
            j--;
        }
        a[j+1] =key;
        for (int i = 1; i < n; i++) {
            if (a[i]<a[i-1]) return false;
        }
        return true;
    }
}
