package arrayStrings.isSequence.Optimal;

public class isSequence_Optimal {
    static boolean isSequence_Optimal(String s, String t) {
        int i = 0; //ith index s string ko represent kar rahi ha
        int j = 0; //jth index t jo ka lenghty string ha usko represent kar rahu

        while (i< s.length() && j< t.length()) {
                if (s.charAt(i) == t.charAt(j)) {
                    i++;
                    j++;   /*ith index ko j ka sab index sa compare kar rahe hai, aur agar ith index ki value
                    jth index ki value sa match hogi tabhi short string s agay iterate kraygi warna ith ka current
                    index ko j ka next indexes sa compare kartai rhayga jab tak dono same nai hotai*/
                } else {
                    j++;
                }
            }
        if(i==s.length()){
            return true;
        }
        return false;
    }
        public static void main (String[]args){
            System.out.println(isSequence_Optimal("abx","achbdx"));
        }
    }

