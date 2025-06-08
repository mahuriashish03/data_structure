package Array.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

    public static void main(String args[]) {

        int[] array = {1,2,3,4,5, 5, 2, 10,3};

        removeDuplicateUsingSet(array);
        removeDuplicates(array);

    }

    //Using Set
    private static int[] removeDuplicateUsingSet(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();

        for(int i: array) {
            set.add(i);
        }

        int[] result = new int[set.size()];
        int count = 0;
        for (int num  : set) {
            result[count++] = num;
        }
        System.out.println("Print result array: " + Arrays.toString(result) );
        return result;
    }

    //Using brute force approach
    public static int[] removeDuplicates(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for(int i = 0; i<arr.length; i++) {
            boolean isDuplicate = false;
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                result[index++] = arr[i];
            }
        }
        System.out.println("Print result array: " + Arrays.toString(result) );
        return Arrays.copyOf(result, index);
    }
}
