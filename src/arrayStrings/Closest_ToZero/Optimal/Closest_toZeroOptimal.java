package arrayStrings.Closest_ToZero.Optimal;

import java.util.Arrays;
import java.util.OptionalInt;

public class Closest_toZeroOptimal {

    static OptionalInt Closest_toZero(int arr[]) {
        int y[] = new int[arr.length];

        // Loop chalakar har element ka absolute (positive) distance nikal kar y[] mein daala
        for (int i = 0; i < arr.length; i++) {
            y[i] = Math.abs(arr[i]);
        }

        // Loop ke BAHAR stream ka use karke minimum distance nikala aur return kiya
        OptionalInt a = Arrays.stream(y).min();
        return a;
    }

    public static void main(String[] args) {
        int x[] = {-3, 1, 5, -2, 6, 4};

        OptionalInt result = Closest_toZero(x);
        if (result.isPresent()) {
            System.out.println("Closest distance to zero is: " + result.getAsInt());
        }
    }
}