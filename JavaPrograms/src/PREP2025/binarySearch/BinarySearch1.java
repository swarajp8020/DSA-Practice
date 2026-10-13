package PREP2025.binarySearch;
/// Pattern 1 — Find element / normal BS
/// arr = [2,5,7,9,12], target=9
/// Find target in sorted array
public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,12};
        int target = 9;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target){
        int left=0, right =arr.length-1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if (arr[mid]==target)return mid;
            if (arr[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
}
