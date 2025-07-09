package Array.Practice;

import java.util.Arrays;

public class FirstAndSecondBestInArray {

    public static void main(String[] args) {

        int[] array = {1,2,8,4,5,6,7,7,20};
        System.out.println("First array: " + Arrays.toString(findTop2Score(array)));
    }

    private static int[] findTop2Score(int[] array) {
        int maxScore = Integer.MIN_VALUE;
        int secondMaxScore = Integer.MIN_VALUE;

        for(int score: array) {
            if(score > maxScore) {
                secondMaxScore = maxScore;
                maxScore = score;
            } else if (score > secondMaxScore && score < maxScore) {
                secondMaxScore = score;
            }
        }
        System.out.println("First highest score is: " + maxScore);
        System.out.println("Second highest score is: " + secondMaxScore);
        return new int[]{maxScore, secondMaxScore};
    }
}
