package TwoPointers.Palindrome.Brute;

public class PalindromeBrute {
    static boolean PalindromeBrute(String s){
        if (s.length() == 1) {
            return true;
        }

        // Do variables (i shuru se, j aakhir se) aur ek hi loop
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char startChar = s.charAt(i);
            char endChar = s.charAt(j);

            // 1. Agar shoroh wala character letter ya number nahi hai, toh i ko aage barhana hai aur skip karna ha
            if (!Character.isLetterOrDigit(startChar)) {
                i++;
            }
            else if (!Character.isLetterOrDigit(endChar)) {
                j--;
            }
            else {
                if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                    return false;
                }
                i++;
                j--;
            }
        }

        return true; // Agar loop bina kisi mismatch ke khatam ho gaya
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(PalindromeBrute(s));
    }
}
