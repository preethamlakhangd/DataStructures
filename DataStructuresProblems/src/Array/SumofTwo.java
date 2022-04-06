package Array;

import java.util.Arrays;

public class SumofTwo {


    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.

        for (int i=0;i < array.length - 1; i++){
            int firstnum = array[i];
            for(int j= i+1; j < array.length; j++){
                int secondnum = array[j];
                if(firstnum + secondnum == targetSum){
                    return new int[]{firstnum,secondnum};
                }

            }


        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] ar= new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int [] newar = SumofTwo.twoNumberSum(ar,10);
        System.out.print(Arrays.toString(newar));
    }



}




