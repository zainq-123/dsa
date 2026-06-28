package arrayStrings.Closest_ToZero.Brute;

import java.util.Arrays;
import java.util.OptionalInt;

public class Closest_toZeroBrute {

    static OptionalInt Closest_toZero(int arr[]) {
        int y[] = new int[arr.length];    //x kai elements jitni array banayga takai Array sort krsakai
        for (int i = 0; i < arr.length; i++) {
            y[i] = Math.abs(arr[i]);     //har x ka element ki absolute value nikalaga even wo positive ya negative ho
        }
        OptionalInt a = Arrays.stream(y).min(); //minimum value ko return krdaygai
        return a;
    }

    public static void main(String[] args) {
        int x[] = {-3, 1, 5, -2, 6, 4};
        OptionalInt result = Closest_toZero(x);
        System.out.println(result.getAsInt());

    }
}