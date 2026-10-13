package PREP2025.Practice.WeekdayPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class TimeMap2{
    static HashMap<String, List<Pair2>> map;
    static class Pair2{
        int time;
        String value;
        Pair2(int t, String v){
            time = t;
            value = v;
        }
    }
    public TimeMap2(){
        map = new HashMap<>();
    }
    static void set(String key, String value, int timestamp){
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair2(timestamp,value));
    }
    static String get(String key, int timestamp){
        if (!map.containsKey(key)) return "";
        List<Pair2>list = map.get(key);
        int low=0, high = list.size()-1;
        String result = "";
        while (low<=high){
            int mid = (low+high)/2;
            if (list.get(mid).time <= timestamp){
                result = list.get(mid).value;
                high = mid-1;
            }else low = mid+1;
        }
        return result;
    }
}
public class Dec04Morning {
    /// 981. Time Based Key-Value Store
    public static void main(String[] args) {
        TimeMap2 map2 = new TimeMap2();
        map2.set("zoo", "boo",2);
        System.out.println(map2.get("zoo",2));
    }


    /// 4. Median of Two Sorted Arrays
//    public static void main(String[] args) {
//        int[] A ={1,3};
//        int[] B ={2};
//        System.out.println(medianTwoSortedArrays(A,B));
//    }
//    static double medianTwoSortedArrays(int[]A, int[]B){
//        int n = A.length;
//        int m = B.length;
//        int low =0, high =n;
//        while (low<=high){
//            int cutA = (high+low)/2;
//            int cutB = (n+m+1)/2-cutA;
//
//            int Aleft = (cutA == 0) ? Integer.MIN_VALUE : A[cutA-1];
//            int Aright = (cutA == n) ? Integer.MAX_VALUE : A[cutA];
//
//            int Bleft = (cutB == 0) ? Integer.MIN_VALUE : B[cutB-1];
//            int Bright = (cutB == m) ? Integer.MAX_VALUE : B[cutB];
//
//            if (Aleft <= Bright && Bleft <= Aright){
//                if ((n+m)%2==0){
//                    return (Math.max(Aleft, Bleft)+Math.min(Aright,Bright))/2.0;
//                }
//                return Math.max(Aleft,Bleft);
//            } else if (Aleft>Bright) {
//                high = cutA-1;
//            }else {
//                low = cutA +1;
//            }
//        }
//        return 0; // only peeked this
//    }


/// 410. Split Array Largest Sum
//public static void main(String[] args) {
//    int[] nums = {1,2,3,4,5};
//    int k = 2;
//    System.out.println(splitArray(nums, k));
//}
//static int splitArray(int[] nums, int k){
//    int low = max(nums);
//    int high = sum(nums);
//    int ans = high;
//    while (low<=high){
//        int mid = low + (high-low)/2;
//        if (canSplit(nums, k, mid)){
//            ans = mid;
//            high = mid-1;
//        } else low = mid+1;
//    }
//    return ans;
//}
//    static boolean canSplit(int[] nums, int k, int limit){
//    int groupCount = 1, currentSum = 0;
//    for (int x: nums){
//        if (currentSum+x>limit){
//            groupCount++;
//            currentSum = x;
//            if (groupCount>k) return false;
//        } else currentSum += x;
//    }
//    return k >= groupCount;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x: arr)m=Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] sum){
//        int s = 0;
//        for (int x:sum)s+=x;
//        return s;
//    }

    /// 875. Koko Eating Bananas
//    public static void main(String[] args) {
//        int[] piles = {30,11,23,4,20};
//        int h = 6;
//        System.out.println(eatingBananas(piles,h));
//    }
//    static int eatingBananas(int[] piles, int h){
//         int low = 0;
//         int high = max(piles);
//         int ans = high;
//         while (low<=high){
//             int speed = low+(high - low)/2;
//             if (canEat(piles, h, speed)){
//                 ans = speed;
//                 high = speed-1;;
//             } else low = speed+1;
//         }
//         return ans;
//    }
//    static boolean canEat(int[] piles, int h, int speed){
//        int hoursUsed = 0;
//        for (int x: piles){
//            hoursUsed += (x+speed-1)/speed; //Peeked here once
//            if (hoursUsed > h) return false;
//        }
//        return true;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x:arr)m=Math.max(m, x);
//        return m;
//    }

/// 1011. Capacity To Ship Packages Within D Days
//    public static void main(String[] args) {
//        int[] weights = {1,2,3,1,1};
//        int days = 4;
//        System.out.println(capacityShip(weights, days));
//    }
//    static int capacityShip(int[] weights, int days){
//        int low = max(weights);
//        int high = sum(weights);
//        int ans = high;
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if (canShip(weights,days,mid)){
//                ans = mid;
//                high = mid-1;
//            } else low = mid+1;
//        }
//        return ans;
//    }
//    static boolean canShip(int[] weights, int days, int limit){
//        int d =1, load =0;
//        for (int x:weights){
//            if (load+x>limit){
//                d++;
//                load = x;
//            } else load += x;
//        }
//      return days >= d;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x: arr)m=Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] sum){
//        int s = 0;
//        for (int x:sum)s+=x;
//        return s;
//    }
}
