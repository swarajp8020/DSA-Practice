package PREP2025.Practice.WeekdayPractice;


import java.util.Arrays;

public class Nov24 {
//    QuickSort
public static void main(String[] args) {
    int[] arr = {1,4,54,22,31};
    quickSort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
}
    static void quickSort(int[] arr, int left, int right){
    if (left>=right) return;
    int pivotIndex = partitionLomuto(arr, left, right);
    quickSort(arr, left, pivotIndex-1);
    quickSort(arr, pivotIndex+1, right);
    }
    static int partitionLomuto(int[] arr, int left, int right){
    int pivot = arr[right];
    int i = left-1;
        for (int j = left; j < right; j++) {
            if (arr[j]<=pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }
    static void swap(int[] arr, int a, int b){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
    }

//mergesort[took 2 times peek]
//    public static void main(String[] args) {
//        int[] arr = {1,4,54,22,31};
//        mergeSort(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void mergeSort(int[] arr, int left, int right){
//        if (left>=right) return;
//        int mid = left+(right-left)/2;
//        mergeSort(arr, left, mid);
//        mergeSort(arr, mid+1, right);
//        merge(arr, left,mid,right);
//    }
//    static void merge(int[] arr, int left, int mid, int right){
//        int[] temp = new int[right-left+1];
//        int i = left;
//        int j = mid+1;
//        int k = 0;
//        while (i<=mid && j<=right){
//            if (arr[i]<=arr[j]){
//                temp[k++] = arr[i++];
//            } else {
//                temp[k++] = arr[j++];
//            }
//        }
//        while (i<=mid)  temp[k++] = arr[i++];
//        while (j<=right)  temp[k++] = arr[j++];
//        for (int l = 0; l < temp.length; l++) {
//            arr[left+l] = temp[l];
//        }
//    }

////5️⃣ Median
//    public static void main(String[] args) {
//        int[] arr = {1,4,54,22,31};
//        findMedian(arr);
//        System.out.println(findMedian(arr));
//    }
//    static int findMedian(int[] arr){
//        int n = arr.length;
//        int mid = n/2;
//        if (n%2 !=0){
//            return quickSelect(arr, 0, n-1,mid);
//        } else {
//            int a = quickSelect(arr, 0, n-1,mid);
//            int b = quickSelect(arr, 0, n-1,mid-1);
//            return (a+b)/2;
//        }
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex == targetIndex) return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right,targetIndex);
//            return quickSelect(arr, left, pivotIndex-1, targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int  i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i, j);
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


//4️⃣ Top-K Smallest
//    public static void main(String[] args) {
//        int[] arr = {1,4,54,22,31};
//        int k = 1;
//        int[] res = topKLargest(arr, k);
//        System.out.println(Arrays.toString(res));
//    }
//    static int[] topKLargest(int[] arr, int k){
//        int n = arr.length;
//        int targetIndex = k-1;
//        quickSelect(arr, 0, n-1,targetIndex);
//        return Arrays.copyOfRange(arr, 0,k);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex == targetIndex) return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right,targetIndex);
//            return quickSelect(arr, left, pivotIndex-1, targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int  i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i, j);
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

//3️⃣ Top-K Largest
//    public static void main(String[] args) {
//        int[] arr = {1,4,54,22,31};
//        int k = 1;
//        int[] res = topKLargest(arr, k);
//        System.out.println(Arrays.toString(res));
//    }
//    static int[] topKLargest(int[] arr, int k){
//        int n = arr.length;
//        int targetIndex = n-k;
//        quickSelect(arr, 0, n-1,targetIndex);
//        return Arrays.copyOfRange(arr, targetIndex,n);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex == targetIndex) return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right,targetIndex);
//            return quickSelect(arr, left, pivotIndex-1, targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int  i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i, j);
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

//2️⃣ Kth Smallest
//    public static void main(String[] args) {
//        int[] arr = {1,4,54,22,31};
//        int k =1;
//        int res = quickSelect(arr, 0, arr.length-1,k-1);
//        System.out.println(res);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex == targetIndex) return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right,targetIndex);
//            return quickSelect(arr, left, pivotIndex-1, targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int  i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i, j);
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

    //1️⃣ Kth Largest
//    public static void main(String[] args) {
//        int[] arr = {1,4,54,22,31};
//        int k =1;
//        int res = quickSelect(arr, 0, arr.length-1,arr.length-k);
//        System.out.println(res);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex == targetIndex) return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right,targetIndex);
//            return quickSelect(arr, left, pivotIndex-1, targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int  i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i, j);
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






























////    Two Pointers
////
////✔ Move Zeros
//public static void main(String[] args) {
//    int[] arr ={3,0,5,5,0,1,4,1,0,5};
//    moveZeros(arr);
//    System.out.println(Arrays.toString(arr));
//}
//static void moveZeros(int[] arr){
//    int slow= 0;
//    for (int fast = 0; fast < arr.length; fast++) {
//        if (arr[fast]!=0){
//            int temp =arr[slow];
//            arr[slow] = arr[fast];
//            arr[fast] =temp;
//            slow++;
//        }
//    }
//}
//✔ Remove Duplicates (Sorted)
//public static void main(String[] args) {
//    int[] arr ={3,3,5,5,1,1,4,1,2,5};
//    removeDuplicates(arr);
//    System.out.println(Arrays.toString(arr));
//}
//static int removeDuplicates(int[] arr){
//    if (arr.length == 0) return 0;
//    int slow = 0;
//    for (int fast = 1; fast < arr.length; fast++) {
//        if (arr[fast]!=arr[slow]){
//            slow++;
//            arr[slow] = arr[fast];
//        }
//    }
//    return slow+1;
//}


    //QuickSelect family
//✔ Median using QuickSelect
//    public static void main(String[] args) {
//        int[] arr ={3,5,1,4,1,2,5};
//        medianFinder(arr);
//        System.out.println(medianFinder(arr));
//    }
//    static int medianFinder(int[] arr){
//       int n = arr.length;
//       int mid = n/2;
//       if (n%2 != 0){
//           return quickSelect(arr, 0, n-1,mid);
//       }else {
//           int a = quickSelect(arr, 0, n-1,mid);
//           int b = quickSelect(arr, 0, n-1,mid-1);
//           return (a+b)/2;
//       }
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex==targetIndex)return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right,targetIndex);
//            return quickSelect(arr,left,pivotIndex-1,targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i =left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i,j);
//            }
//        }
//        swap(arr, i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp =arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

////✔ Top-K Smallest
//    public static void main(String[] args) {
//        int[] arr ={3,5,1,4,1,2,5};
//        int k = 1;
//        int[] res = topKLargest(arr, k);
//        System.out.println(Arrays.toString(res));
//    }
//    static int[] topKLargest(int[] arr, int k){
//        int n = arr.length;
//        int targetIndex = k-1;
//        quickSelect(arr, 0, n-1, targetIndex);
//        return Arrays.copyOfRange(arr, 0,k);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex==targetIndex)return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right,targetIndex);
//            return quickSelect(arr,left,pivotIndex-1,targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i =left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i,j);
//            }
//        }
//        swap(arr, i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp =arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

    //✔ Top-K Largest
//    public static void main(String[] args) {
//        int[] arr ={3,5,1,4,1,2,5};
//        int k = 3;
//        int[] res = topKLargest(arr, k);
//        System.out.println(Arrays.toString(res));
//    }
//    static int[] topKLargest(int[] arr, int k){
//        int n = arr.length;
//        int targetIndex = n-k;
//        quickSelect(arr, 0, n-1, targetIndex);
//        return Arrays.copyOfRange(arr, targetIndex,n);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex==targetIndex)return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right,targetIndex);
//            return quickSelect(arr,left,pivotIndex-1,targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i =left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i,j);
//            }
//        }
//        swap(arr, i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp =arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }


    //✔ Kth Smallest
//    public static void main(String[] args) {
//        int[] arr ={3,5,1,4,1,2,5};
//        int k = 1;
//        int res = quickSelect(arr, 0, arr.length-1, k-1);
//        System.out.println(res);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex==targetIndex)return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right,targetIndex);
//            return quickSelect(arr,left,pivotIndex-1,targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i =left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i,j);
//            }
//        }
//        swap(arr, i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp =arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

    //✔ Kth Largest
//    public static void main(String[] args) {
//        int[] arr ={3,5,1,4,1,2,5};
//        int k = 1;
//        int res = quickSelect(arr, 0, arr.length-1, arr.length-k);
//        System.out.println(res);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex==targetIndex)return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right,targetIndex);
//            return quickSelect(arr,left,pivotIndex-1,targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i =left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i,j);
//            }
//        }
//        swap(arr, i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp =arr[a];
//        arr[a] = arr[b];
//         arr[b] = temp;
//    }
}
