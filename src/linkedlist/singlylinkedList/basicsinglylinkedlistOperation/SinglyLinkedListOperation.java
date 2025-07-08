package linkedlist.singlylinkedList.basicsinglylinkedlistOperation;

public class SinglyLinkedListOperation {

    public static void main(String[] args) {
        LinkedListOperations linkedListOperations = new LinkedListOperations();
       // linkedListOperations.createSinglyLinkedList(5);
       // System.out.println(linkedListOperations.head.value);

       // linkedListOperations.createSinglyLinkedList(3);
       // System.out.println(linkedListOperations.head.value);

        linkedListOperations.createSinglyLinkedList(8);
        //System.out.println(linkedListOperations.head.value);

        linkedListOperations.insertSinglyLinkedList(10, 0);
       // System.out.println(linkedListOperations.head.value);

        linkedListOperations.insertSinglyLinkedList(15, 3);
      //  System.out.println(linkedListOperations.head.value);
        linkedListOperations.insertSinglyLinkedList(20, 2);
        linkedListOperations.insertSinglyLinkedList(25, 4);
        linkedListOperations.insertSinglyLinkedList(30, 6);

        linkedListOperations.traverse();
        System.out.println("\n");
        System.out.println(linkedListOperations.head.value);

        linkedListOperations.searchNode(20);
        linkedListOperations.searchNode(100);

        linkedListOperations.deletionOfNode(2);

        linkedListOperations.traverse();

    }
}
