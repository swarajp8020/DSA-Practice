package PREP2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/// The problem
/// Given an array of strings, group the anagrams together. The order of the groups doesn't matter.
/// Example:
/// Input:  ["eat", "tea", "tan", "ate", "nat", "bat"]
/// Output: [["eat", "tea", "ate"],
///          ["tan", "nat"],
///          ["bat"]]
public class groupAnagram {
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word:strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);

        }
        return new ArrayList<>(map.values());
    }

    static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagram gA = new groupAnagram();
        System.out.println(gA.groupAnagrams(strs));

    }

}
