package HashTable.TwoSum.Optimal;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum_Optimal {
    static int[] Two_SumOptimal(int arr[], int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            int requiredElement = target - currentElement;

            if (hash.containsKey(requiredElement)) {
                return new int[] { hash.get(requiredElement), i };
            }

            // 2. Agar nahi hai, toh current ke element ko uske index ke sath map mein yaad rakh lai
            hash.put(currentElement, i);
        }

        // Agar purai array ma sa koi bi matching pair na milai to..
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int x[] = {12, 5, 7, 9, 10, 8};
        int target = 20;

        int[] result = Two_SumOptimal(x, target);
        System.out.println(Arrays.toString(result));
    }
}