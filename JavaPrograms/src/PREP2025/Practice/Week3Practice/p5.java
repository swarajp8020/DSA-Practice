package Week3Practice;

import java.util.Arrays;

public class p5 {
    //reverse the array, swap elements from both ends moving toward the center until all elements are reversed in place.
//    static int reverseArray(int[] arr){
//        int left = 0, right = arr.length-1;
//
//        while (left<right){
//            int temp = arr[right];
//            arr[right] = arr[left];
//            arr[left] = temp;
//            left++;
//            right--;
//        }
//        return left;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2,4,5,1,3};
//        System.out.println(Arrays.toString(arr));
//        reverseArray(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    Print 1 to n
//    public static void main(String[] args) {
//        int n = 15;
//        for (int i = 1; i <=n ; i++) {
//            System.out.print(i+ " ");
//        }
//    }
//    Sum of first n numbers

//    public static void main(String[] args) {
//        int[] arr = {3,1,2,5,6};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);
//    }

//Print a triangle pattern (like *, **, ***)
//public static void main(String[] args) {
//    int n = 5;
//    for (int i = 1; i < n; i++) {
//        for (int j = 0; j < i; j++) {
//            System.out.print("*");
//        }
//        System.out.println();
//    }
//}
//    //Reverse a number (e.g., 123 → 321
//public static void main(String[] args) {
//    int num = 123;
//    int rev = 0;
//    while (num>0){
//        int sum = num %10;
//        rev = rev * 10 + sum;
//        num = num/10;
//    }
//    System.out.println(rev);
//}
    //Check if a number is palindrome
//public static void main(String[] args) {
//    int n = 1212;
//    int temp = n;
//    int rev =0;
//
//    while (n>0){
//        int sum =n %10;
//        rev = rev * 10+sum;
//        n = n /10;
//    }
//    if (temp == rev){
//        System.out.println("Palindrome");
//    } else {
//        System.out.println("Not Palindrome");
//    }
//
//}
    //Find factorial of n
//public static void main(String[] args) {
//    int n =5;
//    double fact =1;
//    for (int i = 1; i <=n ; i++) {
//        fact *= i;
//    }
//    System.out.println(fact);
//}

//    Count digits in a number
//public static void main(String[] args) {
//
//    int num = 1445;
//    int count = 0;
//    while (num>0){
//        num = num/10;
//        count++;
//    }
//    System.out.println(count);
//}
//    Print multiplication table of a number
//public static void main(String[] args) {
//    int n=5;
//    for (int i = 1; i <= 10 ; i++) {
//        System.out.println(n*i);
//
//    }
//}
    //
//3. Reverse an array
//
//    public static void main(String[] args) {
//        int[] arr ={1,3,4,5,2};
//
//        for (int left = 0, right = arr.length-1; left<right; left++,right--) {
//            int temp = arr[right];
//            arr[right]=arr[left];
//            arr[left] =temp;
//        }
//        System.out.println(Arrays.toString(arr));
//    }

    //4. Copy array (create a duplicate)

//    public static void main(String[] args) {
//        int[] arr = {2,5,6,2,1,3};
//        int[] copy = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            copy[i] = arr[i];
//        }
//        for (int n:arr){
//            System.out.println(n);
//        }
//    }

    //Search for an element (Linear Search)

//    public static void main(String[] args) {
//        int[] arr ={1,3,4,6,3};
//        int target = 4;
//        boolean found = false;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target){
//                found = true;
//                System.out.println("Found at Index: "+i);
//                break;
//            }
//        } if (!found){
//            System.out.println("not found");
//        }
//    }

    // ArraysInReverseOrder
//    public static void main(String[] args) {
//        int[] arr = {1,3,4,6,2,5};
//        for (int i = arr.length-1; i >=0 ; i--) {
//            System.out.print(arr[i]+ " ");
//        }
//    }
//    /7. AverageOfArrays
//
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,5,6};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        double avg;
//        avg = (double) sum/arr.length;
//        System.out.println(avg);
//    }

//    8. MinMaxArrays
//public static void main(String[] args) {
//    int[] arr = {1,3,4,9,12,8};
//    int min = arr[0];
//    int max = arr[0];
//    for (int i = 1; i < arr.length; i++) {
//        if (arr[i]> max){
//            max = arr[i];
//        } else if (arr[i]<min) {
//            min = arr[i];
//        }
//    }
//    System.out.println(max);
//    System.out.println(min);
//}
//"Count occurrences of a number
//Problem:Given an array, count how many times a number appears.
//Example:
//Input: arr = [2, 3, 5, 3, 7, 3, 9], target = 3
//Output: 3
////🧠 Hint: Use a counter, don’t stop early — count all appearances."
//    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, 3, 7, 3, 9,3};
//        int target = 9;
//        int result = countOccurence(arr,target);
//        System.out.println(result);
//    }
//    static int countOccurence(int[] arr, int target){
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target){
//                count++;
//            }
//        }
//        return count;
//    }
    //"Find if an element exists
    //Problem: Given an array of integers, find whether a number exists in it.
    //Return the index if found, else return -1.
    //Example:
    //Input: arr = [4, 8, 15, 16, 23, 42], target = 23
    //Output: 4
    //🧠 Hint: Return index when found, else return -1.
    //(check result == -1, not target)"
//public static void main(String[] args) {
//    int[] arr = {4, 8, 15, 16, 23, 42};
//    int target = 23;
//    int result = linearsearch(arr,target);
//    if (result == -1){
//        System.out.println("-1");
//    } else {
//        System.out.println("found at index: "+result);
//    }
//}
//static int linearsearch(int[] arr, int target){
//    for (int i = 0; i < arr.length; i++) {
//        if (arr[i] == target){
//            return i;
//        }
//    }
//    return -1;
//}
//"First and last occurrence
//Problem: Find the first and last index of a given number.
//Example:
//Input: arr = [5, 7, 7, 8, 8, 10], target = 8
//Output: first = 3, last = 4
//🧠 Hint:
//Keep two variables: first = -1, last = -1.
//First match → set first.
//Keep updating last each time."
//public static void main(String[] args) {
//    int[] arr = {5, 7, 7, 8, 8, 10};
//    int target = 8;
//    int first = -1;
//    int last = -1;
//
//    for (int i = 0; i < arr.length; i++) {
//        if (arr[i] == target) {
//            if (first == -1) {
//                first = i;
//            }
//            last = i;
//        }
//    }
//    if (first == -1){
//        System.out.println("not found");
//    } else {
//        System.out.println("First "+first +", Last "+ + last);
//    }
//    }

//"Closest element to target
//Problem: Find the element in the array closest to a given target.
//Example:
//Input: arr = [4, 9, 1, 32, 13], target = 10
//Output: 9
//🧠 Hint:
//Use Math.abs(arr[i] - target) to calculate difference.
//Keep track of smallest difference and corresponding element."
//public static void main(String[] args) {
//    int[] arr = {4, 9, 1, 32, 13};
//    int target = 10;
//
//    int closest = arr[0];
//    int minDiff = Math.abs(arr[0] - target);
//
//    for (int i = 1; i < arr.length; i++) {
//        int diff = Math.abs(arr[i] - target);
//
//        if (diff < minDiff) {
//            minDiff = diff;
//            closest = arr[i];
//        }
//    }
//    System.out.println(closest);
//
//}
//
//public static void main(String[] args) {
//    int[] arr = {3,1,4,2,5,7};
//    bubbleSort(arr);
//    System.out.println(Arrays.toString(arr));
//}
//static void bubbleSort(int[] arr){
//    int n = arr.length;
//    for (int i = 0; i < n-1; i++) {
//        for (int j = 0; j < n-i-1; j++) {
//            if (arr[j] > arr[j+1]){
//                int temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//            }
//        }
//
//
//    }
//}
//public static void main(String[] args) {
//    int[] arr = {3,1,4,2,5,7};
//    selectionSort(arr);
//    System.out.println(Arrays.toString(arr));
//}
//static void selectionSort(int[] arr){
//    int n = arr.length;
//    for (int i = 0; i < n-1; i++) {
//        int minIndex =i;
//        for (int j = i+1; j < n; j++) {
//            if (arr[j]< arr[minIndex]){
//                minIndex = j;
//            }
//        }
//        int temp = arr[i];
//        arr[i] = arr[minIndex];
//        arr[minIndex] = temp;
//    }
//}
public static void main(String[] args) {
    int[] arr = {3,1,4,2,5,7};
    insertionSort(arr);
    System.out.println(Arrays.toString(arr));
}
static void insertionSort(int[] arr){
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        int key = arr[i];
        int j = i-1;

        while (j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
}
}

