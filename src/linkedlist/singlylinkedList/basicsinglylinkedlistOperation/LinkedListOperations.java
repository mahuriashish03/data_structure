package linkedlist.singlylinkedList.basicsinglylinkedlistOperation;

public class LinkedListOperations {

    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        //head = new Node();
        Node node = new Node();

        node.next = null;
        node.value = nodeValue;

        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertSinglyLinkedList(int nodeValue, int location) {

        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location-1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;

        }
        size++;
    }

    public void traverse() {
        if(head == null) {
            System.out.println("LinkedList is empty");
        } else {
            Node tempNode = head;
            while(tempNode != null) {
                System.out.print(tempNode.value + "->");
                tempNode = tempNode.next;
            }
        }
    }

    public boolean searchNode(int value) {
        if (head == null) {
            System.out.println("LinkedList is empty");
        } else {
            Node tempNode = head;
            while(tempNode != null) {
                if(tempNode.value == value) {
                    System.out.println("value found");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("value not found");
        return false;
    }

    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("Linked list does not exist");
            return;
        } else if(location == 0) {
            head = head.next;
            size--;
            if( size == 0) {
                tail = null;
            }
        } else if (location >= size ) {
            Node tempNode = head;
            for(int i = 0; i < size-1; i++) {
                tempNode = tempNode.next;
            }

            if(tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
        }  else {
            Node tempNode = head;
            for(int i = 0; i<location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
}
