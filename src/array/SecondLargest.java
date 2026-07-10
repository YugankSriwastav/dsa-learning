package array;

public class SecondLargest {
    // Brute Force Approach : sort the array and print the second element


    // Optimal Solution
    int secondLargest(int [] arr){
        /* My Approach :
        Step 1 : Find the biggest one
        Step 2 : now we are finding that value who are less than the biggest one but not less to others

         */
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }

        // now we have max value
        int secondHighest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < max){
                if(arr[i] > secondHighest){
                    secondHighest = arr[i];
                }
            }
        }

       return secondHighest;
    }

    public static void main(String[] args) {
        int [] arr = {6,2,9,5,7,3,1};
        SecondLargest secondLargest = new SecondLargest();
        System.out.println("second Largest" + secondLargest.secondLargest(arr));
    }
}
