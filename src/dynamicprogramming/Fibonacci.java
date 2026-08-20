package dynamicprogramming;

import java.util.Arrays;

public class Fibonacci {

    public static long fibonacci(long [] array, int x){
      if(x <= 1){
          return x;
      }
      // agar valuew already malum hai to memo se le lo
      if(array[x] != -1){
          return array[x];
      }
      array[x] = fibonacci(array,x -1) + fibonacci(array, x - 2);
      return array[x];
    }

    public static void main(String[] args) {
        int x = 4;
        long [] memo = new long[x + 1];
        Arrays.fill(memo, -1);
        System.out.println(fibonacci(memo, x));

    }
}
