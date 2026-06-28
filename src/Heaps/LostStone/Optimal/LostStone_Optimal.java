package Heaps.LostStone.Optimal;

import java.util.PriorityQueue;

public class LostStone_Optimal {
    public static int lastStoneWeight(int[] A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b - a);
        for (int a : A)
            pq.offer(a);
        while (pq.size() > 1)
            pq.offer(pq.poll() - pq.poll());
        return pq.poll();
    }
    public static void main(String[] args) {
        int[] x = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(x));
    }
}
