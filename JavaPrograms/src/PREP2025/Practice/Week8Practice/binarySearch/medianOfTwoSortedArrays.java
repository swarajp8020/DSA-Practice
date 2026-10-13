package PREP2025.Practice.Week8Practice.binarySearch;

public class medianOfTwoSortedArrays {
    static void main(String[] args) {
        int[] A = {1,3};
        int[] B = {2};
        System.out.println(medianOfTwoSortedArrays(A,B));
    }
    static double medianOfTwoSortedArrays(int[] A, int[] B){
        if (B.length > A.length) return medianOfTwoSortedArrays(B,A);
        int n = A.length;
        int m = B.length;
        int low = 0, high = n;
        while (low <= high) {
            int cutA = low + (high-low)/2;
            int cutB = (n+m+1)/2-cutA;
            int Aleft = (cutA == 0) ? Integer.MIN_VALUE : A[cutA-1];
            int Aright = (cutA == n) ? Integer.MAX_VALUE : A[cutA];
            int Bleft = (cutB == 0) ? Integer.MIN_VALUE : B[cutB-1];
            int Bright = (cutB == m) ? Integer.MAX_VALUE : B[cutB];

            if (Aleft <= Bright && Bleft <= Aright) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(Aleft, Bleft)+Math.min(Aright, Bright))/2.0;
                }
                return (Math.max(Aleft,Bleft));
            } else if (Aleft > Bright) {
                high = cutA - 1;
            } else low = cutA + 1;
        }
        return -1;
    }
}
