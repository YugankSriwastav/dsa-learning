package sorting.insertion;

public class InsertionSort {
    public void insertionSort(int []arr, int size){
        // outer loop
        for (int i = 1; i < size; i++) {
            int current = arr[i];
            int prev = i - 1;
            while(prev >= 0 && arr[prev] > current){
                arr[prev + 1] = arr[prev];
                prev --;
            }
        }
    }
}
