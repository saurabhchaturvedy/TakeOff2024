package BackToBasics.DoublyLinkedList;

public class DoublyLinkedList {


    private ListNode head;
    private ListNode tail;
    private int length;


    private static class ListNode {
        private int data; // Can be any generic type
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }


    public void print(ListNode node) {

        ListNode current = node;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }


    public ListNode insertNodeAtBeginning(ListNode node, int data) {

        ListNode newNode = new ListNode(data);
        newNode.next = node;
        node.previous = newNode;
        this.head = newNode;
        length++;
        return newNode;
    }


    public ListNode insertNodeAtEnd(ListNode node, int data) {

        ListNode newNode = new ListNode(data);
        this.tail.next = newNode;
        tail = newNode;
        length++;
        return node;
    }


    public boolean isEmpty() {
        return length == 0;
    }


    public int getLength() {
        return length;
    }


    public boolean isValidIndex(int index) {
        return index >= 0 && index <= length;
    }


    public ListNode insertAtIndex(int index, int data) {

        if (!isValidIndex(index)) {
            throw new IndexOutOfBoundsException("Index : " + index + " is not valid");
        }

        ListNode current = this.head;
        ListNode newNode = new ListNode(data);

        if (index == 0) {
            insertNodeAtBeginning(this.head, data);
        } else if (index == length) {

            insertNodeAtEnd(this.head, data);
        } else {

            for (int j = 0; j < index; j++) {
                current = current.next;
            }


        }

        return null;
    }


    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        doublyLinkedList.head.next = second;
        second.previous = doublyLinkedList.head;

        second.next = third;
        third.previous = second;
        doublyLinkedList.tail = third;


        doublyLinkedList.print(doublyLinkedList.head);


        ListNode insertNodeAtBeginning = doublyLinkedList.insertNodeAtBeginning(doublyLinkedList.head, 55);
        System.out.println();
        doublyLinkedList.print(insertNodeAtBeginning);


        ListNode nodeInsertedAtEnd = doublyLinkedList.insertNodeAtEnd(doublyLinkedList.head, 340);
        System.out.println();
        doublyLinkedList.print(nodeInsertedAtEnd);

        System.out.println(" Lengt of te linked list :: " + doublyLinkedList.length);
    }
}
