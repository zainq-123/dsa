package arrayStrings.LongestCommonPrefix.Optimized;

import java.util.Arrays;

public class Longest_CFOptimized {
    static String Longest_CfOptimized(String strs[]){
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        while (i < first.length() && i < last.length()) {
            if (first.charAt(i) == last.charAt(i)) {  /*first string array ka character ko last sorted string ka characters sa compare krayga
                aur agar dono equal hogai to agay iterate krayga aur agar condition false hui to pehle jitna bi
                equal characters find out hochukai hai unko substring sa return kardaygai*/
                i++;
            } else {
                break;
            }
        }


        return first.substring(0, i);
    }
    public static void main(String[] args) {
        String[] words1 = {"flaower", "flow", "flight"};
        System.out.println("Common Prefix 1: " + Longest_CfOptimized(words1));
    }
}
