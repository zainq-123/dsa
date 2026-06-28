package HashTable.Max_Baloons.Optimized;

public class Max_BallonsOptimized {
    static int Max_BalloonOptimzied(String txt){
        int[] counts = new int[26];

        // 1. Ek hi loop mein saare characters count kar liye
        for (int i = 0; i < txt.length(); i++) {
            counts[txt.charAt(i) - 'a']++;
        }

        // 2. "balloon" ke har character ki individual availability nikaali
        int b = counts['b' - 'a'];
        int a = counts['a' - 'a'];
        int l = counts['l' - 'a'] / 2; // 2 'l' chahiye, isliye /2
        int o = counts['o' - 'a'] / 2; // 2 'o' chahiye, isliye /2
        int n = counts['n' - 'a'];

        // 3. Sabse choti (minimum) value dhoondni hai
        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
    public static void main(String[] args) {
        String x="nlaebollko";
        System.out.println(Max_BalloonOptimzied(x));
    }
}
