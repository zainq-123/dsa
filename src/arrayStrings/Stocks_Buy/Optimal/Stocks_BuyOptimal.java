package arrayStrings.Stocks_Buy.Optimal;

public class Stocks_BuyOptimal {
    static int Stocks_buyOptimal(int arr[]) {
        if (arr == null || arr.length < 2) {
            return 0;
        }

        int minPrice = arr[0];
        int maxProfit = 0; // Shuru mein profit 0 rakhenge

        for (int i = 1; i < arr.length; i++) {

            // 1. Agar humne ab tak ke sabse saste price (minPrice) par khareeda ho
            int potentialProfit = arr[i] - minPrice;

            // 2. Agar aaj ka profit ab tak ke sabse bade profit se zyada hai, toh update karein
            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
            }

            // 3. Kya aaj ka price ab tak ka sabse sasta price hai?
            // Agar haan, toh minPrice ko update kar dein taake aage ke dino ke liye naya buying price mile
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit (Optimal): " + Stocks_buyOptimal(prices)); // Output: 5

        int[] prices2 = {2, 10, 1, 5};
        System.out.println("Max Profit for Case 2: " + Stocks_buyOptimal(prices2));
    }
}