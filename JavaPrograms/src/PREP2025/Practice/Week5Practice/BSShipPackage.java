package PREP2025.Practice.Week5Practice;

public class BSShipPackage {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int D=5;
        System.out.println(shipWithinDays(arr, D));
    }
    static int shipWithinDays(int[] arr, int D){
        int low = max(arr);
        int high = sum(arr);
        int ans = high;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (canShip(arr,D,mid)){
                ans=mid;
                high=mid-1;
            }else low=mid+1;
        }
        return ans;
    }
    static boolean canShip(int[] arr, int D, int can){
        int days =1, load =0;
        for (int x: arr){
            if (load+x>can){
                days++;
                load=x;
            }else load+=x;
        }
        return days <=D;
    }
    static int max(int[]arr){
        int m = 0;
        for (int y:arr)m=Math.max(m,y);
        return m;
    }
    static int sum(int[]arr){
        int s=0;
        for (int z:arr)s+=z;
        return s;
    }
}
