package PREP2025.Practice.Week6Practice;

//class TimeMap{
//    static PREP2025.HashMap<String , List<Pair>> map;
//    static class Pair{
//        int time;
//        String  value;
//        Pair(int t, String v){
//            time=t;
//            value=v;
//        }
//    }
//    public TimeMap(){
//        map = new PREP2025.HashMap<>();
//    }
//    static void set(String key,String value, int timestamp){
//        map.putIfAbsent(key, new ArrayList<>());
//        map.get(key).add(new Pair(timestamp,value));
//    }
//    static String get(String key, int timestamp){
//        if (!map.containsKey(key)) return "";
//        List<Pair> list = map.get(key);
//        int low = 0,high = list.size()-1;
//        String ans = "";
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if (list.get(mid).time<=timestamp){
//                ans = list.get(mid).value;
//                low = mid+1;
//            } else high = mid-1;
//        }
//        return ans;
//    }
//}

//class MaxDepth{
//    public static int maxDepth(TreeNode node){
//        if (node==null) return 0;
//        int left = maxDepth(node.left);
//        int right = maxDepth(node.right);
//        return 1+Math.max(left,right);
//    }
//}
class DiameterBT{

    public static int diameterOfBT(TreeNode node){
        diameter = 0;
        height(node);
        return diameter;
    }
    static int diameter = 0;
    private static int height(TreeNode root){
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left+right);
        return 1+Math.max(left,right);
    }
}
class TreeNode {
    int value;
    TreeNode left,right;
    TreeNode(int x) {value = x;}
}

public class p1 {

    /// DiameterBinaryTree
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        System.out.println(DiameterBT.diameterOfBT(node));
    }

    /// MaxDepthBinaryTree
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(9);
//        root.left = new TreeNode(5);
//        root.right = new TreeNode(4);
//        System.out.println(MaxDepth.maxDepth(root));
//    }
/// 981. Time Based Key-Value Store
//    public static void main(String[] args) {
//    TimeMap timeMap = new TimeMap();
//    timeMap.set("boo", "soo",1);
//        System.out.println(timeMap.get("boo",4));
//    }
/// 4. Median of Two Sorted Arrays
//    public static void main(String[] args) {
//        int[] A = {1,2};
//        int[] B = {3,4};
//        System.out.println(medianArrays(A,B));
//    }
//    static double medianArrays(int[] A, int[] B){
//        int n = A.length;
//        int m = B.length;
//        int low =0,high=n;
//        while (low<=high){
//            int cutA= (high+low)/2;
//            int cutB = (n+m+1)/2-cutA;
//            int Aleft = (cutA==0)?Integer.MIN_VALUE:A[cutA-1];
//            int Aright = (cutA==n)?Integer.MAX_VALUE:A[cutA];
//            int Bleft = (cutB == 0)?Integer.MIN_VALUE:B[cutB-1];
//            int Bright = (cutB == m)?Integer.MAX_VALUE:B[cutB];
//
//            if (Aleft<=Bright && Bleft<=Aright){
//                if ((n+m)%2==0){
//                    return (Math.max(Aleft,Bleft)+Math.min(Aright, Bright))/2.0;
//                }
//                return Math.max(Aleft,Bleft);
//            }else if (Aleft>Bright){
//                high = cutA-1;
//            } else low = cutA+1;
//        }
//        return 0;
//    }

/// 410. Split Array Largest Sum
//public static void main(String[] args) {
//    int[] nums = {1,2,3,4,5};
//    int k =2;
//    System.out.println(splitArray(nums, k));
//}
//static int splitArray(int[] nums, int k){
//    int low = max(nums);
//    int high = sum(nums);
//    int ans = high;
//    while (low<=high){
//        int mid = low+(high-low)/2;
//        if (canSplit(nums, k, mid)){
//            ans =mid;
//            high =mid-1;
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
//    return k >= groupCount;
//}
//    static int max(int[] arr){
//        int m = 0;
//        for (int x:arr)m=Math.max(m,x);
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
//        System.out.println(eatingBanana(piles, h));
//    }
//    static int eatingBanana(int[] piles, int h){
//        int low = 0;
//        int high = max(piles);
//        int ans = high;
//        while (low<=high){
//            int speed= low+(high-low)/2;
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
//            if (hoursUsed>h)return false;
//        }
//        return true;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x:arr)m=Math.max(m,x);
//        return m;
//    }

/// 1011. Capacity To Ship Packages Within D Days
//    public static void main(String[] args) {
//        int[] weights = {1,2,3,1,1};
//        int days = 4;
//        System.out.println(shipCapacity(weights,days));
//    }
//    static int shipCapacity(int[] weights, int days){
//        int low = max(weights);
//        int high = sum(weights);
//        int ans = high;
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if (canShip(weights,days,mid)){
//                ans = mid;
//                high = mid-1;
//            }else low = mid+1;
//        }
//        return ans;
//    }
//    static boolean canShip(int[] weights, int days, int cap){
//        int d =1, load =0;
//        for (int x: weights){
//            if (load+x>cap){
//                d++;
//                load=x;
//            }else load+=x;
//        }
//        return days >= d;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x:arr)m=Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] arr){
//        int s = 0;
//        for (int x:arr)s+=x;
//        return s;
//    }
}
