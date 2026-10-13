package PREP2025.Practice.Week4Practice;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(arr);
        System.out.println(len);
        System.out.println(Arrays.toString(arr));
    }
    static int removeDuplicates(int[] arr){
        if (arr.length == 0) return 0;
        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[fast]!=arr[slow]){
                slow++;
                arr[slow] = arr[fast];

            }
        }
        return slow+1;
    }

}
