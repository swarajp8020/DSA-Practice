package PREP2025.HashMap;

import java.util.HashMap;

public class FrequencyMap {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,2};
        HashMap<Integer, Integer> freq  =  new HashMap<>();
        for (int x: arr){
            freq.put(x,freq.getOrDefault(x,0)+1); //if value exists → add 1, if not exists → treat as 0 → then add 1
        }
        System.out.println(freq);
    }
}
