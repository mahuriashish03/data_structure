package Array.leetcode;

public class MiddleArrayExpectFirstAndLast {

    public static void main(String[] args) {
        int[] array  = {1,2,3,4,5,6,7,8,9,10};

        middle(array);
    }

    private static int[] middle(int[] array) {
        int[] middle = new int[array.length - 2];

        for(int i = 1; i <= array.length-2 ; i++) {
            middle[i-1] = array[i];
        }

        for(int i = 0; i < middle.length; i++) {
            System.out.print(middle[i] + " ");
        }
        return middle;
    }
}
