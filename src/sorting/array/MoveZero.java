package array;

public class MoveZero {
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Move Zero to the end
    public void moveZero(int[] arr,int start, int last){
       while(start < last){
           if(arr[start] == 0){
               if(arr[last] == 0){
                   last --;
               }
               swap(arr, start, last);
               last --;
           }

           start ++;
       }
    }

    // 2nd way
    void moveZer0(int[] arr){
        int position = arr.length - 1;
        for (int i = 0; i < arr.length ; i++) {
            int temp;
              if(arr[i] == 0){
                  temp = arr[i];
                  // one forward
                  int var = i;
                  for (int j = i + 1; j < arr.length; j++) {
                      arr[var] = arr[j];
                      var ++;
                  }
                  arr[position] = temp;
                  position --;

              }
        }
    }
    void optimalSwap(int[] arr){
        int j = - 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0){
                swap(arr,i , j);
                 j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 5, 0, 6, 7};
        int last = arr.length - 1;
        MoveZero moveZero = new MoveZero();
//        moveZero.moveZero(arr, 0, last);
//        moveZero.moveZer0(arr);
        moveZero.optimalSwap(arr);
        System.out.println("Array After Move Zero");
        for (int j : arr) {
            System.out.printf("%d,", j);

        }
    }
}
