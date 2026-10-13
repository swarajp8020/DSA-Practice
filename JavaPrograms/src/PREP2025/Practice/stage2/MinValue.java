package PREP2025.Practice.stage2;

public class MinValue {
    public static void main(String[] args) {
        int[] arr = {18, 65, 55, -9, 45, 8};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}

