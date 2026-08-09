package sorting.array;

public class ZeroOneTwoSorting {
    // Brute Force
    /*
    sort the array using any array algorithm
     */
    // Better Approach
    public void sorting(int [] arr, int size){
        int countZero = 0, countOne = 0, countTwo = 0;
        // in the first step count the zero one and two
        for (int i = 0; i < size; i++) {
            if(arr[i] == 0){
                countZero ++;
            }
            if (arr[i] == 1) {
                countOne ++;
            }
            if(arr[i] == 2){
                countTwo ++;
            }
        }
        int index = 0;
        if(countZero != 0){
            for (int i = 0; i < countZero; i++) {
                arr[index] = 0;
                index ++;
            }
        }
        if(countOne != 0){
            for (int i = 0; i < countOne; i++) {
                arr[index] = 1;
                index ++;
            }
        }
        if(countTwo != 0){
            for (int i = 0; i < countTwo; i++) {
                arr[index] = 2;
                index ++;
            }
        }
    }

    // 3rd Approach Optimal using : Dutch National Flag Algorithm

    public void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    public void dutchOptimal(int[] arr, int size){
        int low = 0, mid = 0, high = size;
        while(mid >= high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                low ++;
                mid ++;
            } else if (arr[mid] == 1) {
                mid ++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high --;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {0,1,2,0,0,1,1,2,2,0};
        ZeroOneTwoSorting zeroOneTwoSorting = new ZeroOneTwoSorting();
//        zeroOneTwoSorting.sorting(arr, arr.length);
        zeroOneTwoSorting.sorting(arr, arr.length);
        System.out.println("Dutch Algorithm");
        for(int num : arr){
            System.out.print(num);
        }
    }
}
