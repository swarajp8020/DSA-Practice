package PREP2025.binarySearch;
/// Pattern 2 — First/Last Occurrence
public class BinarySearchFirstLastOccurence {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,12};
        int target = 9;
        System.out.println(first(arr,target));
        System.out.println(last(arr,target));
    }
    static int first(int[] arr, int target){
        int left=0,right=arr.length-1,ans=-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (arr[mid]==target){
                ans = mid;
                right = mid-1;
            }
            if (arr[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return ans;
    }
    static int last(int[] arr, int target){
        int left=0,right=arr.length-1,ans=-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (arr[mid]==target){
                ans = mid;
                left = mid+1;
            }
            if (arr[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return ans;
    }
}
