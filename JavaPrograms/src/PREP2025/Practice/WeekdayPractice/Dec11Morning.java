package PREP2025.Practice.WeekdayPractice;

import java.util.*;
//class TimeMap4{
//    static PREP2025.HashMap<String, List<Pair5>> map;
//    static class Pair5{
//        int time;
//        String value;
//        Pair5(int t, String v){
//            time = t;
//            value = v;
//        }
//    }
//    public TimeMap4(){
//        map = new PREP2025.HashMap<>();
//    }
//    static void set(String key, String value, int timestamp){
//        map.putIfAbsent(key, new ArrayList<>());
//        map.get(key).add(new Pair5(timestamp,value));
//    }
//    static String get(String key, int timestamp){
//        if (!map.containsKey(key))return "";
//        List<Pair5> list = map.get(key);
//        int low = 0, high = list.size()-1;
//        String ans = "";
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if (list.get(mid).time <= timestamp){
//                ans = list.get(mid).value;
//                low = mid+1;
//            } else high = mid-1;
//        }
//        return ans;
//    }
//}

//class BinaryTreeLevelOrder{
//    public List<List<Integer>> treeLevelOrder(TreeNode root){
//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null) return result;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//        while (!q.isEmpty()) {
//            int size = q.size();
//            List<Integer> level = new ArrayList<>();
//            for (int i = 0; i < size; i++) {
//                TreeNode node = q.poll();
//                level.add(node.val);
//                if (node.left!=null)q.add(node.left);
//                if (node.right!=null)q.add(node.right);
//            }
//            result.add(level);
//        }
//        return result;
//    }
//}

//class Sol12{
//    public List<Integer> rightSideView(TreeNode root){
//        List<Integer> result = new ArrayList<>();
//        if (root == null) return result;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//        while (!q.isEmpty()) {
//            int size = q.size();
//            TreeNode last = null;
//            for (int i = 0; i < size; i++) {
//                TreeNode node = q.poll();
//                last = node;
//                if (node.left!=null)q.add(node.left);
//                if (node.right!=null)q.add(node.right);
//            }
//            result.add(last.val);
//        }
//        return result;
//    }
//}

public class Dec11Morning {

    /// BinaryTreePathsSolution
    public List<String> treePathSolu(TreeNode root){
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        dfs(root, String.valueOf(root.val),res);
        return res;
    }
    static void dfs(TreeNode node, String path, List<String>res){
        if (node.left == null && node.right == null){
            res.add(path);
            return;
        }
        if (node.left != null) {
            dfs(node.left, path+"->"+node.left,res);
        }
        if (node.right!=null){
            dfs(node.right,path+"->"+node.right,res);
        }
    }

    /// mergeTwoSortedArrays
//    static void main(String[] args) {
//        int[] a = {1,3,5,7};
//        int[] b = {2,4,6,8};
//        int[] res = merge(a, b);
//        System.out.println(Arrays.toString(res));
//    }
//    static int[] merge(int[] a,int[]b){
//        int[] temp = new int[a.length+b.length];
//        int i = 0, j = 0, k=0;
//        while (i<a.length & j <b.length){
//            if (a[i]<= b[j])temp[k++]=a[i++];
//            else temp[k++]=b[j++];
//        }
//        while (i<a.length)temp[k++]=a[i++];
//        while (j<b.length)temp[k++]=b[j++];
//        return temp;
//    }
    /// Quick Sort DNF
//    static void main() {
//        int[] arr = {7,5,1,8,0,2,-1,4,1};
//        quickSortDNF(arr, 0 ,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void quickSortDNF(int[] arr, int left, int right){
//        if (left>=right)return;
//        int[] bound = partitionDNF(arr,left,right);
//        int low = bound[0], high = bound[1];
//        quickSortDNF(arr, left, low-1);
//        quickSortDNF(arr,high+1,right);
//    }
//    static int[] partitionDNF(int[] arr, int left, int right){
//        int pivot = arr[(left+right)/2];
//        int low = left;
//        int mid = left;
//        int high = right;
//        while (mid <= high){
//            if (arr[mid]<pivot){
//                swap(arr,low,mid);
//                low++;
//                mid++;
//            } else if (arr[mid] == pivot) {
//                mid++;
//            } else {
//                swap(arr, mid, high);
//                high--;
//            }
//        }
//        return new int[]{low, high};
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

    ///  Quick Sort Hoare
//    static void main() {
//        int[] arr = {7, 5, 8, 2, 4, 1};
//        quickSortHoare(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void quickSortHoare(int[] arr, int left, int right){
//        if (left>=right)return;
//        int pivotIndex = lomuto(arr,left,right);
//        quickSortHoare(arr,left,pivotIndex);
//        quickSortHoare(arr,pivotIndex+1,right);
//    }
//    static int lomuto(int[] arr, int left, int right){
//        int pivot = arr[(right+left)/2];
//        while (true){
//            while (arr[left]<pivot)left++;
//            while (arr[right]>pivot)right--;
//            if (left>=right)return right;
//            int temp = arr[left];
//            arr[left] =arr[right];
//            arr[right] = temp;
//
//            left++;
//            right--;
//        }
//    }
    ///  Quick Sort Lomuto
//    static void main() {
//        int[] arr = {9,6,4,2};
//        quickSortLomuto(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void quickSortLomuto(int[] arr, int left, int right){
//        if (left>right)return;
//        int pivotIndex = partitionLomuto(arr, left, right);
//        quickSortLomuto(arr, left, pivotIndex-1);
//        quickSortLomuto(arr,pivotIndex+1,right);
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
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

    /// 199. Binary Tree Right Side View
//    static void main() {
//        TreeNode node = new TreeNode(5);
//        node.left = new TreeNode(4);
//        node.right = new TreeNode(3);
//        node.left.left = new TreeNode(2);
//        node.left.right = new TreeNode(1);
//        Sol12 sol = new Sol12();
//        System.out.println(sol.rightSideView(node));
//    }
    /// 102. Binary Tree Level Order Traversal
//    static void main() {
//        TreeNode node = new TreeNode(5);
//        node.left = new TreeNode(4);
//        node.right = new TreeNode(3);
//        node.left.left = new TreeNode(2);
//        node.left.right = new TreeNode(1);
//        BinaryTreeLevelOrder sol = new BinaryTreeLevelOrder();
//        System.out.println(sol.treeLevelOrder(node));
//    }

    /// 981. Time Based Key-Value Store
//    static void main() {
//        TimeMap4 map = new TimeMap4();
//        map.set("Soo", "Siuuu", 4);
//        System.out.println(map.get("soo",4));
//    }
    /// 4. Median of Two Sorted Arrays
//    static void main() {
//        int[] A = {1,2};
//        int[] B = {3,4};
//        System.out.println(findMedianSorted(A,B));
//    }
//    static double findMedianSorted(int[] A, int[] B){
//        int n = A.length;
//        int m = B.length;
//        int low = 0, high = n;
//        while (low<=high){
//            int cutA = (low+high)/2;
//            int cutB = (n+m+1)/2 - cutA;
//            int Aleft = (cutA == 0) ? Integer.MIN_VALUE : A[cutA-1];
//            int Aright = (cutA == n) ? Integer.MAX_VALUE : A[cutA];
//            int Bleft = (cutB == 0) ? Integer.MIN_VALUE : B[cutB-1];
//            int Bright = (cutB == m) ? Integer.MAX_VALUE : B[cutB];
//            if (Aleft <= Bright && Bleft <= Aright){
//                if ((n+m)%2==0){
//                    return (Math.max(Aleft,Bleft)+Math.min(Aright,Bright))/2.0;
//                }
//                return Math.max(Aleft,Bleft);
//            } else if (Aleft>Bright){
//                high = cutA - 1;
//            } else low = cutA + 1;
//        }
//        return -1;
//    }

    /// 410. Split Array Largest Sum
//    static void main() {
//        int[] nums = {1,2,3,4,5};
//        int k = 2;
//        System.out.println(splitArray(nums,k));
//    }
//    static int splitArray(int[] nums, int k){
//        int low = max(nums);
//        int high = sum(nums);
//        int ans = high;
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if (canSplit(nums,k,mid)){
//                ans = mid;
//                high = mid - 1;
//            } else  low = mid + 1;
//        }
//        return ans;
//    }
//    static boolean canSplit(int[] nums, int k, int limit){
//        int groupCount = 1, currentSum = 0;
//        for (int x: nums){
//            if (currentSum+x>limit){
//                groupCount++;
//                currentSum = x;
//                if (groupCount>k)return false;
//            } else currentSum += x;
//        }
//        return k >= groupCount;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x:arr)m= Math.max(m,x);
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
//        System.out.println(minEatingSpeed(piles,h));
//    }
//    static int minEatingSpeed(int[] piles, int h){
//        int low = 0;
//        int high = max(piles);
//        int ans = high;
//        while (low<=high){
//            int speed = low+(high-low)/2;
//            if (canEat(piles,h,speed)){
//                ans = speed;
//                high = speed -1;
//            } else low = speed + 1;
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
//        for (int x:arr)m= Math.max(m,x);
//        return m;
//    }
    /// 1011. Capacity To Ship Packages Within D Days
//    static void main() {
//        int[] weights = {1,2,3,1,1};
//        int days = 4;
//        System.out.println(shipWithinDays(weights,days));
//    }
//    static int shipWithinDays(int[] weights , int days){
//        int low = max(weights);
//        int high = sum(weights);
//        int ans = high;
//        while (low <= high) {
//            int mid = low + (high-low)/2;
//            if (canShip(weights,days, mid)){
//                ans = mid;
//                high =mid-1;
//            } else low = mid+1;
//        }
//        return ans;
//    }
//    static boolean canShip(int[] weights, int days, int can){
//        int d = 1, load =0;
//        for (int x: weights){
//            if (load+x>can){
//                d++;
//                load=x;
//            } else load +=x;
//        }
//        return days >= d;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x:arr)m= Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] arr){
//        int s = 0;
//        for (int x:arr)s+=x;
//        return s;
//    }
}
