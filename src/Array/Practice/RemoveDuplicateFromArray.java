package Array.Practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

    public static void main(String args[]) {

        int[] array = {1,2,3,4,5, 5, 2, 10,3};

        removeDuplicateUsingSet(array);

    }

    private static int[] removeDuplicateUsingSet(int[] array) {
        Set<Integer> set = new LinkedHashSet<Integer>();

        for (int i: array) {
            set.add(i);
        }

        int[] result = new int[set.size()];
        int count = 0;
        for(int i: set) {
            result[count++] = i;
        }
        System.out.println("Print result array: " + Arrays.toString(result) );
        return result;
    }
}
