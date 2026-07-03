package sorting;

public class SelectionSort {

    public void swapping (int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
//    public void sorting(int [] arr, int n){
//       for(int i = 0; i < n - 1; i ++){
//           int minIndex = i;
//           for (int j = i + 1; j < n ; j++) {
//               if(arr[j] < arr[minIndex]){
//                   swapping(arr, minIndex, j);
//               }
//           }
//       }
//    }

    public void sorting(int[] arr, int n){
        for (int i = 0; i < n-2; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }

            }
            swapping(arr,i,minIndex);
        }

    }


    public static void main(String[] args) {
        int [] arr = {13,46,24,52,20,9};
        int size = arr.length;
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sorting(arr, size);
        for(int sorted : arr){
            System.out.print(sorted + ",");
        }
    }
}