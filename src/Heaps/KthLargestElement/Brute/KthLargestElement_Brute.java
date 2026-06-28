package Heaps.KthLargestElement.Brute;

import java.util.Arrays;

public class KthLargestElement_Brute {
    static int LargestElement_Brute(int arr[], int k){
        Arrays.sort(arr);

        // 2. n - k index wala element return kar do
        int n = arr.length;
        return arr[n - k];
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(LargestElement_Brute(nums,2));
    }
}
