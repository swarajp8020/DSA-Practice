package PREP2025.arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,5,7,2,3};

        for (int i = 0; i < arr.length-1; i++) {
            int minIndex =i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<minIndex){
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.print("Selection Sort: ");
        for (int num: arr){
            System.out.print(num+" ");
        }
    }
}
