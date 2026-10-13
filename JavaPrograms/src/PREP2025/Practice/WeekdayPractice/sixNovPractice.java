package PREP2025.Practice.WeekdayPractice;




public class sixNovPractice {
    //1️⃣ Find if an element exists
//
//Problem:
//Given an array of integers, find whether a number exists in it.
//Return the index if found, else return -1.
//
//Example:
//
//Input: arr = [4, 8, 15, 16, 23, 42], target = 23
//Output: 4
//
//
//🧠 Hint: return index when found, else return -1.
//
//    public static void main(String[] args) {
//        int [] arr = {4, 8, 15, 16, 23, 42};
//        int target = 23;
//        int result = search(arr, target);
//        if (target == -1){
//            System.out.println("Not Found");
//        } else {
//            System.out.println("Found "+result);
//        }
//    }
//    static int search(int[] arr, int target){
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==target){
//                return i;
//            }
//        }
//        return -1;
//    }
    //2️⃣ Count occurrences of a number
//
//Problem:
//Given an array, count how many times a target appears.
//
//Example:
//
//Input: arr = [2, 3, 5, 3, 7, 3, 9], target = 3
//Output: 3
//
//
//🧠 Hint: use a counter and don’t return early — finish looping through all.
//    public static void main(String[] args) {
//        int[] arr= {2, 3, 5, 3, 7, 3, 9,3};
//        int target = 3;
//        int result = countOccurence(arr, target);
//        if (result == 0){
//            System.out.println("no");
//        } else {
//            System.out.println(result);
//        }
//    }
//    static int countOccurence(int[] arr, int target){
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==target){
//                count++;
//            }
//        }
//        return count;
//    }

    //3️⃣ Find the minimum and maximum
//
//Problem:
//Find the smallest and largest number in an array.
//
//Example:
//
//Input: arr = [12, 7, 19, 3, 15]
//Output: min = 3, max = 19
//
//
//🧠 Hint: initialize both with arr[0], then update when smaller/bigger found.
//
    public static void main(String[] args) {
        int[] arr = {12, 7, 19, 3, 15};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            } else if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("MAX: "+max);
        System.out.println("MIN: "+min);
    }

    //4️⃣ First and last occurrence
//
//Problem:
//Find the first and last index of a target number.
//
//Example:
//
//Input: arr = [5, 7, 7, 8, 8, 10], target = 8
//Output: first = 3, last = 4
    //🧠 Hint: keep first = -1 and last = -1;
//first = first match, last = keep updating every match.
//
//    public static void main(String[] args) {
//        int[] arr = {5, 7, 7, 8, 8, 10};
//        int target = 8;
//        int first= -1;
//        int last = -1;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (target == arr[i]){
//                if (first==-1){
//                    first =i;
//                }
//                last = i;
//            }
//        }
//        if (first ==-1){
//            System.out.println("not found");
//        } else {
//            System.out.println("First " +first+" Last "+last);
//        }
//    }

}
