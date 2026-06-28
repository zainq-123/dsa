package HashTable.Anagrams.Brute;

import java.util.*;

public class AnagramsBrute {
    static List<List<String>> AnagramsBrute(String txt[]){
        Map<String, List<String>> map = new HashMap<>();

        for (String word : txt) {
            // Word ko characters ke array mein convert kiya taake sort kiya ja sake
            char[] chars = word.toCharArray();

            // Characters ko alphabetically sort kiya (e.g., "tea" ban jayega "aet")
            Arrays.sort(chars);

            // Sorted characters se wapas ek naya string (key) banaya
            String key = new String(chars);

            // Map se is key ki purani list nikali, agar pehle se nahi hai toh nayi empty list banayi
            List<String> group = map.getOrDefault(key, new ArrayList<>());

            // Is list mein original word ko add kiya
            group.add(word);

            // Updated list ko wapas map mein daal diya
            map.put(key, group);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat","mat"};
        System.out.println(AnagramsBrute(strs));
    }
}
