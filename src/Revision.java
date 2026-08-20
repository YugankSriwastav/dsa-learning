public class Revision {
    // Recursion
     // problem reverse Array
    public void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(int [] arr, int i, int j){
        if(i > j ){
            return;
        }
        swap(arr,i,j);
        reverse(arr, i + 1, j - 1);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Revision revision = new Revision();
        revision.reverse(arr,0, arr.length - 1);
        for(int num : arr ){
            System.out.print(num);
        }
    }
}
