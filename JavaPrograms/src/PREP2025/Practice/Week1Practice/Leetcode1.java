
//Given an integer x, return true if x is a palindrome, and false otherwise.
//
//
//
//Example 1:
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//Example 2:
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Example 3:
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//
//
//Constraints:
//
//-231 <= x <= 231 - 1
//
//
//Follow up: Could you solve it without converting the integer to a PREP2025.string?
package Week1Practice;
class Solution {
    public boolean isPalindrome(int x) {
        int temp =x;
        int rev = 0;
        while(x>0){
            int sum = x%10;
            rev = rev*10+sum;
            x = x/10;
        } if(temp == rev){
            System.out.println("true");
            // break;
            return true;

        }

        System.out.println("false");
        return false;
    }
}
public class Leetcode1 {
    public static void main(String[] args) {
        int x = 121;
        Solution solution = new Solution();
        solution.isPalindrome(x);
    }
}