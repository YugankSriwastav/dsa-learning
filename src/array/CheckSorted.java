package array;

public class CheckSorted {

//    public void swap(int [] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    // 1st Approach
//    /*
//       sort the given array and then compare it original array to sorted array
//     */
//
//    // sorting array using selection sort
//    public void sorted(int[] arr, int size){
//
//     // to find the smallest value of array
//        int[] copiedArray = new int[size];
//        int index = 0;
//
//       // coping original to second array
//        for (int i = 0; i < arr.length; i++) {
//            copiedArray[index] = arr[i];
//            index ++;
//        }
//
//        // now we are sorting copied array
//        for (int i = 0; i < copiedArray.length - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < size; j++) {
//                if(copiedArray[minIndex] > copiedArray[j]){
//                    minIndex = j;
//                }
//            }
//            // now we know which index have the smallest value
//            swap(copiedArray,i,minIndex);
//        }
//
//        // printing sorted array
//        System.out.println("Sorted array");
//        for (int value : copiedArray){
//            System.out.println(value);
//        }
//
//        // Copied Array is sorted now we can compare it to the original array
//        // if both have the same element then we can say array is sorted
//
//    }
    // 2nd approach of check array is sorted or not

    public boolean checkSorted(int [] array, int size){
        boolean ascending = true;
        boolean descending = true;
        for (int i = 0; i < size - 1; i++) {

            // Ascending Order
            if(array[i] > array[i + 1]){
                ascending = false;
            }

            if(array[i] < array[i + 1]){
                descending = false;
            }

        }
        return ascending || descending;
    }


    public static void main(String[] args) {
        int [] arr = {-10,-20,-30,-40};
        int size = arr.length;
        CheckSorted checkSorted = new CheckSorted();
//        checkSorted.sorted(arr,size);
        System.out.println("result is " + checkSorted.checkSorted(arr, size));

    }
}
