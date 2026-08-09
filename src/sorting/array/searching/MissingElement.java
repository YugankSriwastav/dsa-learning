package sorting.array.searching;

public class MissingElement {
    // work for only sorted Array
    public int missingElement(int [] arr, int size){
        int flag = 0;
        for (int i = 0; i < size; i++) {
            if((i + 1) != arr[i]){
                System.out.println(i);
                flag = i + 1;
                break;
            }
        }
        return flag;
    }
    public int missingElement(int [] arr){
        int answer = 0;
        for (int i = 1; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if(i == arr[j]){
                    flag = i;
                    break;
                }
            }

            if (flag == 0) {

                answer = i;
            }
        }
        return answer;
    }

    //Better approach

    public int hashingMissing(int []arr){
        int [] hashArray = new int[arr.length + 2];
        int missingElement = 0;
        for (int i = 0; i < arr.length; i++) {
            hashArray[arr[i]] = arr[i];
        }
        // Hashed sorting.array initialized successfully

        for (int i = 1; i < hashArray.length; i++) {
            if(i != hashArray[i]){
                missingElement = i;
                break;
            }
        }
        return missingElement;
    }

    //Optimal Approach

    public int optimalApproach(int[] arr){
        int elements = arr.length + 1;
        int currentSum = 0;
        int requiredSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += i;
        }
        // now we know what is current sum
        for (int i = 0; i < elements; i++) {
            requiredSum += i;
        }
        return requiredSum - currentSum;
    }

    // optimal but xor approach

    public int missingElementXor(int[] arr, int n) {

        int xor1 = 0;
        int xor2 = 0;

        for (int i = 1; i <= n; i++) {
            xor1 = xor1 ^ i;
        }

        for (int num : arr) {
            xor2 = xor2 ^ num;
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,2,4,6};
        MissingElement missingElement = new MissingElement();
//        System.out.println(missingElement.missingElement(arr));
        System.out.println(missingElement.hashingMissing(arr));
        System.out.println(missingElement.optimalApproach(arr));
        System.out.println(missingElement.missingElementXor(arr, arr.length));
    }
}
