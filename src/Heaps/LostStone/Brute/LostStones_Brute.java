package Heaps.LostStone.Brute;

import java.util.Arrays;

public class LostStones_Brute {
    public static int LostStones_Brute(int[] stones) {
        int n = stones.length;

        for (int i = 0; i < n - 1; i++) {
            // 1. Har step par array ko sort karo taake bade stones aakhri mein chale jayein
            Arrays.sort(stones);

            // 2. Sab se bade do stones uthao (jo aakhri do positions par hain)
            int stone1 = stones[n - 1]; // Sab se bhaari
            int stone2 = stones[n - 2]; // Doosra sab se bhaari

            // Agar doosra sab se bhaari stone zero hai, iska matlab ab mazeed stones nahi bache
            if (stone2 == 0) {
                break;
            }

            if (stone1 == stone2) {
                stones[n - 1] = 0;
                stones[n - 2] = 0;
            } else {
                stones[n - 1] = stone1 - stone2; // Difference bache huay stone ka weight banega
                stones[n - 2] = 0;
            }
        }

        Arrays.sort(stones);
        return stones[n - 1];
    }
    public static void main(String[] args) {
        int[] x = {2, 7, 4, 1, 8, 1};
        System.out.println(LostStones_Brute(x));
    }
}
