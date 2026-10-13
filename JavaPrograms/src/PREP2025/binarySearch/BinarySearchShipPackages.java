package PREP2025.binarySearch;
/// 🚢 Ship Packages — Minimum Capacity
/// (LeetCode 1011 type)  You’re given weights of packages. You must ship in D days.
/// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
/// Find minimum capacity of the ship required.
/// Input
/// weights = [1,2,3,4,5,6,7,8,9,10]
/// D = 5
/// Expected output = 15
/// Why 15?
/// Because with capacity 15 you can split like:
/// [1,2,3,4,5]  → 15
/// [6,7]        → 13
/// [8]          → 8
/// [9]          → 9
/// [10]         → 10
/// If capacity is lower (say 14) → fails.
/// Your task
/// Write a function:
/// static int shipWithinDays(int[] arr, int D)
/// Hints (no solution yet):
/// search range = [max(arr), sum(arr)]
/// mid = capacity guess
/// simulate days required
/// if days > D → increase capacity
/// else shrink capacity
public class BinarySearchShipPackages {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int D=5;
        System.out.println(shipWithinDays(arr, D));
    }
    static int shipWithinDays(int[] arr,int D){
        int low = max(arr) ; // biggest weight
        int high = sum(arr) ; // sum of weights
        int ans = high;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(canShip(arr, D, mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    static int max(int[] arr){
        int m = arr[0];
        for(int x:arr) m = Math.max(m,x);
        return m;
    }

    static int sum(int[] arr){
        int s = 0;
        for(int x:arr) s += x;
        return s;
    }
    static boolean canShip(int[] arr,int D,int cap){
        int days = 1 , load = 0;

        for(int w:arr){
            if(load + w > cap){
                days++;
                load = w;
            }else load += w;
        }
        return days <= D;
    }

}
