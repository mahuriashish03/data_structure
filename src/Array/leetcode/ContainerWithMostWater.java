package Array.leetcode;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
        System.out.println(maxAreaTwoPointer(height));
    }

    private static int maxArea(int[] height) {
        int maxWater = 0;
        for(int i = 0; i < height.length; i++ ) {
            int water = 0;
            for(int j = i+1; j< height.length; j++) {
                if(j != i) {
                    if(height[j] < height[i]) {
                        water = height[j] * (j-i);
                    } else if(height[j] > height[i]){
                        water = height[i] * (j-i);
                    } else if( height[j] == height[i] && height[j] > 0 && height[i] > 0) {
                        water = height[i] * (j-i);
                    }

                }
                if (water > maxWater) {
                    maxWater = water;
                }
            }
        }

        return maxWater;
    }

    //Two pointer approach
    private static int maxAreaTwoPointer(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while(left < right) {
            int width = right -left;
            int area = Math.min(height[left], height[right]) * (width);
            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]) {
               left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
