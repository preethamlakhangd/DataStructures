package Array;

import java.util.Arrays;

public class SumofTwo_usingSorting {

    public  int[] twoNumberSum(int[] ar, int targetSum) {
        //
       Arrays.sort(ar);
       int left =0;
       int right = ar.length -1 ;
       while(left<right){
           if(ar[left]+ar[right]== targetSum){
               return new int[]{ar[left],ar[right]};
           }else if (ar[left]+ar[right] < targetSum){
               left++;
           }else{
               right--;
           }
       }

        return new int[0];
    }

    public static void main(String[] args) {
        SumofTwo_usingSorting sumofTwo = new SumofTwo_usingSorting();
        int [] ar = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int target = 10;

        System.out.print(Arrays.toString(sumofTwo.twoNumberSum(ar,target) ));
    }
}
