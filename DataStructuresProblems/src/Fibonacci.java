import java.util.*;

public class Fibonacci {
    public  int getNthFib(int n) {
        // Write your code here.
        int[] ar = new int[]{0, 1};
        int counter = 3;
        while (counter <= n) {
            int nextFib = ar[0] + ar[1];
            ar[0] = ar[1];
            ar[1] = nextFib;
            counter++;
        }

        return n > 1 ? ar[1] : ar[0];

    }

    public static void main(String[] args) {
         Fibonacci fib = new Fibonacci();

         System.out.print(fib.getNthFib(5));
    }
}



