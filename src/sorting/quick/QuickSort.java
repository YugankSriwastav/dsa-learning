package sorting.quick;

public class QuickSort {
    public void quickSort(int[] arr, int lowerLimit, int upperLimit){
        // Base Case
        if(upperLimit <= lowerLimit){
            return;
        }
      int pivotIndex = lowerLimit;
      int larger = 0;
      int smaller = 0;
      // finding the right position of pivot
        for (int i = lowerLimit + 1; i < upperLimit; i++) {
            if(arr[pivotIndex] < arr[i]){
                larger ++;
            } else if (arr[pivotIndex] > arr[i]) {
                smaller ++;
            }
        }
        int correctIndex = lowerLimit + smaller;
        System.out.println("larger : " + larger + " Smaller : " + smaller);
        System.out.println("Right position will be at index " + smaller );
        swapping(arr,pivotIndex, correctIndex);
        pivotIndex = correctIndex;
        // right position achieve

        System.out.println("Pivot Index " + pivotIndex);

        int firstPointer = lowerLimit;
        int secondPointer = pivotIndex + 1;
        while((firstPointer < pivotIndex) && (secondPointer <= upperLimit)) {
            // first condition if firstPointer value is grater than pivot
            if (arr[firstPointer] > arr[pivotIndex]) {
                if (arr[pivotIndex] < arr[secondPointer]) {
                    secondPointer++;
                } else if (arr[pivotIndex] > arr[secondPointer]) {
                    swapping(arr, firstPointer, secondPointer);
                    firstPointer ++;
                    secondPointer = pivotIndex + 1;
                }
            }
            //second condition if firstPointer value is less than pivot
            else{
                firstPointer ++;
            }
        }

        quickSort(arr, lowerLimit, pivotIndex -1);
        quickSort(arr, pivotIndex + 1, upperLimit);

    }
    public void swapping(int [] arr, int pivot, int correctPosition){
        int temp = arr[correctPosition];
        arr[correctPosition] = arr[pivot];
        arr[pivot] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {5,6,2,4,7,9,1,3};
        int lowerLimit = 0;
        int upperLimit = arr.length - 1;
        System.out.println("BEFORE SORTING");
        for (int num: arr){
            System.out.printf("%d,",num);
        }
        System.out.println();
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, lowerLimit, upperLimit);
        System.out.println("AFTER SORTING");
        for(int num : arr){
            System.out.print(num + ",");
        }
    }
}
