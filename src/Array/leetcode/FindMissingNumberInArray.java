package Array.leetcode;

public class FindMissingNumberInArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,6,5};
        findMissingNumber(array);
    }

    private static int findMissingNumber(int[] array) {
        int length = array.length + 1;
        int sum = (length * (length + 1)) / 2;
        int arraySum = 0;

        for(int i: array) {
            arraySum += i;
        }
        System.out.println("Missing number is: " + (sum-arraySum));
        return sum-arraySum;
    }

}
