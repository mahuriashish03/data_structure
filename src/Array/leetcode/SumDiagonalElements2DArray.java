package Array.leetcode;

public class SumDiagonalElements2DArray {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        sumOfDiagonalElements(matrix);
    }

    private static int sumOfDiagonalElements(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Print the sum: " + sum );
        return sum;
    }
}
