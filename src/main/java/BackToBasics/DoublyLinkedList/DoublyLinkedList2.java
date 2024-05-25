package BackToBasics.DoublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList2 {


    private ListNode head;
    private ListNode tail;
    private int length;


    private class ListNode {
        ListNode prev;
        ListNode next;
        int data;

        ListNode(int data) {
            this.prev = null;
            this.next = null;
            this.data = data;
        }
    }


    public DoublyLinkedList2() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }


    public int getLength() {
        return length;
    }


    public boolean isEmpty() {
        return length == 0;
    }


    public void displayForward() {
        if (head == null) {
            return;
        }


        ListNode temp = head;

        while (temp != null) {

            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

        System.out.println(" null ");
    }


    public void displayBackward() {
        if (head == null) {
            return;
        }


        ListNode temp = tail;

        while (temp != null) {

            System.out.print(temp.data + " --> ");
            temp = temp.prev;
        }

        System.out.println(" null ");
    }


    public void insertFirst(int value) {

        ListNode newNode = new ListNode(value);

        if (isEmpty()) {
            tail = newNode;
        } else {

            head.prev = newNode;
        }

        newNode.next = head;
        head = newNode;
        length++;
    }


    public void insertLast(int value) {

        ListNode newNode = new ListNode(value);

        if (isEmpty()) {
            head = newNode;
        } else {

            tail.next = newNode;
            newNode.prev = tail;
        }

        tail = newNode;
        length++;
    }


    public boolean isValidIndex(int index) {
        return index >= 0 && index <= length;
    }


    public void insertAtIndex(int value, int index) {

        if (!isValidIndex(index)) {
            throw new IndexOutOfBoundsException("Index : " + index + " is not valid !!");
        }

        ListNode current = head;
        ListNode newNode = new ListNode(value);

        if (index == 0) {
            insertFirst(value);
        } else if (index == length) {
            insertLast(value);
        } else {

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            newNode.next = current;
            current.prev.next = newNode;
            newNode.prev = current.prev;
            current.prev = newNode;
            length++;
        }

    }


    public ListNode deleteFirst() {

        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {

            head.next.prev = null;
        }

        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }


    public static void main(String[] args) {


        DoublyLinkedList2 doublyLinkedList2 = new DoublyLinkedList2();

        doublyLinkedList2.insertFirst(10);
        doublyLinkedList2.insertFirst(20);
        doublyLinkedList2.insertFirst(30);

        doublyLinkedList2.displayForward();
        doublyLinkedList2.displayBackward();

        doublyLinkedList2.insertLast(40);
        doublyLinkedList2.insertLast(60);
        doublyLinkedList2.displayForward();

        doublyLinkedList2.insertAtIndex(77, 3);
        doublyLinkedList2.displayForward();

        ListNode listNode = doublyLinkedList2.deleteFirst();
        System.out.println(" Deleted Node : " + listNode.data);

        doublyLinkedList2.displayForward();
    }
}
