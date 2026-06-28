package LinkedList.MergeSorted.Brute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSorted_Brute {
    public static List<Integer> MergeSorted_Brute(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        // Dono lists ko compare karte hue nayi list mein add karna
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        // Agar list1 mein kuch bacha ho
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        // Agar list2 mein kuch bacha ho
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6));

        List<Integer> mergedList = MergeSorted_Brute(list1, list2);

        System.out.println("Merged List (Brute Force): " + mergedList);
    }
}
