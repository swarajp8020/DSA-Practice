package PREP2025.Practice.WeekdayPractice;

//class TimeMap11{
//    static PREP2025.HashMap<String, List<Pair>> map;
//    public TimeMap11(){
//        map = new PREP2025.HashMap<>();
//    }
//    static class Pair{
//        int time;
//        String value;
//        Pair(int t, String v){
//            time = t;
//            value = v;
//        }
//    }
//
//    static void set(String key, String value, int timestamp){
//        map.putIfAbsent(key, new ArrayList<>());
//        map.get(key).add(new Pair(timestamp,value));
//    }
//    public static String get(String key, int timestamp){
//        if (!map.containsKey(key)) return "";
//        List<Pair> list = map.get(key);
//        int low = 0, high = list.size()-1;
//        String result = "";
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if (list.get(mid).time <= timestamp){
//                result = list.get(mid).value;
//                low = mid+1;
//            } else high = mid-1;
//        }
//        return result;
//    }
//}
//class DiameterBT2{
//    static int diameterOfBT(TreeNode root){
//        diameter = 0;
//        height(root);
//        return diameter;
//    }
//    static int diameter =0;
//    static int height(TreeNode node){
//        if (node == null) return 0;
//        int left = height(node.left);
//        int right = height(node.right);
//        diameter = Math.max(diameter, left+right);
//        return 1+Math.max(left,right);
//    }
//
//}

//class SameTree{
//    static boolean isSameTree(TreeNode p, TreeNode q){
//        if (p == null && q == null) return true;
//        if (p == null || q == null) return false;
//        if (p.val != q.val) return  false;
//        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//    }
//}
//class Solution{
//    public boolean isBalanced(TreeNode root){
//        return dfs(root)!=-1;
//    }
//    private static int dfs(TreeNode node){
//        if (node == null) return 0;
//        int left = dfs(node.left);
//        int right = dfs(node.right);
//        if (left == -1 || right ==-1) return -1;
//        if (Math.abs(left-right)>1) return -1;
//        return 1+Math.max(left,right);
//    }
//}
class Solution2{
    public static int maxDepth(TreeNode root){
        if (root==null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1+ Math.max(left,right);
    }
}

public class Dec08Morning {
/// 104. Maximum Depth of Binary Tree (peeked 1 time only)
    static void main() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);

        System.out.println(Solution2.maxDepth(node));
    }
    /// 110. Balanced Binary Tree {peeked 5 times}
//
//    static void main() {
//    TreeNode node = new TreeNode(3);
//    node.left = new TreeNode(9);
//    node.right = new TreeNode(20);
//    node.right.left = new TreeNode(15);
//    node.right.right = new TreeNode(7);
//    Solution solution = new Solution();
//    System.out.println(solution.isBalanced(node));
//}

    /// 100. Same Tree
//    static void main() {
//        TreeNode a = new TreeNode(1);
//        a.left = new TreeNode(2);
//        a.right = new TreeNode(3);
//        TreeNode b = new TreeNode(1);
//        b.left = new TreeNode(2);
//        b.right = new TreeNode(3);
//        System.out.println(SameTree.isSameTree(a,b));
//    }

/// 543. Diameter of Binary Tree
//static void main() {
//    TreeNode node = new TreeNode(1);
//    node.left = new TreeNode(2);
//
//    System.out.println(DiameterBT2.diameterOfBT(node));
//}


///  981. Time Based Key-Value Store
//public static void main(String[] args) {
//    TimeMap11 map = new TimeMap11();
//    map.set("sos","siuuu", 7);
//    System.out.println(map.get("sos", 4));
//}
    /// 4. Median of Two Sorted Arrays
//    static void main() {
//        int[] A = {1,2};
//        int[] B = {3,4};
//        System.out.println(medianTwoSortedArrays(A,B));
//    }
//    static double medianTwoSortedArrays(int[] A, int[] B){
//        int n = A.length;
//        int m = B.length;
//        int low =0, high =n;
//        while (low<=high){
//            int cutA = (high+low)/2;
//            int cutB = (n+m+1)/2-cutA;
//            int Aleft = (cutA==0)?Integer.MIN_VALUE:A[cutA-1];
//            int Aright = (cutA==n)?Integer.MAX_VALUE:A[cutA];
//            int Bleft = (cutB==0)?Integer.MIN_VALUE:B[cutB-1];
//            int Bright = (cutB==m)?Integer.MAX_VALUE:B[cutB];
//            if (Aleft<=Bright && Bleft<=Aright){
//                if ((n+m)%2==0){
//                    return (Math.max(Aleft,Bleft)+Math.min(Aright,Bright))/2.0;
//                }
//                return Math.max(Aleft,Bleft);
//            } else if (Aleft > Bright){
//                high = cutA-1;
//            } else low = cutA+1;
//        }
//        return 0;
//    }

    /// 410. Split Array Largest Sum
//    static void main() {
//        int[] nums = {1,2,3,4,5};
//        int k =2;
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
//    static boolean canSplit(int[] nums,int k, int limit){
//        int groupCount = 1, currentSum = 0;
//        for (int x:nums){
//            if (currentSum+x>limit){
//                groupCount++;
//                currentSum=x;
//                if (groupCount>k) return false;
//            }else currentSum += x;
//        }
//        return k >= groupCount;
//    }
//    static int max(int[] arr){
//        int m=0;
//        for (int x:arr)m=Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] arr){
//        int s=0;
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
//        int low =0;
//        int high = max(piles);
//        int ans = high;
//        while (low<=high){
//            int speed = low +(high-low)/2;
//            if (canEat(piles, h, speed)){
//                ans = speed;
//                high = speed-1;
//            } else low = speed+1;
//        }
//        return ans;
//    }
//    static boolean canEat(int[] piles, int h, int speed){
//        int hoursUsed= 0;
//        for (int pile:piles){
//            hoursUsed += (pile+speed-1)/speed;
//            if (hoursUsed>h) return false;
//        }
//        return true;
//    }
//    static int max(int[] arr){
//        int m=0;
//        for (int x:arr)m=Math.max(m,x);
//        return m;
//    }
    /// 1011. Capacity To Ship Packages Within D Days
//    public static void main(String[] args){
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
//    static boolean canShip(int[] weights, int days, int can){
//        int d=1, load=0;
//        for (int x:weights){
//            if (load+x>can){
//                d++;
//                load = x;
//            } else load+=x;
//        }
//        return days >=d;
//    }
//    static int max(int[] arr){
//        int m=0;
//        for (int x:arr)m=Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] arr){
//        int s=0;
//        for (int x:arr)s+=x;
//        return s;
//    }
}
