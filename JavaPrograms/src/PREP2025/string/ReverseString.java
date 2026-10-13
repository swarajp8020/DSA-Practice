package PREP2025.string;

public class ReverseString {
    //array logic
    static void main() {
        String s = "hello";
        StringBuilder sb = new StringBuilder(s);
        int left = 0, right = sb.length()-1;
        while (left<right){
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        System.out.println(sb.toString());
    }
}
