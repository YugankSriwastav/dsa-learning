public class Revision {
    // Recursion
     // problem reverse Array
    public void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

   // find fibonachi 0 to n

    int value = 0;
    public static long fibonacci(int n){
        if(n <= 1){
            return n;
        }

        long last = fibonacci(n - 1);
        long secondLast = fibonacci(n -2);
        return last + secondLast;

    }

    public static void main(String[] args) {
        System.out.println(Revision.fibonacci(4));
    }
}
