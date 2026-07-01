package recursion;

public class Recursion {

    // Print name 5 times

    // Logic :
      /*
      Recursion mein ek method khud ko call karta hai yani self calling aur us method mein
      ek condition honi chahiye jab wah method call na ho

      hum jab count ki value 5 hogi tab method se bahar aayenge elsiye
       hum har call pe ek count ki value increase kar dete hai
       */


    public void printName(String name, int count){

        if(count == 5){
            return;
        }
        System.out.println(name);
        printName(name, count + 1);

    }
    // print number linearly from 1 to N
        // LOGIC
    /*
    hume starting se ending tak print karna tha
    to humne condition lagai ki jab start aur end same ho jaye method terminate ho


    hum har recursively method call mein start ki value ek increase
    karke call karte the aur usko print karte the jab dono ki value same ho gai to print kar diya
     */
    public void printNumber (int start, int n){
        System.out.println(start);
        if((start == n) || (start > n)){
            return;
        }
      printNumber(start + 1, n);
    }

    // print number
      // N to 1
    public void printNumberN(int n, int end){
        System.out.println(n);
        if(n == end){
            return;
        }
        printNumberN(n = n-1, 1);
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println("First Solution");
        recursion.printName("Yugank", 0);
        System.out.println("Second Solution");
        recursion.printNumber(1, 1);
        System.out.println("Third solution");
        recursion.printNumberN(40, 1);
    }
}
