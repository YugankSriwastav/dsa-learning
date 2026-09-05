package dynamicprogramming;

public class Revision {
    public int solve(int [] arr, int first, int last){
        if(first > last){
            return 0;
        }

        return arr[first] + solve(arr, first + 2, last);
    }
    public int horseRobber2nd(int [] arr){
        System.out.println("0 to n -2");
        int value = solve(arr, 0, arr.length - 2);
        System.out.println("1 to n - 1");
        int secondValue = solve(arr, 1, arr.length - 1);
        return Math.max(value, secondValue);
    }

    public static void main(String[] args) {
        int [] arr = {1,3,2,4,3,6};
        Revision revision = new Revision();
        System.out.println("Result");
        System.out.println(revision.horseRobber2nd(arr));
    }
}
