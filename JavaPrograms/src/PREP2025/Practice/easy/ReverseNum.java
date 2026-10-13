package PREP2025.Practice.easy;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 1234;
        int rev = 0;
        while(num>0){
            int sum = num %10;
            rev = rev*10 +sum;
            num = num/10;
        }
        System.out.println(rev);
    }
}
