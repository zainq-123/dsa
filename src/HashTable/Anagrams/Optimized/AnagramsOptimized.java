package HashTable.Anagrams.Optimized;

import java.util.*;

public class AnagramsOptimized {
     static ArrayList<List<String>> AnagramsOptimized(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        // Poore array ke ek-ek word par loop chalayein
        for (String s : strs) {
            // 1. Word ko char array mein badlein aur sort karein
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray); // Yeh hamari unique key ban gayi

            // 2. Agar ye key map mein pehle nahi aayi, toh nayi list banao
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }

            // 3. Original word ko us sorted key ki list mein daal do
            map.get(sortedKey).add(s);
        }

        // Map ki saari values (lists) ko ek badi list mein daal kar return kar do
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat","mat"};
        System.out.println(AnagramsOptimized(strs));
    }
}
