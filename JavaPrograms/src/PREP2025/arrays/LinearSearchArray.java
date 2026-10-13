package PREP2025.arrays;

public class LinearSearchArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 10, 22};
        int target = 12;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                System.out.println("Found it "+i);
                break;
            }
        }
        if (!found)
            System.out.println("Not");

    }
}
