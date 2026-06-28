package HashTable.TwoSum.Brute;

import java.util.Arrays;

public class TwoSum_Brute {
    static int [] Two_SumBrute(int arr[],int target){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target) {  //O(N) square time complexity sa aik hum har aik index ka element ko sab array ka baki element sa compare krayga aur agar dono target match karayga to return true kardaygai
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
          int x[]={3,1,2,1,7};
        System.out.println(Arrays.toString(Two_SumBrute(x,10)));
    }
}
