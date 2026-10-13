package PREP2025.binarySearch;
/// Find smallest number whose square ≥ N
/// Input: N=40
/// Smallest integer ≥ root = 7
/// We binary-search range [1..N]
public class BinarySearchAnswer {
    public static void main(String[] args) {
        int N =40;
        System.out.println(sqrtCeil(N));
    }
    static int sqrtCeil(int N){
        int left=0,right=N,ans=N;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (mid*mid>=N){
                ans=mid;
                right=mid-1;
            } else left = mid+1;
        }
        return ans;
    }
}
