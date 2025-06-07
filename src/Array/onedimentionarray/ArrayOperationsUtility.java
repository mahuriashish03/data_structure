package Array.onedimentionarray;

import java.util.Arrays;

public class ArrayOperationsUtility {
    int[] arr;

    public ArrayOperationsUtility(int size) {
        arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //Insertion in array
    public void insert(int location, int value) {
        try {

            if(arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("Value inserted successfully at the location");
            } else {
                System.out.println("Value not inserted as the location is already used");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not a valid array Index");
        }
    }

    //Accesssing array element
    public void findElement(int location) {
        try {
            int element = arr[location];
            System.out.println("Value of the loaction is" + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not a valid array Index");
        }
    }

    //Traversal array element
    public void traverse() {
        System.out.println("Traversing array elements");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    //For searching operation
    public void search(int value) {
        for(int i = 0 ; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Value found at the location " + (i+1));
                return;
            } else {
                System.out.println("Value not found at the location.");
            }
        }
    }

    //For deletetion operation
    public void delete(int location) {
        try {
            arr[location] = Integer.MIN_VALUE;
            System.out.println("Value deleted at the location " + arr[location]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Not a valid array Index");
        }
    }



    @Override
    public String toString() {
        return Arrays.toString(this.arr);  // assuming your array field is called 'array'
    }
}
