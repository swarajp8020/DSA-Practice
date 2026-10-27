package PREP2026;

import java.util.HashMap;

/// First Unique Character
/// Problem: Given a string s, return the index of the first character that appears only once. If no such character exists, return -1.
/// Examples:
/// Input	Output	Why
/// "leetcode"	0	l appears once
/// "loveleetcode"	2	v is the first unique character
/// "aabb"	-1	Every character repeats
public class firstUniqueCharacter {
    // to return index number
    static int firstUniqueChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch)==1) return i;
        }

        return -1;
    }

    // to return character
    static char firstUniqueChar1(String t){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch)==1) return ch;
        }
        return '\0';
    }

    static void main(String[] args) {
        String s = "aabbc";
        String t = "swiss";
        System.out.println(firstUniqueChar(s));
        int index = firstUniqueChar(s);
        if (index != -1) {
            System.out.println(s.charAt(index));
        }
        System.out.println(firstUniqueChar1(t));
    }
}
