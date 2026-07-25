package array.searching;

public class UnionArray {
    // union of two sorted array
    /*
    arr 1 : 1,2,2,3,4,5,5
    arr 2 : 1,2,2,2,3,4,4,5,5,6
    union array : 1,2,3,4,5,6
     */
    // Brute force :

      /*
      Approach 1st :
      Step 1: make a union array
      Step 2: enter only that which is longer than the previous value in union array
      step 3: when entered all vale just compared two array 2 if first second array have same value don't add it

       */


    public int [] unionArray(int[]firstArray, int[] secondArray){
        int size = firstArray.length + secondArray.length;
        int[] unionArray = new int[size];
        int index = 0;

        // Brute force Approach



        for (int i = 0; i < firstArray.length - 1; i++) {
            if(firstArray[i] < firstArray[i+1]){
                unionArray[index] = firstArray[i];
                index++;
            }
        }

        for (int j : secondArray) {
            boolean found = false;

            for (int k : unionArray) {
                if (j == k) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unionArray[index] = j;
                index++;
            }

        }

        // Brute force complete

//        // 2nd Approach better (use binary search instead of liner because array is sorted)
//
//
//
//        // 3rd optimal
//        // Two Pointer Approach
//
        int first = 0;
        int second = 0;


        while((first < firstArray.length) && (second < secondArray.length)){

            if(firstArray[first] == secondArray[second]){

                //check unionArray is empty if it's not then

                if(index != 0){
                    if(firstArray[first] != unionArray[index - 1]){
                        unionArray[index] = firstArray[first];
                    }
                } else{
                    unionArray[index] = firstArray[first];
                }

                index ++;
                first ++;
                second ++;
            } else if (firstArray[first] < secondArray[second] ) {

                if(index != 0){
                    if(firstArray[first] != unionArray[index - 1]){
                        unionArray[index] = firstArray[first];
                    }
                }
                else{
                    unionArray[index] = firstArray[first];

                }
                index ++;
                first ++;
            }
            else{

                if(index != 0){
                   if(secondArray[second] != unionArray[index - 1]){
                       unionArray[index] = secondArray[second];
                   }
                   else{
                       unionArray[index] = secondArray[second];
                   }
                }
                unionArray[index] = secondArray[second];
                second ++;
                index ++;
            }



        }

       // if one side array is complete then

        //check which side array is completed

        if(first != firstArray.length){
            while(first < firstArray.length){
                if(firstArray[first] != unionArray[index]){
                    unionArray[index] = firstArray[first];
                }
                first ++;
                index ++;
            }
        }
        else{
            while (second < secondArray.length){
                if(secondArray[second] != unionArray[index - 1]){
                    unionArray[index] = secondArray[second];
                }
                second ++;
                index ++;
            }
        }

        return unionArray;
    }




    public static void main(String[] args) {
        int [] firstArray = {1,3,5};
        int [] secondArray = {2,4,6};
        UnionArray unionArray = new UnionArray();
        int [] finalArray = unionArray.unionArray(firstArray, secondArray);
        for(int element : finalArray){
            System.out.print(element);
        }
    }
}
