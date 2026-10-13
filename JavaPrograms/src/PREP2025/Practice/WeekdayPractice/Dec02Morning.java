package PREP2025.Practice.WeekdayPractice;

public class Dec02Morning {
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
        int low = max(nums);
        int high = sum(nums);
        int ans = high;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (canSplit(nums,k,mid)){
                ans = mid;
                high = mid-1;

            } else low=mid+1;

        }
        return ans;
    }
    static boolean canSplit(int[]nums, int k, int limit){
        int groupCount =1, currSum = 0;
        for (int x: nums){
            if (currSum+x>limit){
                groupCount++;
                currSum=x;
                if (groupCount>k) return false;
            } else currSum += x;
        }
        return groupCount <= k;
    }
    static int max(int[] arr){
        int m = 0;
        for (int x: arr)m=Math.max(m,x);
        return m;
    }
    static int sum(int[]arr){
        int s=0;
        for (int x:arr)s+=x;
        return s;
    }



//    public static void main(String[] args) {
//        int[] piles = {30,11,23,4,20};
//        int h = 5;
//        System.out.println(minEatingSpeed(piles,h));
//    }
//    static int minEatingSpeed(int[] piles, int h){
//        int low =1;
//        int high = max(piles);
//        int ans=high;
//        while (low<=high){
//            int speed = low+(high-low)/2;
//            if (canEat(piles, h, speed)){
//                ans = speed;
//                high = speed-1;
//            } else low = speed+1;
//        }
//        return ans;
//    }
//    static boolean canEat(int[] piles, int h, int speed){
//        int hoursUsed = 0;
//        for (int pile:piles){
//            hoursUsed += (pile+speed-1)/speed;
//            if (hoursUsed>h) return false;
//        } return true;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x:arr)m=Math.max(m,x);
//        return m;
//    }




//    public static void main(String[] args) {
//        int[] weights = {1,2,3,4,5,6,7,8,9,10};
//        int days = 5;
//        System.out.println(shipWithinDays(weights,days));
//    }
//    static int shipWithinDays(int[] weights, int days){
//        int low = max(weights);
//        int high = sum(weights);
//        int ans = high;
//        while (low<=high){
//            int mid = low+(high-low);
//            if (canShip(weights,days,mid)){
//                ans=mid;
//                high = mid-1;
//            } else low = mid+1;
//        }
//        return ans;
//    }
//    static boolean canShip(int[] weights, int days, int can){
//        int D = 1, load = 0;
//        for (int a:weights){
//            if (load+a>can){
//                D++;
//                load=a;
//            } else load+=a;
//        }
//        return days >=D;
//    }
//
//    static int max(int[]arr){
//        int m =0;
//        for (int x:arr)m=Math.max(m,x);
//        return m;
//    }
//    static int sum(int[]arr){
//        int s=0;
//        for (int x:arr)s+=x;
//        return s;
//    }
}
