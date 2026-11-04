package hasing;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicate {
    // Note : Array is unsorted

    public boolean checkDuplicate(int [] array){
        Set<Integer> values = new HashSet<>();
        for (int i = 0; i < array.length ; i++) {
            if(values.contains(array[i])){
                return true;
            }
            else{
                values.add(array[i]);
            }

        }
        return false;
    }

}
