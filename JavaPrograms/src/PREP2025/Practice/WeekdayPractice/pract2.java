package PREP2025.Practice.WeekdayPractice;

import java.util.Arrays;

public class pract2 {
//    public static void main(String[] args) {
//        int[] arr = {9,-5,3,1,6};
//        int result = mergeSort(arr, 0, arr.length-1);
//        System.out.println("con "+result);
//    }
//    static int mergeSort(int[] arr, int left, int right){
//        if (left>= right)return 0;
//        int mid= left+(right-left)/2;
//        int leftCount = mergeSort(arr, left, mid);
//        int rightCount = mergeSort(arr, mid+1, right);
//        int mergeCount = merge(arr, left, mid, right);
//        return leftCount+rightCount+mergeCount;
//    }
//    static int merge(int[] arr, int left, int mid, int right){
//        int[] temp = new int[right-left+1];
//        int i = left;
//        int j = mid+1;
//        int k = 0;
//        int inversion = 0;
//
//        while (i<=mid&&j<=right){
//            if (arr[i]<=arr[j]){
//                temp[k++] = arr[i++];
//            } else {
//                temp[k++]= arr[j++];
//                inversion += (mid-i+1);
//            }
//        }
//        while (i<=mid){
//            temp[k++] = arr[i++];
//        }
//        while (j<=right){
//            temp[k++] = arr[j++];
//        }
//        for (int l = 0; l < temp.length; l++) {
//            arr[left+l] = temp[l];
//        }
//        return inversion;
//    }
//
//public static void main(String[] args) {
//    int[] a = {1,3,5,7};
//    int[] b= {2,4,6,8};
//    int[] res = merge(a,b);
//    System.out.println(Arrays.toString(res));
//    }
//    static int[] merge(int[]a, int[]b){
//    int[] temp = new int[a.length+b.length];
//    int i = 0,j=0,k=0;
//    while (i<a.length && j<b.length){
//        if (a[i]<=b[j]){
//            temp[k++] = a[i++];
//        }else {
//            temp[k++] = b[j++];
//        }
//    }
//    while (i<a.length)temp[k++] = a[i++];
//    while (j<b.length)temp[k++] = b[j++];
//
//    return temp;
//    }
    //MergeSort
public static void main(String[] args) {
    int[] arr ={ 6,4,2,1,7 };
    mergeSort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));;
}
static void mergeSort(int[] arr, int left, int right){
    if (left>=right) return;
    int mid = left+(right-left)/2;
    mergeSort(arr, left, mid);
    mergeSort(arr,mid+1,right);
    merge(arr, left,mid,right);
}
static void merge(int[] arr, int left, int mid, int right){
    int[] temp = new int[right-left+1];
    int i = left;
    int j = mid+1;
    int k=0;

    while (i<=mid && j<=right){
        if (arr[i]<=arr[j]){
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
        }
    }
    while (i<=mid){
        temp[k++] = arr[i++];
    }
    while (j<=right){
        temp[k++] = arr[j++];
    }
    for (int l = 0; l < temp.length; l++) {
        arr[left+l] = temp[l];
    }
}
}
