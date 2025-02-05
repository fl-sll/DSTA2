package Week4;

class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data)
    {
        //? Create a new node with given data
        Node new_node = new Node(data);

        //// If the Linked List is empty,
        //// then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            //// Else traverse till the last node
            //// and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            //// Insert the new_node at last node
            last.next = new_node;
        }

        //// Return the list by head
        return list;
    }

    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        printList(list);
    }
}