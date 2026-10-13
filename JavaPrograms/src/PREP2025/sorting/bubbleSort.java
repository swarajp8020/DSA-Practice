package PREP2025.sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,5,68,32,23};
        bubbleSort(arr);
        System.out.print("Sorted PREP2025.arrays: ");
        for(int n: arr){
            System.out.print(n+ " ");
        }
    }
    // Bubble Sort
    static void bubbleSort(int[] arr) {
        // Outer loop – passes
        for (int pass = 0; pass < arr.length - 1; pass++) {

            // Inner loop – compares neighbors
            for (int i = 0; i < arr.length - 1 - pass; i++) {

                // If wrong order → swap
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

}
