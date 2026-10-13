package Week4Practice;

import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        int[] arr ={3,2,0,5,1,2,0,11,0,34};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZeros(int[] arr){
        int slow =0;
        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast]!=0){
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                slow++;
            }
        }
    }
}
