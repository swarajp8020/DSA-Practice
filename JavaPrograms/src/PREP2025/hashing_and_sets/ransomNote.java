package PREP2025.hashing_and_sets;

// LC 383 Ransom Note https://leetcode.com/problems/ransom-note/description/
/// ELI5
/// You have letters in a magazine.
/// You want to build a ransom note.
/// If magazine doesn’t have enough letters → false.
/// Pattern
/// Count letters in magazine.
/// Subtract letters for ransom note.
/// If any count becomes negative → false.
/// One interview line
/// “I count available letters in magazine, then consume for ransom note. If any frequency drops below zero, it means shortage.”

public class ransomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) return false;
        }
        return true;
    }
    static void main(String[] args) {
        String ransom = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransom, magazine));
    }
}
