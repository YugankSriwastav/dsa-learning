package array;

public class RemoveDuplicates {
    // As we know, we can't delete the elements of array
     // so we can assign

    public int removeDuplicates(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]){
                arr[i + 1] = arr[j];
                i ++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,4,5};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(arr));
        for(int element : arr){
            System.out.print(element);
        }
    }
}
