package cheatsheet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapCheatSheet {
    // Create hashMap from array for counting each element from array
    private static Map<Integer, Integer> createHashMap(int[] myArray) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < myArray.length; i++) {
            if (!hashMap.containsKey(myArray[i])) {
                hashMap.put(myArray[i], 1);
            } else {
                hashMap.put(myArray[i], hashMap.get(myArray[i]) + 1);
            }

        }
        return hashMap;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        {
            // for loop
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "/" + entry.getValue());
            }
            for (String key : map.keySet()) {
                System.out.println(key);
            }
            for (String value : map.values()) {
                System.out.println(value);
            }
        }
        // forEach
        {
            map.forEach((k, v) -> System.out.println((k + ":" + v)));
            map.entrySet().forEach(entry -> System.out.println(entry.getValue() + "/" + entry.getKey()));
            map.keySet().forEach(key -> System.out.println(key));
            map.values().forEach(value -> System.out.println(value));
        }

        // HashMap over Hashtable
        /**
         * Hashtable is legacy code. HashMap is newer. Everything that can be
         * done by Hashtable can also be done by HashMap. So user HashMap.
         * Hashtable is synchronized where HashMap is not.Hashtable does not
         * allow null where HashMap does.LinkedHashMap is subclass of HashMap
         * - use it when iteration order matters.
         * 
         */

        // To make Hashmap synchronized:
        {
            Map<String, String> synchronizedMap = Collections.synchronizedMap(map);
        }
    }
}
