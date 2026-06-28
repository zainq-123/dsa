package LinkedList.RemoveDuplicate.Brute;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate_Brute {
    static String remove_duplicate(int arr[]){
        HashSet<Integer> hash=new HashSet<>();

        for(int i:arr){
            hash.add(i);    //used hashSet because it only stores unique values and not duplicated!
        }
        int changed_array[]=new int[hash.size()];
        int index=0;
        for(int num:hash){
            changed_array[index++]=num;
        }
        return Arrays.toString(changed_array);
    }
    public static void main(String[] args) {
          int x[]={1,1,2,3,3};
        System.out.println(remove_duplicate(x));
    }
}
