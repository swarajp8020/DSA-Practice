package PREP2025.binarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinarySearchTimeBasedKeyValueStore {
    public static void main(String[] args) {
        TimeMap tm = new TimeMap();

        tm.set("foo", "bar", 1);
        System.out.println(tm.get("foo", 1));  // bar
        System.out.println(tm.get("foo", 3));  // bar

        tm.set("foo", "bar2", 4);
        System.out.println(tm.get("foo", 4));  // bar2
        System.out.println(tm.get("foo", 5));  // bar2
    }
}

class TimeMap {

    HashMap<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";

        List<Pair> list = map.get(key);
        int low = 0, high = list.size() - 1;
        String result = "";

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (list.get(mid).time <= timestamp) {
                result = list.get(mid).value;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    static class Pair {
        int time;
        String value;

        Pair(int t, String v) {
            time = t;
            value = v;
        }
    }
}
