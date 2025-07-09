package Array.twodimentionalarray.leetcode;

public class TwoDCalculateSumOfDiagonalElement {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Sum of Diagonal array: " + sumOfDiagonal(matrix));
        System.out.println("Sum of Diagonal array: " + sumOfDiagonalUsingOneLoop(matrix));
    }

    private static int sumOfDiagonal(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    private static int sumOfDiagonalUsingOneLoop(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
                if(matrix[i] != null && i < matrix[i].length) {
                    sum += matrix[i][i];
                }
            }

        return sum;
    }
}
