package array;

public class MaxElement {
    // Basic solution to find max Element
       // first sort the element
          // Merge sort

    // Brute force Technique
    public void mergeSort(int []arr, int lower, int upper){
        // base case
           if(lower >= upper){
               return;
           }
           // finding mid
           int mid = (lower + upper) / 2;
           // recursion call
           mergeSort(arr, lower, mid);
           mergeSort(arr,mid+1, upper);
           // merging
           merging(arr, lower, mid, upper);
    }
    public void merging(int[] arr, int low, int mid, int high){
        int[] newArray = new int[high - low + 1];
        int index = 0;
        int left = low;
        int right = mid + 1;
        // Value fill in the new Array
        while((left <= mid) && (right <= high)){
               if(arr[left] <= arr[right]){
                   newArray[index] = arr[left];
                   left ++;
                   index ++;
               }
               else{
                   newArray[index] = arr[right];
                   right ++;
                   index ++;
               }
        }

        // what if any one side value complete
        while (left <= mid){
            newArray[index] = arr[left];
            left ++;
            index ++;
        }
        while(right <= high){
            newArray[index] = right;
            right ++;
        }
        // coping newArray to original Array
        for (int i = 0; i < newArray.length; i++) {
            arr[low + i] = newArray[i];
        }
    }

    //Optimal Solution

    // optimal
    public int optimalMax(int [] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {8,2,9,5,6,3,1};
        MaxElement maxElement = new MaxElement();
        maxElement.mergeSort(arr,0, arr.length-1);
        System.out.println("Max Element : " + maxElement.optimalMax(arr));
        System.out.print("Array Before Sorted : ");
        for(int element: arr){
            System.out.printf("%d,",element);
        }

        // because legth = 9 and last index is 8
        System.out.print("Sorted After Sorted : ");
        for(int elements : arr){
            System.out.printf("%d,",elements);
        }
        System.out.println();
        int maxValue = arr[arr.length -1];
        System.out.println("Max value : " + maxValue);

    }

}
