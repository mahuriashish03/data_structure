package Array.Practice;

public class RemoveDuplicateInO1SpaceInSortedArray {

    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,4,5,5,5,6,7,8,9};
        int newLength = removeDuplicate(array);

        System.out.println("New Length: " + newLength);
    }

    private static int removeDuplicate(int[] array) {
        if(array == null ||array.length == 0) return 0;
        if(array.length == 1) return 1;

        int i = 0;
        for(int j = 1; j < array.length; j++) {
            if(array[j] != array[i]) {
                i++;
                array[i] = array[j];
            }
        }
        return i+1;
    }
}
