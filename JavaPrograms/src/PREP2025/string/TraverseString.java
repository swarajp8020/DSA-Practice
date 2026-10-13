package PREP2025.string;

public class TraverseString {
    static void main() {
        String s = "abcde";
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Index"+i+"->"+s.charAt(i));
        }
    }
}
