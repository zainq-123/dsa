package TwoPointers.Container.Optimized;

import java.util.*;

public class ContainerOptimized {
    // Function ka naam class se match karta hua rakh diya hai
    public static int containerOptimized(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;

        // Jab tak left aur right pointers aapas mein cross nahi karte
        while (left < right) {
            // Dono pointers mein se jo choti line hai uski height choose karni ha
            int minHeight = Math.min(height[left], height[right]);

            int width = right - left;

            // Current area calculate kiya
            int currentWater = minHeight * width;

            // Max water ko update kiya agar naya area purane se bada hai
            maxWater = Math.max(maxWater, currentWater);

            // Jo wall choti hai, us pointer ko move karenge taake shayad aage koi lambi wall mil sake
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(containerOptimized(height));
    }
}