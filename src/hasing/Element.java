package hasing;

public class Element {
    int countViaHashing(int number, int[]arr){
        int count = 0;
        int[] hasing = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] % 10;
            hasing[index] = arr[i];
        }

        // checking number is present or not
        int index = number % 10;
        if(hasing[index] == number){
            count ++;
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {5,8,1,3,7,3};
        Element element = new Element();
        System.out.println(element.countViaHashing(4,arr));
    }
}
