package PREP2025.Practice.Week20Practice;
/// Minimum Window Substring
import java.util.HashMap;
import java.util.Map;

public class March16Morning {
    public static String minWindow(String sourceString, String targetString) {
        if (sourceString.length() < targetString.length()) {
            return "";
        }
        Map<Character, Integer> targetFrequencyMap = new HashMap<>();
        for (char character : targetString.toCharArray()) {
            targetFrequencyMap.put(
                    character,
                    targetFrequencyMap.getOrDefault(character, 0) + 1
            );
        }
        Map<Character, Integer> windowFrequencyMap = new HashMap<>();
        int have = 0;
        int need = targetFrequencyMap.size();
        int leftPointer = 0;
        int minimumWindowLength = Integer.MAX_VALUE;
        int resultStartIndex = 0;
        for (int rightPointer = 0; rightPointer < sourceString.length(); rightPointer++) {
            char currentCharacter = sourceString.charAt(rightPointer);
            windowFrequencyMap.put(
                    currentCharacter,
                    windowFrequencyMap.getOrDefault(currentCharacter, 0) + 1
            );
            if (targetFrequencyMap.containsKey(currentCharacter) &&
                    windowFrequencyMap.get(currentCharacter).intValue() ==
                            targetFrequencyMap.get(currentCharacter).intValue()) {
                have++;
            }
            while (have == need) {
                int currentWindowLength = rightPointer - leftPointer + 1;
                if (currentWindowLength < minimumWindowLength) {
                    minimumWindowLength = currentWindowLength;
                    resultStartIndex = leftPointer;
                }
                char leftCharacter = sourceString.charAt(leftPointer);
                windowFrequencyMap.put(
                        leftCharacter,
                        windowFrequencyMap.get(leftCharacter) - 1
                );
                if (targetFrequencyMap.containsKey(leftCharacter) &&
                        windowFrequencyMap.get(leftCharacter) <
                                targetFrequencyMap.get(leftCharacter)) {
                    have--;
                }
                leftPointer++;
            }
        }
        if (minimumWindowLength == Integer.MAX_VALUE) {
            return "";
        }
        return sourceString.substring(
                resultStartIndex,
                resultStartIndex + minimumWindowLength
        );
    }
    static void main(String[] args) {
        String sourceString = "ADOBECODEBANC";
        String targetString = "ABC";
        String result = minWindow(sourceString, targetString);
        System.out.println("Minimum Window: " + result);
    }
}
