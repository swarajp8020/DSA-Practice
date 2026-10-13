package PREP2025.Practice.WeekdayPractice;

public class BSSplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k =2;
        System.out.println(splitArray(nums, k));
        System.out.println(splitArray(new int[]{7,2,5,10,8},2));   // 18
        System.out.println(splitArray(new int[]{1,4,4},3));       // 4
        System.out.println(splitArray(new int[]{1,2,3,4,5},2));   // 9
        System.out.println(splitArray(new int[]{3,6,7,11},1));    // 27

    }
    static int splitArray(int[] nums, int k){
        int low=max(nums);
        int high=sum(nums);
        int ans=high;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (canSplit(nums,k,mid)){
                ans=mid;
                high=mid-1;
            } else low=mid+1;
        }
        return ans;
    }
    static boolean canSplit(int[] arr, int k, int limit){
        int groupCount =1, currentSum=0;
        for (int num:arr){
            if (currentSum+num>limit){
                groupCount++;
                currentSum=num;
                if (groupCount>k) return false;
            }else currentSum+=num;
        }
        return groupCount<=k;
    }

    static int max(int[]arr){
        int m = 0;
        for (int x:arr)m=Math.max(m,x);
        return m;
    }
    static int sum(int[] arr){
        int s = 0;
        for (int x:arr)s+=x;
        return s;
    }
}
