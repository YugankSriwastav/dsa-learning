package sorting.array.searching;

public class Intersection {

    public int [] intersectionArray(int [] firstArray, int [] secondArray) {
        int size = Math.max(firstArray.length, secondArray.length);
        int[] intersection = new int[size];


        return intersection;
    }
    public static void main(String[] args) {
        int[] firstArray = {1,2,2,3,4,4,5};
        int[] secondArray = {3,4,4,5,5,6,7};
        Intersection intersection = new Intersection();
       int []finalArray =  intersection.intersectionArray(firstArray,secondArray);
       for(int element : finalArray){
           System.out.printf("%d,",element);
       }
    }

}
