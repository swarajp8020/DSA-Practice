package PREP2025.Practice.Week8Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagram {
    static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    static List<List<String>> groupAnagrams(String[] strs){
        Map<String , List<String>> map = new HashMap<>();
        for (String s:strs){
            int[] freq = new int[26];
            for (char c: s.toCharArray()){
                freq[c - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            for (int count:freq){
                key.append('#').append(count);
            }
            map.computeIfAbsent(key.toString(), k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
