
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumofTwo_usingSet {

       int[] addtwosum (int[] ar, int Target){
        Set<Integer> pn = new HashSet<>();

        for (int num : ar ) {
            int potentialnum = Target - num;
            if(pn.contains(potentialnum)){
                return new int[]{potentialnum,num};
            }else{
                pn.add(num);
            }

        }
      return new int[0];
    }

    public static void main(String[] args) {
       SumofTwo_usingSet so = new SumofTwo_usingSet();
       int[] sample = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
       int target = 10;

       System.out.print(Arrays.toString(so.addtwosum(sample,target)));



    }



}
