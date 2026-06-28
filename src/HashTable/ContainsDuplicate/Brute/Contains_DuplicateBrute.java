package HashTable.ContainsDuplicate.Brute;

import java.util.Arrays;
import java.util.HashMap;

public class Contains_DuplicateBrute {

    static boolean Contains_Duplicate(int arr[]){
        Arrays.sort(arr); //[1,2,3,3]//
        boolean found=false;
        for(int i=0;i< arr.length-1;i++){
            if (arr[i]==arr[i+1]) {   //agar adjoint array ka elements apas ma equal hogai to duplicate found hojaiga
                found=true;
                break;
            }
        }
        if(found){return true;}
return false;
    }
    public static void main(String[] args) {
        int x[]={2,1,3,3};
        System.out.println(Contains_Duplicate(x));

    }
}
