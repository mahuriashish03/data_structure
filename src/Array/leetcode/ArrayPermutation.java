package Array.leetcode;

public class ArrayPermutation {

    public static void main(String[] args) {

        int[] array1 = {7, 2, 5, 15};
        int[] array2 = {2, 7, 15, 5};

        System.out.println(permutation(array1, array2));
    }

    private static boolean permutation(int[] array1, int[] array2) {
        if(array1.length != array2.length) {
            return false;
        }

        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;

        for(int i = 0; i< array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
            mul1 *= array1[i];
            mul2 *= array2[i];
        }

        if(sum1 == sum2 && mul1 == mul2) {
            return true;
        }

        return false;
    }
}
