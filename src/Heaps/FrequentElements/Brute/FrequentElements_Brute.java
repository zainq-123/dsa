package Heaps.FrequentElements.Brute;

import java.util.*;

public class FrequentElements_Brute {
    static int [] FrequencyElements(int nums[], int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer,Integer>> list =new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b) -> b.getValue() - a.getValue());



        int[] a = new int[k];

        for(int i = 0; i < k; i++)
        {
            a[i] = list.get(i).getKey();
        }

        return a;
    }
    public static void main(String[] args) {
           int nums[]={1,1,1,2,2,3};
        System.out.println(Arrays.toString(FrequencyElements(nums,2)));
           
    }
}
