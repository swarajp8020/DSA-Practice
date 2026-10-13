package PREP2025.HashMap;

import java.util.HashMap;

public class BasicHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"swaraj");
        map.put(2,"ravindra");
        map.put(3,"purarkar");
        map.put(1,"sahil"); // updates existing
        System.out.println(map.get(1)); //sahil
        System.out.println(map.containsKey(4)); //false
        System.out.println(map.size()); // 3
    }
}
///put → stores
/// get → fetches
/// contains → checks
/// size → counts