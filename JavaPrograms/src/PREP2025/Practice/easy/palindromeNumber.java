package PREP2025.Practice.easy;

public class palindromeNumber {
    public static void main(String[] args) {
        int n=5454;
        int temp=n;
        int rev =0;
        while (n>0){
            int digit = n%10;
            rev = rev *10+digit;
            n=n/10;
        }
        if (temp == rev){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Pal");
        }
    }
}
