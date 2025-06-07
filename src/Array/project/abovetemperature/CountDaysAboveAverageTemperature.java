package Array.project.abovetemperature;

import java.util.Scanner;

    /*
     * This program is used to claculate the number of days when the temperature was higher than the average temperarture
    */
public class CountDaysAboveAverageTemperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int numberOfDays = sc.nextInt();
        int[] temperature = new int[numberOfDays];
        int sum = 0;

        //Time : O(n) where n is the number of element
        for(int i = 0; i < numberOfDays; i++) {
            System.out.print("Enter the day " + (i+1) + " temperature: ");
            temperature[i] = sc.nextInt();
            sum = sum + temperature[i];
        }

        double averageTemperature = (double) sum / numberOfDays;
        System.out.println("The average temperature is " + averageTemperature);
        int count = 0;

        //Time: O(n) where n is the number of element.
        for(int i = 0; i < temperature.length; i++) {
            if(temperature[i] > averageTemperature) {
                count++;
            }
        }
        // Same logic as above loop with inhanced for loop
        /*        for (int j : temperature) {
                    if (j > averageTemperature) {
                        count++;
                    }
                }*/
        System.out.println("Number of days above average temperature is " + count);
    }
}
