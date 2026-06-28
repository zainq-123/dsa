package TwoPointers.Container.Brute;

public class ContainerBrute {
    public static int ContainerBrute(int[] height) {
        int maxWater = 0;
        int n = height.length;

        for (int i = 0; i < n; i++) {
            // Doosra loop doosri line (right wall) select karne ke liye
            for (int j = i + 1; j < n; j++) {
                // Do lines mein se jo choti line hogi, paani wahan tak hi bharega
                int minHeight = Math.min(height[i], height[j]);

                // Dono lines ke beech ka distance (width)
                int width = j - i;
                int currentWater = minHeight * width;

                // Agar yeh area purane maxWater se zyada hai toh update kardaina hai
                maxWater = Math.max(maxWater, currentWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int  height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(ContainerBrute(height));
    }
}
