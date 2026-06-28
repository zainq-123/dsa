package arrayStrings.Stocks_Buy.Brute;

public class Stocks_BuyBrute {
    static int Stocks_buyBrute(int arr[]) {
        if (arr == null || arr.length < 2) {
            return 0;
        }

        int min_stock = arr[0];
        int min_index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min_stock) {
                min_stock = arr[i];
                min_index = i;
            }  //sab sa sasta day stock buy krna kalia hum
        }
        int max_stock = min_stock;

        for (int j = min_index + 1; j < arr.length; j++) {  //min stock wala index ka baad sa start karayga aur uska baad maximum element ko max_stock wala variable ma store kraygai

            if (arr[j] > max_stock) {
                max_stock = arr[j];
            }
        }
        return max_stock - min_stock; //min index ko max index ka element sa subtract krdaygai
    }

    public static void main(String[] args) {
        int[] prices = {9,7, 1, 5, 3, 6, 4,7};
        System.out.println("Max Profit: " + Stocks_buyBrute(prices)); // Output: 5
    }
}