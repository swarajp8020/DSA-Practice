//3. Find the minimum and maximum using Linear Search
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
//🧠 Hint: Initialize min and max with arr[0] and update while looping.

package PREP2025.Practice.WeekdayPractice;

public class linearSearchMinMax {
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

}
