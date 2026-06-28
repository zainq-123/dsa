package Heaps.FrequentElements.Optimized;
import java.util.*;

public class FrequentElements_Optimized {
    static int []FrequentElements_Optimized(int nums[],int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // (a, b) -> map.get(a) - map.get(b) ka matlab hai jis ki frequency kam hogi wo top par rahega
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                (a, b) -> map.get(a) - map.get(b)
        );

        // 3. Unique elements ko heap mein daalna aur size strictly 'k' rakhna
        for (int num : map.keySet()) {
            minHeap.add(num);

            // Agar heap ka size k se bada ho jaye, to sab se kam frequency wala element nikal (poll) dein
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // 4. Jitna 'k' bola hai, utna size ka array banao aur heap ke elements daal do
        int[] a = new int[k];
        // Reverse loop is liye chalaya taake zyada frequency wala element pehle index par aaye
        for (int i = k - 1; i >= 0; i--) {
            a[i] = minHeap.poll();
        }

        return a;
    }
    public static void main(String[] args) {
        int nums[]={1,1,1,2,2,3};
        System.out.println(Arrays.toString(FrequentElements_Optimized(nums,2)));
    }
}
