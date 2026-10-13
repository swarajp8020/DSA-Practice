package PREP2025.stack;

import java.util.Arrays;
import java.util.Stack;

// LC 739 dailyTemperatures - https://leetcode.com/problems/daily-temperatures/description/
 /// ✅ Problem idea (ELI5)
 /// You have temperatures each day.
 /// For each day, you want:
 /// “After how many days will I get a warmer day?”
 /// If no warmer day → 0.
 /// 5️⃣ The correct mental model
 /// We store INDEXES in PREP2025.stack (not temperatures), because we need distance:
 /// answer[i] = index_of_warmer_day - i
 /// Stack contains indexes of days whose answer is still unknown.
 /// 6️⃣ Step-by-step logic
 /// Loop i from 0 to n-1
 /// When current temperature is higher:
 /// It means:
 /// “I found a warmer day for previous colder days”
 /// So:
 /// while PREP2025.stack not empty AND temp[i] > temp[PREP2025.stack.peek()]
 /// pop prevIndex
 /// ans[prevIndex] = i - prevIndex
 /// Finally:
 /// push i into PREP2025.stack
 /// 7️⃣ Dry run (small example)
 /// Temps: [73, 74, 75, 71, 69, 72, 76, 73]
 /// Day0 73 → push(0)
 /// Day1 74 > 73 → pop0 ans[0]=1 → push1
 /// Day2 75 > 74 → pop1 ans[1]=1 → push2
 /// Day3 71 → push3
 /// Day4 69 → push4
 /// Day5 72 > 69 pop4 ans[4]=1
 /// 72 > 71 pop3 ans[3]=2
 /// push5
 /// Day6 76 > 72 pop5 ans[5]=1
 /// 76 > 75 pop2 ans[2]=4
 /// push6
 /// Day7 73 → push7
 /// Leftover indices get 0 by default.
 /// 8️⃣ Common mistakes (catch early)
 /// ❌ Storing temperature values instead of index
 /// ❌ Using >= instead of > (depends on question definition)
 /// ❌ Forgetting to fill leftover with 0 (default is 0 anyway)
public class dailyTemprature {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indexes
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                ans[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return ans;
    }
    static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));
        // Expected: [1, 1, 4, 2, 1, 1, 0, 0]
    }
}
