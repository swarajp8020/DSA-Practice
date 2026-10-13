package PREP2025.arrays;

public class MinMaxArrays {
    public static void main(String[] args) {
        int[] arr = {1,3,4,9,12,8};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]> max){
                max = arr[i];
            } else if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
