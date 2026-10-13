package PREP2025.Practice.WeekdayPractice;

import java.util.Arrays;

//class TimeMap6{
//    static PREP2025.HashMap<String , List<Pair5>> map;
//    static class Pair5{
//        int time;
//        String value;
//        Pair5(int t, String v){
//            time = t;
//            value = v;
//        }
//    }
//    public TimeMap6(){
//        map = new PREP2025.HashMap<>();
//    }
//    static  void set(String key, String value, int timestamp){
//        map.putIfAbsent(key, new ArrayList<>());
//        map.get(key).add(new Pair5(timestamp,value));
//    }
//    static String  get(String key, int timestamp){
//        if (!map.containsKey(key))return "";
//        List<Pair5> list = map.get(key);
//        int low = 0, high = list.size()-1;
//        String ans = "";
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if (list.get(mid).time<=timestamp){
//                ans = list.get(mid).value;
//                low = mid+1;
//            }else high = mid-1;
//        }
//        return ans;
//    }
//}
public class Dec12 {
    //quickSortMedian
//    static void main() {
//        int[] arr = {6,5,1,7,2,0};
//        quickSort(arr, 0 ,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void quickSort(int[] arr, int left, int right){
//        if (left>=right)return;
//        int medianIndex = median(arr,left,right);
//        swap(arr,medianIndex,right);
//        int pivotIndex = partition(arr,left,right);
//        quickSort(arr,left,pivotIndex-1);
//        quickSort(arr,pivotIndex+1,right);
//    }
//    static int median(int[] arr, int left, int right){
//        int mid = left+(right-left)/2;
//        if (arr[left]<mid)swap(arr,left,mid);
//        if (arr[mid]<right)swap(arr,mid,right);
//        if (arr[left]<mid)swap(arr,left,right);
//        return mid;
//    }
//    static int partition(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<pivot){
//                i++;
//                swap(arr,i,j);
//            }
//        }
//        swap(arr,i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }


//    static void main() {
//        int[] arr = {7, 2, 9, 4, 1, 8, 3};
//        quickSortRandom(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void quickSortRandom(int[] arr, int left, int right){
//        if (left>=right)return;
//        int randomIndex = left + (int) (Math.random()*(right-left+1));
//        swap(arr,randomIndex,right);
//        int pivotIndex = partition(arr,left,right);
//        quickSortRandom(arr,left,pivotIndex-1);
//        quickSortRandom(arr,pivotIndex+1,right);
//    }
//    static int partition(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<pivot){
//                i++;
//                swap(arr,i,j);
//            }
//        }
//        swap(arr,i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
    /// Kth Largest
//static void main() {
//    int[] arr = {8,5,7,2,9,3};
//    int k = 3;
//    int result = quickSelect(arr, 0, arr.length-1, arr.length-k);
//    System.out.println(result);
//}
//static int quickSelect(int[] arr, int left, int right, int targetIndex){
//    if (left<=right){
//        int pivotIndex = partition(arr, left, right);
//        if (pivotIndex==targetIndex)return arr[pivotIndex];
//        if (pivotIndex<targetIndex)return quickSelect(arr, pivotIndex+1,right,targetIndex);
//        else return quickSelect(arr,left,pivotIndex-1,targetIndex);
//    }
//    return 0;
//}
//static int partition(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<pivot){
//                i++;
//                swap(arr,i,j);
//            }
//        }
//        swap(arr,i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
    /// Kth Smallestt
//    static void main() {
//        int[] arr= {9,23,5,2,42,61};
//        int k = 2;
//        int result = quickSelect(arr, 0, arr.length-1, k-1);
//        System.out.println(result);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partition(arr, left, right);
//            if (pivotIndex==targetIndex)return arr[pivotIndex];
//            if (pivotIndex<targetIndex)return quickSelect(arr, pivotIndex+1,right,targetIndex);
//            else return quickSelect(arr,left,pivotIndex-1,targetIndex);
//        }
//        return 0;
//    }
//    static int partition(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<pivot){
//                i++;
//                swap(arr,i,j);
//            }
//        }
//        swap(arr,i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
//    /// TopKLargest
//    static void main() {
//        int[] arr = {54,2,3,5,6,22};
//        int k =5;
//        int[] result = topKLargest(arr,k);
//        System.out.println(Arrays.toString(result));
//    }
//    static int[] topKLargest(int[]arr, int k){
//        int n = arr.length;
//        int targetIndex = n-k;
//        quickSelect(arr, 0, n-1, targetIndex);
//        return Arrays.copyOfRange(arr, targetIndex,n);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partition(arr, left, right);
//            if (pivotIndex==targetIndex)return arr[pivotIndex];
//            if (pivotIndex<targetIndex)return quickSelect(arr, pivotIndex+1,right,targetIndex);
//            else return quickSelect(arr,left,pivotIndex-1,targetIndex);
//        }
//        return 0;
//    }
//    static int partition(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<pivot){
//                i++;
//                swap(arr,i,j);
//            }
//        }
//        swap(arr,i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

    /// TopKSmallest
    static void main() {
        int[] arr = {12,4,5,2,13,52};
        int k = 5;
        int[] result = topKSmallest(arr,k);
        System.out.println(Arrays.toString(result));
    }
    static int[] topKSmallest(int[]arr, int k){
        int n = arr.length;
        int targetIndex = k-1;
        quickSelect(arr, 0, n-1, targetIndex);
        return Arrays.copyOfRange(arr, 0,k);
    }
    static int quickSelect(int[] arr, int left, int right, int targetIndex){
        if (left<=right){
            int pivotIndex = partition(arr, left, right);
            if (pivotIndex==targetIndex)return arr[pivotIndex];
            if (pivotIndex<targetIndex)return quickSelect(arr, pivotIndex+1,right,targetIndex);
            else return quickSelect(arr,left,pivotIndex-1,targetIndex);
        }
        return 0;
    }
    static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if (arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,right);
        return i+1;
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //102. Binary Tree Level Order Traversal
//    static void main() {
//        TimeMap6 level = new TimeMap6();
//        level.set("seo","Siuuu", 7);
//        System.out.println(level.get("seo",7));
//    }
/// 410. Split Array Largest Sum
//static void main() {
//    int[] nums = {1,2,3,4,5};
//    int  k = 2;
//    System.out.println(splitArray(nums,k));
//}
//static int splitArray(int[]nums,int k){
//    int low = max(nums);
//    int high = sum(nums);
//    int ans = high;
//    while (low <= high) {
//        int mid = low+(high-low)/2;
//        if (canSplit(nums,k,mid)){
//            ans = mid;
//            high = mid-1;
//        } else low = mid+1;
//    }
//    return ans;
//}
//static boolean canSplit(int[] nums, int k, int limit){
//    int groupCount = 1, currentSum = 0;
//    for (int x:nums){
//        if (currentSum+x>limit){
//            groupCount++;
//            currentSum = x;
//            if (groupCount>k)return false;
//        } else currentSum += x;
//    }
//    return k>=groupCount;
//}
//    static int max(int[] arr){
//        int m = 0;
//        for (int x: arr)m = Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] arr){
//        int s = 0;
//        for (int x:arr)s+=x;
//        return s;
//    }

    /// 875. Koko Eating Bananas
//    static void main() {
//        int[] piles = {30,11,23,4,20};
//        int h = 6;
//        System.out.println(eatingBananas(piles,h));
//    }
//    static int eatingBananas(int[] piles, int h){
//        int low = 0;
//        int high = max(piles);
//        int ans = high;
//        while (low <= high) {
//            int speed=low+(high-low)/2;
//            if (canEat(piles,h,speed)){
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
//            if (hoursUsed>h)return false;
//        }
//        return true;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x: arr)m = Math.max(m,x);
//        return m;
//    }
    /// 1011. Capacity To Ship Packages Within D Days
//    static void main() {
//        int[] weights = {1,2,3,1,1};
//        int days = 4;
//        System.out.println(findShipWithinDays(weights,days));
//    }
//    static int findShipWithinDays(int[] weights, int days){
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
//    static boolean canShip(int[] weights, int days, int can){
//        int d=1, load=0;
//        for (int x:weights){
//            if (load + x > can) {
//                d++;
//                load=x;
//            }else load+=x;
//        }
//        return days >= d;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x: arr)m = Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] arr){
//        int s = 0;
//        for (int x:arr)s+=x;
//        return s;
//    }
    /// 4. Median of Two Sorted Arrays
//    static void main() {
//        int[] A = {1,2};
//        int[] B = {3,4};
//        System.out.println(findMedianSorted(A,B));
//    }
//    static double findMedianSorted(int[]A,int[]B){
//        int n = A.length;
//        int m = B.length;
//        int low = 0, high = n;
//        while (low <= high) {
//            int cutA = (high+low)/2;
//            int cutB = (n+m+1)/2-cutA;
//            int Aleft = (cutA == 0) ? Integer.MIN_VALUE : A[cutA-1];
//            int Aright = (cutA == n) ? Integer.MAX_VALUE : A[cutA];
//            int Bleft = (cutB == 0) ? Integer.MIN_VALUE : B[cutB-1];
//            int Bright = (cutB == m) ? Integer.MAX_VALUE : B[cutB];
//            if (Aleft <= Bright && Bleft <= Aright) {
//                if ((n + m) % 2 == 0) {
//                    return (Math.max(Aleft,Bleft)+Math.min(Aright,Bright))/2.0;
//                }
//                return Math.max(Aleft,Bleft);
//            } else if (Aleft > Bright) {
//                high = cutA-1;
//            } else low = cutA+1;
//        }
//        return 0;
//    }
}
