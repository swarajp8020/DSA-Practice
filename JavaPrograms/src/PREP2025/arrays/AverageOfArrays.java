package PREP2025.arrays;

public class AverageOfArrays {
    public static void main(String[] args) {

        int[] arr = {1,3,4,9,12,8};
        int sum = 0;
//        int avg =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
//            avg = sum/arr.length;
        }
        double avg = (double) sum / arr.length;
        System.out.println(avg);
    }
}
