package TwoPointers.ReverseString.Optimized;

import java.util.Arrays;

public class ReverseString_Optimized {
    static String ReverseString_Optimized(String str) {
        char[] ch = str.toCharArray();

        // Pointers mein character nahi, INDEX numbers rakhne hain
        int left = 0;
        int right = ch.length - 1;

        //  'loop use kia hai taake saare characters swap hon
        while (left < right) {
            //
            char temp = ch[left]; //temp variable left wala array ki value hold krayga aur right wala pointer sa replace kardayga
            ch[left] = ch[right];
            ch[right] = temp;

            // Pointers ko aage-peeche badhaya
            left++;
            right--; //tab tak chalayga jab tak left right ka equal ya usai aik step picha reh nai jata
        }

        return new String(ch);
    }

    public static void main(String[] args) {
        String a = "helllow";
        System.out.println(ReverseString_Optimized(a));
    }
}