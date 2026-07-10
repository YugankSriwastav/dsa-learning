package sorting.merge;

public class MergeSort {

    public void mergeSort(int [] arr, int low, int high){
           if(low >= high){
               return;
           }
           int mid = (low + high)/2;
           mergeSort(arr,low, mid);
           mergeSort(arr, mid+1, high);

           // Merging
          merging(arr,low,mid,high);
    }

    public void merging(int[] arr, int low, int mid, int high){
        int[] newArray = new int[high - low + 1];
          int left = low;
          int right = mid + 1;
          int index = 0;
         while(left <= mid && right <= high){
             if(arr[left] <= arr[right]){
                 newArray[index]= arr[left];
                 left ++;
             }
             else{
                 newArray[index] = arr[right];
                 right ++;
             }
             index ++;
         }
         while(left <= mid){
             newArray[index]= arr[left];
             left ++;
             index ++;
         }
         while(right <= high){
             newArray[index] = arr[right];
             right ++;
             index ++;
         }

         // copying new Array to old array

        for (int i = 0; i < newArray.length ; i++) {
            arr[low + i] = newArray[i];
        }
    }

    public static void main(String[] args) {
        int [] arr = new int[]{3,1,2,4,1,5,2,6,4};
        System.out.println("Array Before Sorted: ");
        for(int element: arr){
            System.out.printf("%d,",element);
        }
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr,0, arr.length  - 1);
        // because legth = 9 and last index is 8
        System.out.println("Sorted Array");
        for(int elements : arr){
            System.out.printf("%d,",elements);
        }
    }
}
