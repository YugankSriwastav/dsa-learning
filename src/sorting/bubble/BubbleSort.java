package sorting.bubble;

public class BubbleSort {
    public void swapping(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
    public void bubbleSort(int[] arr, int size){
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if(arr[j+1] > arr[j]){
                    swapping(arr, j, j + 1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {13,20,7,6,25};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr, arr.length);
        for(int array: arr){
            System.out.print(array + ",");
        }
    }

}
