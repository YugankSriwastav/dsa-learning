package dynamicprogramming.subsequences;

public class SubsetEqualK {
    /*
    Problem : 1,2,3,4 target = 4 check array of subsequences is available in array or not
    variable = target, index

    // if index is queal to target return true

    1 not
    1 + 2 not
    1 + 3 true (if not)
    1+ 4 not
    1 + 2 + 3 not
    1 + 2 + 4 not
    1 + 3 + 4 not
    1 + 4  not
    .........
    .........
    ........

     */

    public boolean recursion(int[] array, int index, int target) {

        if (target == 0) {
            return true;
        }

        if (index == array.length) {
            return false;
        }

        boolean skip = recursion(array, index + 1, target);

        boolean take = false;

        if (array[index] <= target) {
            take = recursion(
                    array,
                    index + 1,
                    target - array[index]
            );
        }

        return skip || take;
    }

    public static void main(String[] args) {
        int [] array = {8,9,7,3,5};
        SubsetEqualK subsetEqualK = new SubsetEqualK();
        subsetEqualK.recursion(array,0,10);
    }

}
