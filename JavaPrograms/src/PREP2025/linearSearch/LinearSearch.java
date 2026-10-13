package PREP2025.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={7,5,2,4,3};
        int target = 4;
        int result = search(arr, target);
        if (result == -1){
            System.out.println("Not Found in search");
        } else {
            System.out.println("Found in search " + result);
        }
    }
    static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}