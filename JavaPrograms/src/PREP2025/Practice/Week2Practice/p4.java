package Week2Practice;
//"First and last occurrence
//Problem: Find the first and last index of a given number.
//Example:
//Input: arr = [5, 7, 7, 8, 8, 10], target = 8
//Output: first = 3, last = 4
//🧠 Hint:
//Keep two variables: first = -1, last = -1.
//First match → set first.
//Keep updating last each time."
public class p4 {
    public static void main(String[] args) {
    int[] arr = {5, 7, 7, 8, 8, 10};
    int target =8;
        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        if (first == -1){
            System.out.println("Not found");
        } else {
            System.out.println("Found first "+ first+ " Last "+last);
        }
    }
}
