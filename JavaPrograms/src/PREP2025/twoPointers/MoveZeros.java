package PREP2025.twoPointers;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr= {1,4,0,5,0,1,0,55};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZero(int[] arr){
        int slow = 0;
        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] !=0){
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                slow++;
            }
        }
    }
}
