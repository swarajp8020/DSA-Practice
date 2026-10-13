package PREP2025.arrays;

public class largestNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int lar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(lar<arr[i]){
                lar = arr[i];
            }
        }
        System.out.println(lar);
    }
}
