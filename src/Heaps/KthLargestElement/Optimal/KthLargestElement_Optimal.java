package Heaps.KthLargestElement.Optimal;

import java.util.PriorityQueue;

public class KthLargestElement_Optimal {
    public static int LargestElement_Optimal(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num); // Element ko heap mein insert karein

            // Agar heap ka size K se bada ho jaye, to sab se chota element nikal daygai
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Loop ke baad, heap ke top par K-th largest element hoga
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(LargestElement_Optimal(nums,2));
    }
}
