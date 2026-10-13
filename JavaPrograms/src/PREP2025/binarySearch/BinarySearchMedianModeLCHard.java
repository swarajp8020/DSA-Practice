package PREP2025.binarySearch;
/// 4. Median of Two Sorted Arrays
///  https://leetcode.com/problems/median-of-two-sorted-arrays/description/?envType=problem-list-v2&envId=rr2ss0g5
public class BinarySearchMedianModeLCHard {
    public static void main(String[] args) {
        int[] A={1,2};
        int[] B={3,4};
        System.out.println(findMedianSortedArrays(A,B));
    }
    static double findMedianSortedArrays(int[]A, int[]B){
        if (A.length>B.length) return findMedianSortedArrays(B,A);
        int n = A.length;
        int m = B.length;
        int low = 0, high = n;
        while (low<=high){
            int cutA = (low+high)/2;
            int cutB = (n+m+1)/2-cutA;
            int Aleft  = (cutA == 0) ? Integer.MIN_VALUE : A[cutA - 1];
            int Aright = (cutA == n) ? Integer.MAX_VALUE : A[cutA];

            int Bleft  = (cutB == 0) ? Integer.MIN_VALUE : B[cutB - 1];
            int Bright = (cutB == m) ? Integer.MAX_VALUE : B[cutB];
            if (Aleft <= Bright && Bleft <= Aright) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
                }
                return Math.max(Aleft, Bleft);
            }
            // move search left
            else if (Aleft > Bright) {
                high = cutA - 1;
            }

            // move search right
            else {
                low = cutA + 1;
            }
        }
        return 0; // never happens
    }
}
