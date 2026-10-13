


package Week2Practice;

public class p6 {
//    // reverse the array, swap elements from both ends moving toward the center until
//// all elements are reversed in place.
//Reverse a number (e.g., 123 → 321

//    void revArray(int[] arr) {
//        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {2,3,5,7,8};
//        p6 array = new p6();
//        array.revArray(arr);
//
//        System.out.println(Arrays.toString(arr));
//    }

    //"Print 1 to n
//public static void main(String[] args) {
//    int n = 16;
//    for (int i = 1; i <= n; i++) {
//        System.out.println(i);
//    }
//}
    //Sum of first n numbers
//public static void main(String[] args) {
//    int[] arr = {1,6,4,5,8};
//    int sum =0;
//    for (int i = 0; i < arr.length; i++) {
//        sum += arr[i];
//    }
//    System.out.println(sum);
//}

//Print a triangle pattern (like *, **, ***)
//public static void main(String[] args) {
//    int n =4;
//    for (int i = 1; i < n; i++) {
//        for (int j = 0; j < i; j++) {
//            System.out.print("*");
//        }
//        System.out.println();
//    }
//}

    //Check if a number is palindrome
//public static void main(String[] args) {
//    int n=5454;
//    int temp=n;
//    int rev =0;
//    while (n>0){
//        int digit = n%10;
//        rev = rev *10+digit;
//        n=n/10;
//    }
//    if (temp == rev){
//        System.out.println("Palindrome");
//    } else {
//        System.out.println("Not Pal");
//    }
//}
    //Find factorial of n ex. 4! = 4x3x2x1=24
//public static void main(String[] args) {
//    int n =5;
//    double fact = 1;
//    for (int i = 1; i <=n  ; i++) {
//        fact *= i;
//    }
//    System.out.println(fact);
//}

//Count digits in a number
//public static void main(String[] args) {
//    int[] arr = {1,2,4,5,5,45,12544,5};
//    int count = 0;
//    for (int i = 0; i < arr.length; i++) {
//        int temp = arr[i];
//        arr[i] = arr[count];
//        arr[count] = temp;
//        count++;
//    }
//    System.out.println(count);
//}

    //Print multiplication table of a number"
//public static void main(String[] args) {
//    int n=13;
//    for (int i = 1; i <=10 ; i++) {
//        int mul = i*n;
//        System.out.println(mul);
//
//    }
//}

//Find the largest element
//public static void main(String[] args) {
//    int[] arr = {2,4,5,77,54,32};
//    int largest = arr[0];
//    for (int i = 0; i < arr.length; i++) {
//        if (arr[i]> largest){
//            largest = arr[i];
//        }
//    }
//    System.out.println(largest);
//
//}

    //5. Search for an element (Linear Search)
//public static void main(String[] args) {
//    int[] arr = {2,4,65,7,5,2};
//    int target = 5;
//    int result = search(arr,target);
//    if (result == -1){
//        System.out.println("Nothing");
//    } else {
//        System.out.println("FOUND IN INDEX "+result);
//    }
//}
//static int search(int[] arr, int target){
//    for (int i = 0; i < arr.length; i++) {
//        if (arr[i]==target){
//            return i;
//        }
//    }
//    return -1;
//}
//    MinMaxArrays
//public static void main(String[] args) {
//    int[] arr ={1,3,4,6,7,8};
//    int min = arr[0];
//    int max = arr[0];
//    for (int i = 0; i < arr.length; i++) {
//        if (arr[i]>max){
//            max = arr[i];
//        } if (arr[i]<min){
//            min = arr[i];
//        }
//    }
//    System.out.println("Max: "+max);
//    System.out.println("Min: "+min);
//}

    //7. AverageOfArrays
//public static void main(String[] args) {
//    int[] arr ={1,3,4,6,6};
//    int sum = 0;
//    int avg = 0;
//    for (int i = 0; i < arr.length; i++) {
//        sum += arr[i];
//         avg = sum/2;
//    }
//    System.out.println(avg);
//}
    //ArraysInReverseOrder
//public static void main(String[] args) {
//    int[] arr ={ 1,2,4,5,6};
//    for (int i = arr.length-1; i >= 0; i--) {
//        System.out.println(arr[i]+ " ");
//    }
//}

}


