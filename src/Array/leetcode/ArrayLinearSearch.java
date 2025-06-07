package Array.leetcode;

public class ArrayLinearSearch {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        linearSearch(intArray, 12);
        linearSearch(intArray, 5);
    }

    private static void linearSearch(int[] intArray, int value) {

        for(int i = 0; i < intArray.length; i++) {
            if(intArray[i] == value) {
                System.out.println("Value dound at the index: " + i );
                return;
            }
        }

        System.out.println(value + " Not found");
    }
}
