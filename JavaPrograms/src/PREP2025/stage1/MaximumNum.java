package PREP2025.stage1;

public class MaximumNum {
    public static void main(String[] args) {
        int[] arr = {1,4,66,4,5};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
