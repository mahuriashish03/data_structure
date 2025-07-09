package Array.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        twoSum(array, 9);
        maxProfitUsingMap(array, 9);
    }
    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == diff) {
                    System.out.println(nums[i] + " " + nums[j]);
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    private static int[] maxProfitUsingMap(int[] prices, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < prices.length; i++) {
            int compliment = target - prices[i];
            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            }
            map.put(prices[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
