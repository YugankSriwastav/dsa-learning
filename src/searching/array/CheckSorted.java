package searching.array;

public class CheckSorted {

//    public void swap(int [] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    // 1st Approach
//    /*
//       sort the given sorting.array and then compare it original sorting.array to sorted sorting.array
//     */
//
//    // sorting sorting.array using selection sort
//    public void sorted(int[] arr, int size){
//
//     // to find the smallest value of sorting.array
//        int[] copiedArray = new int[size];
//        int index = 0;
//
//       // coping original to second sorting.array
//        for (int i = 0; i < arr.length; i++) {
//            copiedArray[index] = arr[i];
//            index ++;
//        }
//
//        // now we are sorting copied sorting.array
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
//        // printing sorted sorting.array
//        System.out.println("Sorted sorting.array");
//        for (int value : copiedArray){
//            System.out.println(value);
//        }
//
//        // Copied Array is sorted now we can compare it to the original sorting.array
//        // if both have the same element then we can say sorting.array is sorted
//
//    }
    // 2nd approach of check sorting.array is sorted or not

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

    public static String longestCommonPrefix(String[] arr) {

        String first = arr[0];

        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            for (int j = 1; j < arr.length; j++) {

                if (i >= arr[j].length() || arr[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }

    // REMOVE DUPLICATES FROM SORTED ARRAY

    public static int removeDuplicates(int[] arr) {

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2};
        int size = arr.length;
        CheckSorted checkSorted = new CheckSorted();
//        checkSorted.sorted(arr,size);
        System.out.println("result is " + checkSorted.checkSorted(arr, size));
        String [] strs = {"Flower","Flow","Flight"};
        System.out.println(CheckSorted.longestCommonPrefix(strs));
        System.out.println(CheckSorted.removeDuplicates(arr)
        );

    }
}
