package Array.leetcode;

public class FirstAndSecondBestScoreInArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,100,6,50,8,9};

        findTop2Score(array);
    }

    private static int[] findTop2Score(int[] array) {
        int firstHighestScore = Integer.MIN_VALUE;
        int secondHighestScore = Integer.MIN_VALUE;

        for(int score: array) {
            if(score > firstHighestScore) {
                secondHighestScore = firstHighestScore;
                firstHighestScore = score;
            } else if (score > secondHighestScore && score < firstHighestScore) {
                secondHighestScore = score;
            }
        }
        System.out.println("First highest score is: " + firstHighestScore);
        System.out.println("Second highest score is: " + secondHighestScore);
        return new int[]{firstHighestScore, secondHighestScore};

    }
}
