package array;

import java.util.Arrays;

public class LeftRotate {
    // Left Rotate by Dth place

//    public void rotateElement(int [] arr, int d){
//        int [] array = new int[d];
//        int index = 0;
//        for (int i = 0; i < d; i++) {
//            array[i] = arr[index];
//            index ++;
//        }
//
//        // 2nd step to move forward original array element
//
//        for (int i = d; i < arr.length; i++) {
//            array[i - d] = arr[i];
//
//
//        }
//
//        // 3rd step is to put temp array element into old array
//        int j = 0;
//        int size = arr.length;
//        for(int i = size - d; i < size; i ++){
//            arr[i] = array[j];
//            j++;
//        }
//    }
    public void rotate(int[] arr, int left, int right){
       // rotating by two pointer approach
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left ++;
            right --;
        }


    }

    public void reverseArray(int [] arr, int size, int d){

        rotate(arr,0, d-1);
        rotate(arr, d, size-1);
        rotate(arr, 0, size - 1);

    }

    public static void main(String[] args) {
        int [] array = {8,7,6,5,4,3,2,1};
        LeftRotate leftRotate = new LeftRotate();
        leftRotate.reverseArray(array, array.length, 4);
//        leftRotate.rotateElement(array,3);
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//        }
        System.out.println("After Reversing");
        for(int elements: array){
            System.out.print(elements);
        }
    }
}
