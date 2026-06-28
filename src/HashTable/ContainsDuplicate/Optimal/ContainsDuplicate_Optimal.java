package HashTable.ContainsDuplicate.Optimal;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate_Optimal {
    static boolean Contains_DuplicateOptimal(int arr[]){
        HashSet<Integer> hash=new HashSet<>(); //hashset use hota unique values of a specific data type rakhna kalia
        for(int num:arr){
            if(!hash.add(num)){    //agar koi repeated value nai aygi to return true otherwise false
                return true;
            }
        }
            return false;

    }
    public static void main(String[] args) {
        int x[]={2,4,7,1,9};
        System.out.println(Contains_DuplicateOptimal(x));

    }
}
