package PREP2025.Practice.stage2;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 65, 55, -9, 45, 8};
        int target = 87;
        System.out.println(linearSearch(arr, target, 1,4));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        // run for loop
        for (int index = start; index <= end; index++) {
            //check for element at every index if its == target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //this line will execute if none of the index is found
        //hence target not found
        return -1;
    }

}
