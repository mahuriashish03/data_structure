package Array.onedimentionarray;

public class BasicOneDimentionalArrayOperation {
    public static void main(String[] args) {

        ArrayOperationsUtility arrayOperationsUtility = new ArrayOperationsUtility(10);


        //For insertion operation
        arrayOperationsUtility.insert(0, 5);
        arrayOperationsUtility.insert(1, 10);
        arrayOperationsUtility.insert(2, 20);
        arrayOperationsUtility.insert(3, 30);
        arrayOperationsUtility.insert(4, 40);
        arrayOperationsUtility.insert(5, 50);
        arrayOperationsUtility.insert(6, 60);
        arrayOperationsUtility.insert(7, 70);
        arrayOperationsUtility.insert(8, 80);
        arrayOperationsUtility.insert(9, 90);
        arrayOperationsUtility.insert(10, 100);
        System.out.println("Print the current array" + arrayOperationsUtility);

        //For access operation
        arrayOperationsUtility.findElement(5);
        arrayOperationsUtility.findElement(13);

        //for traversal operation
        arrayOperationsUtility.traverse();

        //for searching operation
        arrayOperationsUtility.search(50);
        arrayOperationsUtility.search(100);
        arrayOperationsUtility.search(Integer.MAX_VALUE);

        //For deletion operation
        arrayOperationsUtility.delete(3);
        arrayOperationsUtility.delete(11);

        //Print the array after all the operation
        System.out.println("Print the current array" + arrayOperationsUtility);
    }
}
