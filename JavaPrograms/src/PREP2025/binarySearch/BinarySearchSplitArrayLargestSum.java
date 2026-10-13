package PREP2025.binarySearch;
/// Split Array Largest Sum — LeetCode 410
public class BinarySearchSplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(new int[]{7,2,5,10,8},2));   // 18
        System.out.println(splitArray(new int[]{1,4,4},3));       // 4
        System.out.println(splitArray(new int[]{1,2,3,4,5},2));   // 9
        System.out.println(splitArray(new int[]{3,6,7,11},1));    // 27
    }

    static int splitArray(int[] nums, int k){
        int low = max(nums);
        int high = sum(nums);
        int answer = high;

        while(low <= high){
            int mid = low + (high-low)/2; // pretend max sum allowed

            if(canSplit(nums, k, mid)){
                answer = mid;      // this mid works, try smaller
                high = mid - 1;
            } else {
                low = mid + 1;     // groups overflow → need larger mid
            }
        }
        return answer;
    }

    static boolean canSplit(int[] arr, int k, int limit){
        int groupCount = 1, currSum = 0;

        for(int num : arr){
            if(currSum + num > limit){ // need new group
                groupCount++;
                currSum = num;

                if(groupCount > k) return false; // limit too small
            } else currSum += num;
        }
        return groupCount <= k;
    }

    static int max(int[] a){
        int m = 0;
        for(int x:a) m = Math.max(m,x);
        return m;
    }

    static int sum(int[] a){
        int s = 0;
        for(int x:a) s += x;
        return s;
    }
}
