package PREP2025.twoPointers;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
//        Arrays.sort(arr);
        int len = removeDuplicate(arr);
        System.out.println(len);
        System.out.println(Arrays.toString(arr));
    }
    static int removeDuplicate(int[] arr){
        if (arr.length == 0)return 0;
        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[fast] != arr[slow]){
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow+1;
    }
}
