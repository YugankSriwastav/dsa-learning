package dynamicprogramming;

import java.util.Arrays;

public class Fibonacci {

    public static long fibonacci(long [] array, int x){
      if(x <= 1){
          return x;
      }
      if(array[x] != -1){
          return array[x];
      }
      // what if array doesn't contain the value of x
        array[x] = fibonacci(array,x - 1) + fibonacci(array, x-2);
        return array[x];
    }

    // Better Solution(Remove Recursion stack)
    public long fibonacciBetter(long x, long[]array){
        array[0] = 0;
        array[1] = 1;
        int n = array.length;
        long value = 0;
        for (int i = 2; i < n; i++) {

            value = array[i - 1] + array[i-2];
        }
        return value;
    }

    public static void main(String[] args) {

        int x = 4;
        long [] array = new long[x + 1];
        Arrays.fill(array, -1);
        System.out.println(fibonacci(array,x));
        System.out.println("Better Approach");
        System.out.println(fibonacci(array,x));

    }
}
