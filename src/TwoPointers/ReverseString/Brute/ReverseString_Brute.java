package TwoPointers.ReverseString.Brute;

public class ReverseString_Brute {
    static String ReverseString_Brute(String str){
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);  //empty string s mai str ka last character sa entry aygi aur uska start tak characters add hota jayga
        }
        return s;
    }
    public static void main(String[] args) {
            String a="heyzam";
        System.out.println(ReverseString_Brute(a));
    }
}
