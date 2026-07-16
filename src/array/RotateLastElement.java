package array;

public class RotateLastElement {
    // Rotate left Array by one place

    /*
    {1,2,3,4,5}  = {23451}
     */

    //
    public void rotateLeft(int [] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++){
            arr[i -1] = arr[i];

        }
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        RotateLastElement rotateLastElement = new RotateLastElement();
        rotateLastElement.rotateLeft(arr);
        for(int element : arr){
            System.out.print(element);
        }
    }

}
