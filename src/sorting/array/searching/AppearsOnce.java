package sorting.array.searching;

public class AppearsOnce {
    // Problem find the element which is appearing ones in sorting.array

    // 1st Approach Brute Force

    // TC : O(n^2)
    // Sc : O(n)

    public int appearsOnce(int [] arr, int size){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if(i == j){
                    continue;
                }
                if(arr[i] == arr[j]){
                    flag = arr[i];
                    break;
                }

            }
            if(flag == 0){
                result = arr[i];
            }
        }
        return result;
    }

    // Optimal XOR

    public int appearsOnes(int[] arr){
        int xor1 = 0;
        for (int i = 0; i < arr.length; i++) {
            xor1 = xor1 ^ arr[i];
        }
        return xor1;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,4,5,5};
        AppearsOnce appearsOnce = new AppearsOnce();
        System.out.println(appearsOnce.appearsOnce(arr, arr.length));
        System.out.println(appearsOnce.appearsOnes(arr));
    }

}
