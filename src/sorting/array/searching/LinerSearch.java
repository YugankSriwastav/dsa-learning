package array.searching;

public class LinerSearch {
    public int linearSearch(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return i;
            }
        }

        return - 1;
    }

    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2,4,5};
        LinerSearch linerSearch = new LinerSearch();
        int number = 12;
        int index = linerSearch.linearSearch(arr,number);
        if(index != -1){
            System.out.println("Element found at index : " + index);
        }
        else{
            System.out.println("Element not found in array");
        }
    }
}
