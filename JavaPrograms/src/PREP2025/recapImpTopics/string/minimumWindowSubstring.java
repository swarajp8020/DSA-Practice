package PREP2025.recapImpTopics.string;
/// Explaination:
///❓ count = t.length()
/// ELI5:
/// “I still need all characters from t.”
/// Each time I see a required character:
/// count--
/// When count == 0:
/// 👉 I have everything.
/// ❓ if (freq[c] > 0) count--;
/// ELI5:
/// “This character was actually needed.”
/// If freq[c] <= 0, it means:
/// either extra character
/// or already satisfied
/// So we don’t reduce count.
/// ❓ Why do we do freq[c]-- even if not needed?
/// Because:
/// It tracks extra characters
/// Helps when shrinking
/// Negative values = surplus
/// ❓ Why this shrinking logic works
/// freq[lc]++;
/// if (freq[lc] > 0) count++;
/// ELI5:
/// “I just removed something important.
/// Now the window is invalid again.”
/// So we stop shrinking.
/// WHY THIS VERSION IS SMARTER THAN MAP-BASED ONE
/// No hashmap overhead
/// Constant space
/// Cleaner logic
/// Interviewers love this variant
/// You just need to remember what freq means.
/// QUICK DEPTH CHECK (DON’T SKIP)
/// Answer these out loud:
/// Why do we build freq from t and not s?
/// What does a negative value in freq mean?
/// Why do we decrement freq even when char isn’t needed?
/// If you can answer these calmly → LC-76 is locked.
/// 🧠 ONE-LINER INTERVIEW EXPLANATION (MEMORIZE)
/// “I track how many characters are still needed using a frequency array and a counter.
/// I expand the window until all characters are satisfied.
/// Then I shrink from the left to minimize the window.
/// The moment removing a character breaks a requirement, I stop shrinking.
/// Since both pointers move linearly, the solution runs in O(n) time.”

public class minimumWindowSubstring {
    static class sol {
        public String minWindow(String s, String t){
            if (s.length()<t.length()) return "";
            int[] need = new int[128];
            for (char c: t.toCharArray()){
                need[c]++;
            }
            int left = 0, count = t.length(), minLen = Integer.MAX_VALUE, start = 0;
            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);
                if (need[c]>0)count--;
                need[c]--;
                while (count == 0) {
                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1;
                        start = left;
                    }
                    char lc = s.charAt(left);
                    need[lc]++;
                    if (need[lc]>0) count++;
                    left++;
                }
            }
            return minLen == Integer.MAX_VALUE ? "":s.substring(start, start + minLen);
        }
    }
    static void main(String[] args) {
        String s = "ssadafa";
        String t = "sad";
        sol ss = new sol();
        System.out.println(ss.minWindow(s,t));
    }
}
