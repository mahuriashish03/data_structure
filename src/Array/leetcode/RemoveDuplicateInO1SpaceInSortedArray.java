package Array.leetcode;

public class RemoveDuplicateInO1SpaceInSortedArray {

    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,5,5,5,6,7,8,9};
        int newLength = removeDuplicate(array);

        System.out.println("New Length: " + newLength);
    }

    private static int removeDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int i= 0;

        for (int j = 1; j< nums.length; j++ ) {
            if(nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }
}
