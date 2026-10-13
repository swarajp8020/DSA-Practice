package Week2Practice;
//"Find the minimum and maximum
//Problem: Find the smallest and largest number in an array.
//Example:
//Input: arr = [12, 7, 19, 3, 15]
//Output: min = 3, max = 19
//🧠 Hint: Start with min = arr[0], max = arr[0].
//Update when a smaller or larger value is found."
public class p3 {
    public static void main(String[] args) {
    int[] arr = {12, 7, 19, 3, 15};
    int min = arr[0];
    int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            } else if (arr[i]< min) {
                min = arr[i];
            }
        }
        System.out.println("MAX "+max);
        System.out.println("MIN "+min);

    }
}
