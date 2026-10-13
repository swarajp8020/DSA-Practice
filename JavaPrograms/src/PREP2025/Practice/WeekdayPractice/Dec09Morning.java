package PREP2025.Practice.WeekdayPractice;

import java.util.*;

//class TimeMap31{
//    static PREP2025.HashMap<String , List<Pair4>> map;
//    static class Pair4{
//        int time;
//        String value;
//        Pair4(int t, String v){
//            time =t;
//            value = v;
//        }
//    }
//    public TimeMap31(){
//        map = new PREP2025.HashMap<>();
//    }
//    static void set(String key, String value, int timestamp){
//        map.putIfAbsent(key,new ArrayList<>());
//        map.get(key).add(new Pair4(timestamp,value));
//    }
//    static String  get(String key, int timestamp){
//        if (!map.containsKey(key))return "";
//        List<Pair4> list = map.get(key);
//        int low = 0, high = list.size()-1;
//        String ans = "";
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if (list.get(mid).time <= timestamp) {
//                ans = list.get(mid).value;
//                low = mid+1;
//            } else high = mid-1;
//        }
//        return ans;
//    }
//}
//class MaxDepth1{
//    static int maxDepth(TreeNode root){
//        if (root == null )return 0;
//        int left = maxDepth(root.left);
//        int right = maxDepth(root.right);
//        return 1+Math.max(left,right);
//    }
//}
//class BalanceBT{
//    static boolean isBalance(TreeNode root){
//        return dfs(root)!=-1;
//    }
//    static int dfs(TreeNode node){
//        if (node == null) return 0;
//        int left = dfs(node.left);
//        int right = dfs(node.right);
//        if (left == -1 || right == -1)return -1;
//        if (Math.abs(left-right)>1) return -1;
//        return 1+Math.max(left,right);
//    }
//}
//class Solution{
//    public List<List<Integer>> levelOrderTraversal(TreeNode root){
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
class Solution{
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if (root == null )return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size =q.size();
            TreeNode last = null;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                last = node;
                if (node.left!= null)q.add(node.left);
                if (node.right!= null)q.add(node.right);
            }
            result.add(last.val);
        }
        return result;
    }
}
public class Dec09Morning {
    /// RightSideView BT
    static void main() {
    TreeNode node = new TreeNode(5);
    node.left = new TreeNode(4);
    node.right = new TreeNode(3);
    node.left.left = new TreeNode(2);
    node.left.right = new TreeNode(1);
    Solution solution = new Solution();
        System.out.println(solution.rightSideView(node));
    }

//    /// LevelOrderTraversal BT
//    static void main() {
//    TreeNode node = new TreeNode(5);
//    node.left = new TreeNode(4);
//    node.right = new TreeNode(3);
//    node.left.left = new TreeNode(2);
//    node.left.right = new TreeNode(1);
//    Solution solution = new Solution();
//        System.out.println(solution.levelOrderTraversal(node));
//    }

//    /// RotateArray
//
//    static void main() {
//        int[] arr = {4,5,6,7,0,1,2};
//        int target = 0;
//        System.out.println(rotatedArrays(arr,target));
//    }
//    static int rotatedArrays(int[] arr, int target){
//        int low =0, high =arr.length-1;
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if (arr[mid] == target)return mid;
//            if (arr[mid]>target){
//                if (arr[low]<= target && target <= arr[mid])high = mid-1;
//                else low = mid+1;
//            } else {
//                if (arr[mid]<=target && target<=arr[high]) low = mid+1;
//                else high = mid-1;
//            }
//        }
//        return -1;
//    }

    ///  BS First/Last Occurrence
//    static void main() {
//        int[] arr = {2,5,7,9,12};
//        int target = 9;
//        System.out.println(first(arr,target));
//        System.out.println(last(arr,target));
//    }
//    static int first(int[] arr, int target){
//        int low=0, high =arr.length-1,ans =high;
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if (arr[mid] == target){
//                ans = mid;
//                high =mid-1;
//            } else if (arr[mid]<target) {
//                low = mid+1;
//            } else high = mid-1;
//        }
//        return ans;
//    }
//    static int last(int[] arr, int target){
//        int low=0, high =arr.length-1,ans =high;
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if (arr[mid] == target){
//                ans = mid;
//                low = mid+1;
//            } else if (arr[mid]<target) {
//                low = mid+1;
//            } else high = mid-1;
//        }
//        return ans;
//    }

    /// Find smallest number whose square ≥ N
    /// Input: N=40
    /// Smallest integer ≥ root = 7
    /// We binary-search range [1..N]
    /// BinarySearchAnswer
//    static void main() {
//        int N = 40;
//        System.out.println(sqrtCeil(N));
//    }
//    static int sqrtCeil(int N){
//        int low =0, high = N, ans = high;
//        while (low<=high){
//            int mid =low+(high-low)/2;
//            if (mid*mid>=N){
//                ans = mid;
//                high = mid-1;
//            } else low =mid+1;
//        }
//        return ans;
//    }

    /// Binary Search PREP2025.binarySearch
//    static void main() {
//        int[] arr = {3,13,45,23,44};
//        int target = 23;
//        Arrays.sort(arr);
//        System.out.println("Arrays: "+Arrays.toString(arr));
//        int res = search(arr,target);
//        if (res == -1){
//            System.out.println("not found");
//        } else {
//            System.out.println("found: "+res);
//        }
//    }
//    static int search(int[] arr, int target){
//        int low = 0, high = arr.length-1;
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if (arr[mid] == target){
//                return mid;
//            } else if (arr[mid]<target){
//                high = mid-1;
//            } else low =mid+1;
//        }
//        return -1;
//    }

    /// 110. Balanced Binary Tree (Peeked 3 times)
//    static void main() {
//    TreeNode node = new TreeNode(5);
//    node.left = new TreeNode(4);
//    node.right = new TreeNode(3);
//    node.right.left = new TreeNode(2);
//    node.right.right = new TreeNode(1);
//        System.out.println(BalanceBT.isBalance(node));
//    }
/// 104. Maximum Depth of Binary Tree
//static void main() {
//    TreeNode node = new TreeNode(5);
//    node.left = new TreeNode(4);
//    node.right = new TreeNode(3);
//    node.right.left = new TreeNode(2);
//    node.right.right = new TreeNode(1);
//    System.out.println(MaxDepth1.maxDepth(node));
//}
    /// 981. Time Based Key-Value Store
//    static void main() {
//        TimeMap31 map = new TimeMap31();
//        map.set("soo", "siu", 4);
//        System.out.println(map.get("soo",4));
//    }
    /// 4. Median of Two Sorted Arrays
//    static void main() {
//        int[] A = {1,2};
//        int[] B = {3,4};
//        System.out.println(medianTwoArrays(A,B));
//    }
//    static double medianTwoArrays(int[] A, int[] B){
//        if (A.length>B.length)return medianTwoArrays(B,A);
//        int n = A.length;
//        int m = B.length;
//        int low = 0, high =n;
//        while (low<=high){
//            int cutA = (low+high)/2;
//            int cutB = (n+m+1)/2-cutA;
//            int Aleft = (cutA == 0)?Integer.MIN_VALUE:A[cutA-1];
//            int Aright = (cutA == n)?Integer.MAX_VALUE:A[cutA];
//            int Bleft = (cutB == 0)?Integer.MIN_VALUE:B[cutB-1];
//            int Bright = (cutB == m)?Integer.MAX_VALUE:B[cutB];
//            if (Aleft<=Bright && Bleft <= Aright){
//                if ((n+m)%2==0){
//                    return (Math.max(Aleft,Bleft)+Math.min(Aright,Bright))/2.0;
//                }
//                return Math.max(Aleft,Bleft);
//            } else if (Aleft>Bright) {
//                high = cutA-1;
//            } else low = cutA+1;
//        }
//        return 0;
//    }
    /// 410. Split Array Largest Sum
//    static void main() {
//        int[] nums = {1,2,3,4,5};
//        int k =2 ;
//        System.out.println(splitArray(nums,k));
//    }
//    static int splitArray(int[] nums, int k){
//        int low = max(nums);
//        int high = sum(nums);
//        int ans = high;
//        while (low <= high) {
//            int mid = low+(high-low)/2;
//            if (canSplit(nums,k,mid)){
//                ans = mid;
//                high = mid-1;
//            } else low = mid+1;
//        }
//        return ans;
//    }
//    static boolean canSplit(int[] nums, int k, int limit){
//        int groupCount =1, currentSum =0;
//        for (int x: nums){
//            if (currentSum+x>limit){
//                groupCount++;
//                currentSum=x;
//                if (groupCount>k)return false;
//            } else currentSum +=x;
//        }
//        return k >= groupCount;
//    }
//    static int max(int[]arr){
//        int m =0;
//        for (int x:arr)m=Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] arr){
//        int s= 0;
//        for (int x: arr)s+=x;
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
//        while (low<=high){
//            int speed = low+(high-low)/2;
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
//            if (hoursUsed>h) return false;
//        }
//        return true;
//    }
//    static int max(int[]arr){
//        int m =0;
//        for (int x:arr)m=Math.max(m,x);
//        return m;
//    }
/// 1011. Capacity To Ship Packages Within D Days
//    static void main() {
//        int[] weights = {1,2,3,1,1};
//        int days = 4;
//        System.out.println(capacityShip(weights,days));
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
//    static boolean canShip(int[] weights, int days, int can){
//        int d = 1, load = 0;
//        for (int x: weights){
//            if (load+x>can){
//                d++;
//                load=x;
//            } else load+=x;
//        }
//        return days >=d;
//    }
//    static int max(int[]arr){
//        int m =0;
//        for (int x:arr)m=Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] arr){
//        int s= 0;
//        for (int x: arr)s+=x;
//        return s;
//    }
}
