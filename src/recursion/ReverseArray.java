package recursion;

public class ReverseArray {
    void arrayReverse(int arr[], int i, int n){
        if(i >= n){
            return;
        }
        swap(arr, i,n);
        arrayReverse(arr,i+1, n-1);
    }
    void swap ( int [] arr, int i, int n){
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
    }

    void reverseArray(int [] arr, int i){
        if(i >= arr.length / 2 ){
            return;
        }

        int opposite = arr.length - i - 1;;
          int temp = arr[i];
          arr[i] = arr[opposite];
          arr[opposite] = temp;
        reverseArray(arr, i + 1);
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 1, 4};
        System.out.println("Original Array");
        for (int originalArray : arr ){
            System.out.print(originalArray);
        }
        System.out.println();
        int i = 0;
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.arrayReverse(arr,i, arr.length - 1);
        System.out.println("Reversed Array");
         for( int reverse : arr){
             System.out.print(reverse);
        }
        System.out.println();
         // one pointer reverse
        System.out.println("One pointer reverse");
        reverseArray.reverseArray(arr,i);
        for(int reverse: arr){
            System.out.print(reverse);
        }
        System.out.println();
        System.out.println("EVM HACK...");
        System.out.println("Voting Rigged");


    }
}
