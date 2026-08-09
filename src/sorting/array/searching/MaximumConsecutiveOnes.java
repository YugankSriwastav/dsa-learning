package sorting.array.searching;

public class MaximumConsecutiveOnes {
    public int maxConsecutiveOnes(int [] arr){
        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count += 1;
            }
            if(count > max){
                max = count;
            }
            if(arr[i] == 0){
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {0,0,0,-2,-3};
        MaximumConsecutiveOnes maximum = new MaximumConsecutiveOnes();
        int result = maximum.maxConsecutiveOnes(arr);
        if(result == 0){
            System.out.println("Array doesn't have Ones");
        }
        else{
            System.out.println("consecutive ones are : " + result);
        }
    }
}
