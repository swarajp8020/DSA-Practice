package PREP2025.string;

public class isPalindrome {
    static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        isPalindrome i = new isPalindrome();
        System.out.println(i.isPalindrome(s));
    }
    public boolean isPalindrome(String s){
        StringBuilder clean = new StringBuilder();
        for (char c: s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                clean.append(Character.toLowerCase(c));
            }
        }
        int left = 0, right = clean.length()-1;
        while (left < right) {
            if (clean.charAt(left)!=clean.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }



    /// Simpler
//    boolean isPalindrome(String s){
//        int left = 0;
//        int right = s.length()-1;
//        while (left < right) {
//            if (s.charAt(left)!=s.charAt(right)){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
}
