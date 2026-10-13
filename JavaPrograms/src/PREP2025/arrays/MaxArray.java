package PREP2025.arrays;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
//            System.out.println(max);
        }
        System.out.println(max);
    }
}
