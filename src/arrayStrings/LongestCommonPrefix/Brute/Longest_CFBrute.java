package arrayStrings.LongestCommonPrefix.Brute;

public class Longest_CFBrute {
    static String Longest_CFBrute(String str[]) {
        if (str == null || str.length <1) {
            return "";
        }

        String firstWord = str[0];

        for (int i = 0; i < firstWord.length(); i++) {
            char ch = firstWord.charAt(i);
            for (int j = 1; j < str.length; j++) {
                if (i == str[j].length() || str[j].charAt(i) != ch) {
                    return firstWord.substring(0, i);
                }
            }
        }
        return firstWord;
    }
    public static void main(String[] args) {
        String[] words1 = {"flaower", "flow", "flight"};
        System.out.println("Common Prefix 1: " + Longest_CFBrute(words1));
    }
}
