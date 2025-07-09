package Array.leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueOrDuplicateArray {

    public static void main(String[] args) {

        int[] array = {2, 7, 5, 15};

        System.out.println(isUnique(array));
        System.out.println(isUniqueUsingSet(array));
    }
    // Using brute force method
    private static boolean isUnique(int[] array) {
        for( int i = 0; i < array.length; i++) {
            for(int j = i+1; j<array.length; j++) {
                if(array[i] == array[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    //Using Set
    private static boolean isUniqueUsingSet(int [] array) {
        Set<Integer> set = new HashSet<>();

        for(int arr: array) {
            if(!set.add(arr)) {
                return false;
            }
        }
        return true;
    }
}
