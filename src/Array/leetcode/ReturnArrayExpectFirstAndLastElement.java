package Array.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReturnArrayExpectFirstAndLastElement {

    public static void main(String args[]) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] array2 = { 1, 2 };

        middle(array);
        middle(array2);

    }

    private static int[] middle(int[] array) {
        int[] middleArray = new int[array.length - 2];

        if(array.length <= 2) {
            System.out.println("Array size is too small: " + Arrays.toString(new int[0]));
            return new int[0];
        }

        //Java class method to copy array
        // System.arraycopy(array, 1, middleArray, 0, array.length - 2);
        for(int i = 1; i <= array.length-2; i++) {
            middleArray[i-1] = array[i];
        }

        System.out.println("Print middle array: " + Arrays.toString(middleArray));

        return middleArray;
    }
}
