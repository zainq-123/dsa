package TwoPointers.Palindrome.Optimized;

public class PalindromeOptimized {
    public static boolean PalindromeOptimized(String s) {
        int left = 0;
        int right = s.length() - 1;

        // Loop tab tak chalega jab tak pointers beech mein nahi milte
        while (left < right) {

            // 1. Agar left pointer par alphabet/number nahi hai, toh use skip karke aage badhao
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // 2. Agar right pointer par alphabet/number nahi hai, toh use skip karke peeche lao
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // 3. Ab jab dono pointers valid characters par hain, unhe lowercase karke compare karo
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // 4. Agar match ho gaya, toh dono pointers ko agay-peeche badhao
            left++;
            right--;
        }

        return true; // Agar poora string check ho gaya aur koi masla nahi aaya to return kardaygai
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(PalindromeOptimized(s));
    }
}