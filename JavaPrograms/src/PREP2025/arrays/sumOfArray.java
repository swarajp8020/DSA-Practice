package PREP2025.arrays;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
