package PREP2025.string;

public class hasDuplicate {
    static void main(String[] args) {
        String s = "swaraj";
        hasDuplicate h = new hasDuplicate();
        System.out.println(h.hasDuplicates(s));
    }
    boolean hasDuplicates(String s){
        int[] freq = new int[26];
        for (char c: s.toCharArray()){
            if (freq[c-'a']>0) return true;
            freq[c-'a']++;
        }
        return false;
    }
}
