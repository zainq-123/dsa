package HashTable.Max_Baloons.Brute;

public class Max_BalloonsBrute {
    static int Max_BalloonsBrute(String txt){
        char[] chars = txt.toCharArray();
        String balloon = "balloon";
        int balloonCount = 0;

        // Yeh loop tab tak chalega jab tak humein naye balloons milte rahenge
        while (true) {
            int lettersMatched = 0;

            // "balloon" ke ek-ek letter (b, a, l, l, o, o, n) ko pakdo
            for (int i = 0; i < balloon.length(); i++) {
                char target = balloon.charAt(i);

                // Ab poore text array mein is target letter ko dhoondo
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] == target) {
                        chars[j] = '.'; // Letter mil gaya, toh use mita do
                        lettersMatched++; // lettersMatched count badhao ki ek letter mil gaya
                        break; // Andar wale loop se bahar nikal kar next target dhoondo
                    }
                }
            }
             //iska matlab hoga ka agar sara characters match hogaye hai
            if (lettersMatched == 7) {
                balloonCount++;
            } else {
                // Agar 7 se kam letters mile, matlab ab mazeed balloon nahi ban sakta
                break;
            }
        }

        return balloonCount;

    }

    public static void main(String[] args) {
        String x="nlaebollko";
        System.out.println(Max_BalloonsBrute(x));
    }
}
