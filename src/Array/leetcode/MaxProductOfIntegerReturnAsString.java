package Array.leetcode;

import java.util.Arrays;

public class MaxProductOfIntegerReturnAsString {

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};

        maxProduct(array);

    }

    private static String maxProduct(int[] array) {
        String pairs = "";
        int maxProduct = 1;

        for(int i = 0; i < array.length; i++) {
            int product = 1;
            for(int j = i+1; j < array.length; j++) {
                if(i != j) {
                    product = array[i] * array[j];
                    if(product > maxProduct) {
                        maxProduct = product;
                        pairs = Integer.toString(array[i]) + "*" + Integer.toString(array[j]);
                    }
                }
            }
        }
        System.out.println(pairs);
        return pairs;

    }
}
