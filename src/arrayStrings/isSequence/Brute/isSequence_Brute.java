package arrayStrings.isSequence.Brute;

public class isSequence_Brute {
    static boolean Is_Sequence(String s, String t){
        int count=0; int s_count=0;
        if(s.length()<t.length()){
            for(int i=0;i<t.length();i++){
                if(s_count<s.length()&& s.charAt(s_count)==t.charAt(i)){
                 count++;
                 s_count++;
                }
            }
        }
        if(count==s.length()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Is_Sequence("abx","agdbx"));

        /*if String s characters are lesser then t String characters only then will the loop be executed
        and s_count variable keeps track of the the common matching characters b/w s and t String.
        And when the index matches, then that index of s will match with the indexes of t and when it
        will come true only then the s_count increases and when the s_count equals the total characters
        in the String s , only then it returns true otherwise false*/
    }
}
