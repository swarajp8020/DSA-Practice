package PREP2025.arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] =arr[i];
        }
        for (int num: copy) {
            System.out.println(num);
        }
    }
}
