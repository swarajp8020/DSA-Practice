package PREP2025.Practice.Week6Practice;

//class TimeMap{
//    static PREP2025.HashMap<String, List<Pair>>map;
//    static class Pair{
//        int time;
//        String value;
//        Pair(int t, String v){
//            time = t;
//            value = v;
//        }
//    }
//    public TimeMap(){
//        map = new PREP2025.HashMap<>();
//    }
//    static void set(String key, String value, int timestamp){
//        map.putIfAbsent(key, new ArrayList<>());
//        map.get(key).add(new Pair(timestamp,value));
//    }
//    static String get(String key, int timestamp){
//        if (!map.containsKey(key)) return "";
//        List<Pair> list = map.get(key);
//        int low = 0, high =list.size()-1;
//        String ans = "";
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if (list.get(mid).time <=timestamp){
//                ans = list.get(mid).value;
//                low = mid+1;
//            } else high = mid-1;
//        }
//        return ans;
//    }
//}
class TreeNode3{
    int value;
    TreeNode3 left,right;
    TreeNode3(int x){value = x;}
}
// class DiameterOfBT{
//    static int diameterOfBT(TreeNode3 root){
//        diameter =0;
//        height(root);
//        return diameter;
//    }
//    static int diameter = 0;
//    static int height(TreeNode3 node){
//        if (node==null)return 0;
//        int left = height(node.left);
//        int right = height(node.right);
//         diameter = Math.max(diameter, left+right); //(peeked here once)
//        return 1+Math.max(left,right);
//    }
//}
//class MaxDepth{
//    static int maxDepth(TreeNode3 root){
//        if (root==null)return 0;
//        int left = maxDepth(root.left);
//        int right = maxDepth(root.right);
//        return 1+Math.max(left,right);
//    }
//}
//class BalancedTreeBT{
//    static boolean isBalanced(TreeNode3 root){
//        return dfs(root)!=-1;
//    }
//    static int dfs(TreeNode3 node){
//        if ( node == null) return 0;
//        int left = dfs(node.left);
//        int right = dfs(node.right);
//        if (left == -1 || right == -1) return -1;
//        if (Math.abs(left-right)>1)return -1;
//        return 1+Math.max(left,right);
//    }
//}
class Solution1{
    public static boolean isSame(TreeNode3 p, TreeNode3 q){
        if (p == null & q==null) return true;
        if(p==null || q==null) return false;
        if (p.value != q.value) return false;
        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }
}
public class Dec07Morning {

    /// 100. Same Tree (peek 5 times)
    public static void main(String[] args) {
        TreeNode3 a = new TreeNode3(5);
        a.left = new TreeNode3(4);
        a.right = new TreeNode3(3);

        TreeNode3 b = new TreeNode3(5);
        b.left = new TreeNode3(4);
        b.right = new TreeNode3(3);
        System.out.println(Solution1.isSame(a,b));
    }


    /// Balanced Tree (Peek this 5 times)
//    public static void main(String[] args) {
//        TreeNode3 node = new TreeNode3(3);
//        node.left = new TreeNode3(9);
//        node.right = new TreeNode3( 20);
//        node.right.left =new TreeNode3(15);
//        node.right.right = new TreeNode3(7);
//        System.out.println(BalancedTreeBT.isBalanced(node));
//    }


    /// 104. Maximum Depth of Binary Tree
//    public static void main(String[] args) {
//        TreeNode3 node = new TreeNode3(3);
//        node.left = new TreeNode3(9);
//        node.right = new TreeNode3(20);
//        node.right.left =new TreeNode3(15); //In LC I saw null value Input: root = [3,9,20,null,null,15,7] so how can I add that here as Input?
//        node.right.right = new TreeNode3(7);
//        System.out.println(MaxDepth.maxDepth(node));
//    }


    /// 543. Diameter of Binary Tree
//    public static void main(String[] args) {
//        TreeNode3 node = new TreeNode3(1);
//        node.left = new TreeNode3(2);
//        node.right = new TreeNode3(3);
//        node.right.left = new TreeNode3(4);
//        node.right.right = new TreeNode3(5);
//        System.out.println(DiameterOfBT.diameterOfBT(node));
//    }


    /// 981. Time Based Key-Value Store
//    public static void main(String[] args) {
//        TimeMap map = new TimeMap();
//        map.set("voo","dop",1);
//        System.out.println(map.get("voo",5));
//    }


    /// 4. Median of Two Sorted Arrays
//    public static void main(String[] args) {
//        int[] A = {1,2};
//        int[] B = {3,4};
//        System.out.println(medianTwoArrays(A,B));
//    }
//    static double medianTwoArrays(int[] A, int[] B){
//        int n = A.length;
//        int m = B.length;
//        int low = 0, high = n;
//        while (low<=high){
//            int cutA = low+(high-low)/2;
//            int cutB = (n+m+1)/2-cutA;
//
//            int Aleft = (cutA==0) ? Integer.MIN_VALUE : A[cutA-1];
//            int Aright = (cutA==n) ? Integer.MAX_VALUE : A[cutA];
//
//            int Bleft = (cutB == 0) ? Integer.MIN_VALUE : B[cutB-1];
//            int Bright = (cutB == m) ? Integer.MAX_VALUE : B[cutB];
//
//            if (Aleft <= Bright && Bleft <=Aright){
//                if ((n+m)%2 == 0){
//                    return (Math.max(Aleft, Bleft) + Math.min(Aright,Bright))/2.0;
//                }
//                return Math.max(Aleft,Bleft);
//            } else if (Aleft>Bright) {
//                high = cutA-1;
//            } else low = cutA+1;
//        }
//        return 0;
//    }

    /// 410. Split Array Largest Sum
//    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5};
//        int k =2;
//        System.out.println(splitArrays(nums, k));
//    }
//    static int splitArrays(int[] nums, int k){
//        int low = max(nums);
//        int high = sum(nums);
//        int ans = high;
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if(canSplit(nums, k, mid)){
//                ans = mid;
//                high = mid-1;
//            } else low = mid+1;
//        }
//        return ans;
//    }
//    static boolean canSplit(int[] arr, int k, int limit){
//        int groupCount = 1, currentSum = 0;
//        for (int x:arr){
//            if (currentSum+x>limit){
//                groupCount++;
//                currentSum = x;
//                if (groupCount>k) return false;
//            }else  currentSum += x;
//        }
//        return k >= groupCount;
//    }
//
//    static int max(int[] arr){
//        int m = 0;
//        for (int x: arr)m= Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] arr){
//        int s = 0;
//        for (int x:arr)s+=x;
//        return s;
//    }

        /// 875. Koko Eating Bananas
//    public static void main(String[] args) {
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
//        }
//        return true;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x: arr)m= Math.max(m,x);
//        return m;
//    }

    /// 1011. Capacity To Ship Packages Within D Days
//    public static void main(String[] args) {
//        int[] weights = {1,2,3,1,1};
//        int days = 3;
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
//    static boolean canShip(int[] weights, int days, int cap){
//        int d = 1, load=0;
//        for (int x:weights){
//            if (load+x>cap){
//                d++;
//                load=x;
//            }else load +=x;
//        }
//        return days >=d;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x: arr)m= Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] arr){
//        int s = 0;
//        for (int x:arr)s+=x;
//        return s;
//    }


}
