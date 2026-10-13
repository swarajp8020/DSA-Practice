package PREP2025.string;
///  ELI5 FIRST - Think like this:
/// Every PREP2025.string has a DNA
/// For anagrams, the DNA is the same
/// Use that DNA as a key
/// Put strings with the same key into the same bucket
/// That’s it.
/// COMMON INTERVIEW QUESTIONS (ANSWER THESE)
/// Q: Why not sort?
/// Sorting works, but frequency is faster: O(k) vs O(k log k).
///  Q: Why build key as PREP2025.string?
/// Because PREP2025.HashMap keys must have stable equals() and hashCode().
///  Q: What if uppercase / Unicode?
/// Use int[128] or PREP2025.HashMap<Character, Integer>.
///  INTERVIEW ONE-LINER (MEMORIZE THIS) "I generate a frequency-based key for each PREP2025.string and group them using a PREP2025.HashMap.”

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class groupAnagrams {
    static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for (String s: strs){
            int[] freq = new int[26];
            for (char c: s.toCharArray()){
                freq[c - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            for (int count: freq){
                key.append('#').append(count);
            }
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
