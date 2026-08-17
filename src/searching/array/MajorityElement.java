package searching.array;

public class MajorityElement {
    public static void majorityElement(int [] arr){
        int count = 0, candidate = 0, size = arr.length;
        for (int num: arr) {
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count ++;
            }else{
                count --;
            }
        }
        count = 0;
        for(int num : arr){
            if(num == candidate){
                count ++;
            }
        }
        if(count > size / 2 ){
            System.out.print("There " + "is " + candidate + " in majority");
            return;
        }
        System.out.println("There is no element in majority");
    }

    public static void main(String[] args) {
        int [] array = {2,2,1,1,1,2,2};
        MajorityElement.majorityElement(array);
    }
}
