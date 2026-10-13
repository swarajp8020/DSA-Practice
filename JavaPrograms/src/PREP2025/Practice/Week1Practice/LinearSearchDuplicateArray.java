package Week1Practice;

public class LinearSearchDuplicateArray {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 3, 5};
        int target = 3;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                System.out.println("Found index " + i);
                found = true;
            }
        }
        if (!found){
            System.out.println("Not Found index ");
        }
    }
}
