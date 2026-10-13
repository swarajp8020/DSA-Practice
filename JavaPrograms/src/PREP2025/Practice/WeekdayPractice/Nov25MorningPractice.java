package PREP2025.Practice.WeekdayPractice;

public class Nov25MorningPractice {



    ///countEvenSubarrays
//    public static void main(String[] args) {
//        int[] arr = {4,1,2,52,1,2,4};
//        int k = 3;
//        int x= 2;
//        int res = countEvenSubarrays(arr, k ,x);
//        System.out.println(res);
//    }
//    static int countEvenSubarrays(int[] arr, int k, int x){
//        int evenCount = 0;
//        int count = 0;
//        for (int i = 0; i < k; i++) {
//            if (arr[i]%2==0)evenCount++;
//        }
//        if (evenCount>=x) count++;
//        for (int i = k; i < arr.length; i++) {
//            if (arr[i-k]%2==0)evenCount--;
//            if (arr[i]%2==0) evenCount++;
//            if (evenCount>=x)count++;
//        }
//        return count;
//    }

//    static int countEvenSubarrays(int[] arr, int k, int x){
//        int countEven= 0;
//        int count =0;
//        for (int i = 0; i < k; i++) {
//            if (arr[i]%2==0) countEven++;
//        }
//        if (countEven>=x) count++;
//        for (int i = k; i < arr.length; i++) {
//            if (arr[i]%2==0) countEven++;
//            if (arr[i-k]%2 == 0) countEven--;
//            if (countEven>=x) count++;
//        }
//        return count;
//    }


    /// LongestUniqueSubarray
//    public static void main(String[] args) {
//        int[] arr ={1,2,3,1,6,1,2,3,4,5};
//        System.out.println(longestUnique(arr));
//    }
//    static int longestUnique(int[] arr){
//        int[] freq = new int[1001];
//        int left = 0;
//        int maxLen = 0;
//        for (int right = 0; right < arr.length; right++) {
//            freq[arr[right]]++;
//            while (freq[arr[right]]>1){
//                freq[arr[left]]--;
//                left++;
//            }
//            maxLen =Math.max(maxLen, right-left+1);
//        }
//        return maxLen;
//    }





















//    static int longestUnique(int[] arr){
//        int[] freq = new int[1001];
//        int left = 0;
//        int maxLen = 0;
//        for (int right = 0; right < arr.length; right++) {
//            freq[arr[right]]++;
//            while (freq[arr[right]]>1){
//                freq[arr[left]]--;
//                left++;
//            }
//            maxLen = Math.max(maxLen, right-left+1);
//        }
//        return maxLen;
//    }

//    /// Count subarrays of size k whose sum is divisible by 3
//    public static void main(String[] args) {
//        int[] arr = {3, 1, 2, 6, 4};
//        int k =3;
//        int res = evenSum(arr, k);
//        System.out.println(res);
//    }
//    static int evenSum(int[] arr, int k){
//        int windowSum = 0;
//        int count = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        if (windowSum%3 == 0) count++;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i] - arr[i-k];
//            if (windowSum%3==0) count++;
//        }
//        return count;
//    }

//    /// Count subarrays of size K with even sum
//    public static void main(String[] args) {
//        int[] arr = {52,23,5,6,2,523};
//        int k =3;
//        int res = evenSum(arr, k);
//        System.out.println(res);
//    }
//    static int evenSum(int[] arr, int k){
//        int windowSum = 0;
//        int count = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        if (windowSum%2 == 0) count++;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i] - arr[i-k];
//            if (windowSum%2==0) count++;
//        }
//        return count;
//    }


//    public static void main(String[] args) {
//        int[] arr = {1,4,6,2,1,3};
//        int k =3;
//        int res = evenSum(arr, k);
//        System.out.println(res);
//    }
//    static int evenSum(int[] arr, int k){
//        int windowSum = 0;
//        int count
//                = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        if (windowSum%2==0) count++;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i]-arr[i-k];
//            if (windowSum%2 == 0) count++;
//        }
//        return count;
//    }

    /// ▸ Max sum of subarray of size K (quick refresh)
//    public static void main(String[] args) {
//        int[] arr = {1,4,6,2,1,3};
//        int k =3;
//        int res = maxSumSubArrayK(arr, k);
//        System.out.println(res);
//    }
//    static int maxSumSubArrayK(int[] arr, int k){
//        int windowSum = 0;
//        int maxSum = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        maxSum = windowSum;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i]-arr[i-k];
//            maxSum = Math.max(windowSum,maxSum);
//        }
//        return maxSum;
//    }

    /// RemoveDuplicates
//    public static void main(String[] args) {
//        int[] arr = {1,1,4,4,3,3,5,5};
//        int len = removeDuplicates(arr);
//        System.out.println(len);
//        System.out.println(Arrays.toString(arr));
//    }
//    static int removeDuplicates(int[] arr){
//        if (arr.length == 0) return 0;
//        int slow = 0;
//        for (int fast = 1; fast < arr.length; fast++) {
//            if (arr[fast]!=arr[slow]){
//                slow++;
//                arr[slow] = arr[fast];
//            }
//        }
//        return slow+1;
//    }

    /// moveZeros
//    public static void main(String[] args) {
//        int[] arr = {1,4,0,1,3,0,5,1,0,3,1};
//        moveZeros(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void moveZeros(int[] arr){
//        int slow = 0;
//        for (int fast = 0; fast < arr.length; fast++) {
//            if (arr[fast]!=0){
//                int temp = arr[slow];
//                arr[slow] = arr[fast];
//                arr[fast] = temp;
//                slow++;
//            }
//        }
//    }

//    public static void main(String[] args) {
//        ///topKSmallest
//        int[] arr = {5,3,1,6,1,3,4};
//        int res = findMedian(arr);
//        System.out.println(res);
//    }
//    static int findMedian(int[] arr){
//        int n = arr.length;
//        int mid = n/2;
//        if (n%2 != 0){
//            return quickSelect(arr, 0, n-1, mid);
//        } else {
//            int a = quickSelect(arr, 0, n-1, mid);
//            int b = quickSelect(arr, 0, n-1, mid-1);
//            return (a+b)/2;
//        }
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex==targetIndex) return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right, targetIndex);
//            return quickSelect(arr, left, pivotIndex-1, targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr,i,j);
//            }
//        }
//        swap(arr, i+1, right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
//

//    public static void main(String[] args) {
//        ///topKSmallest
//        int[] arr = {5,3,1,6,1,3};
//        int k = 3;
//        int[] res = topKSmallest(arr, k);
//        System.out.println(Arrays.toString(res));
//    }
//    static int[] topKSmallest(int[] arr, int k){
//        int n = arr.length;
//        int targetIndex = k-1;
//        quickSelect(arr, 0, n-1, targetIndex);
//        return Arrays.copyOfRange(arr, 0, k);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex==targetIndex) return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right, targetIndex);
//            return quickSelect(arr, left, pivotIndex-1, targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr,i,j);
//            }
//        }
//        swap(arr, i+1, right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

//    public static void main(String[] args) {
//        ///topKLargest
//        int[] arr = {5,3,1,6,1,3};
//        int k = 3;
//        int[] res = TopKLargest(arr, k);
//        System.out.println(Arrays.toString(res));
//    }
//    static int[] TopKLargest(int[] arr, int k){
//        int n = arr.length;
//        int targetIndex = n-k;
//        quickSelect(arr, 0, n-1, targetIndex);
//        return Arrays.copyOfRange(arr, targetIndex, n);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex==targetIndex) return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right, targetIndex);
//            return quickSelect(arr, left, pivotIndex-1, targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr,i,j);
//            }
//        }
//        swap(arr, i+1, right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

//    public static void main(String[] args) {
//        /// kth Smallest
//        int[] arr = {5,3,1,6,1,3};
//        int k = 1;
//        int res = quickSelect(arr, 0, arr.length-1,k-1);
//        System.out.println(res);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex==targetIndex) return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right, targetIndex);
//            return quickSelect(arr, left, pivotIndex-1, targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr,i,j);
//            }
//        }
//        swap(arr, i+1, right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
//    public static void main(String[] args) {
//        /// kth Largest
//        int[] arr = {5,3,1,6,1,3};
//        int k = 1;
//        int res = quickSelect(arr, 0, arr.length-1,arr.length-k);
//        System.out.println(res);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex==targetIndex) return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right, targetIndex);
//            return quickSelect(arr, left, pivotIndex+1, targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr,i,j);
//            }
//        }
//        swap(arr, i+1, right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
}
