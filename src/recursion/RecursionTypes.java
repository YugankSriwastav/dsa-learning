package recursion;

public class RecursionTypes {
    // parameterized Recursion

    public void sum(int n, int sum){
       if(n == 0){
           System.out.println(sum);
           return;
       }
       sum(n-1, sum += n );
    }
    public int sum(int n){
         if(n == 0){
             return 0;
         }
        return n + sum(n-1);
    }
    // factorial

    public int factorial(int num ){
        if(num == 1){
            return 1;
        }
        return num * factorial(num -1);
    }
   public void factorial(int num, int sum){
        if(num == 1){
            System.out.println("Result: " + sum);
            return;
        }
        factorial(num -1, sum *= num);
   }

    public static void main(String[] args) {
        System.out.println("First Solution");
        RecursionTypes recursionTypes = new RecursionTypes();
        System.out.println("By Parameterize");
        System.out.println("Sum");
        recursionTypes.sum(5, 0);
        System.out.println("Factorial");
        recursionTypes.factorial(4,1);
        System.out.println("Sum by Functional Recursion");
        System.out.println(recursionTypes.sum(3));
        System.out.println("Factorial");
        System.out.println(recursionTypes.factorial(4));
    }

}
