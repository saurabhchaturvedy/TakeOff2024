package BackToBasics.CircularLinkedList;

import BackToBasics.SinglyLinkedList.ListNode;

import java.util.NoSuchElementException;

public class CircularLinkedList {


    private ListNode last;
    private int length;


    private class ListNode {

        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public CircularLinkedList() {
        this.last = null;
        this.length = 0;
    }


    public boolean isEmpty() {
        return length == 0;
    }

    public int getLength() {
        return length;
    }


    private void createCircularLinkedList() {

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }


    private void printCircularLinkedList() {

        if (last == null) {
            return;
        }


        ListNode first = last.next;

        while (first != last) {

            System.out.print(first.data + "  ");
            first = first.next;
        }
        System.out.print(first.data + " ");
    }


    public int length() {

        if (last == null) {
            return 0;
        }

        ListNode first = last.next;
        int length = 1;

        while (first != last) {
            length++;
            first = first.next;
        }

        return length;
    }


    public void insertAtStart(int value) {

        ListNode newNode = new ListNode(value);

        if (last == null) {
            last = newNode;
        } else {

            newNode.next = last.next;
        }

        last.next = newNode;
        length++;
    }


    public void insertAtLast(int value) {

        ListNode newNode = new ListNode(value);

        if (last == null) {
            last = newNode;
            last.next = last;
        } else {

            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }


        length++;
    }


    public ListNode removeFirst() {

        if (isEmpty()) {

            throw new NoSuchElementException("Linked List is already empty :: ");
        }


        ListNode temp = last.next;

        if (last.next == last) {
            last = null;
        } else {

            last.next = temp.next;
        }

        temp.next = null;
        length--;
        return temp;
    }


    public ListNode removeLast() {

        if (isEmpty()) {
            throw new NoSuchElementException("Linked List is already Empty ::");
        }

        ListNode temp = last;

        if (last.next == last) {
            last = null;
        } else {

            ListNode secondLast = last;

            while (secondLast.next != last) {

                secondLast = secondLast.next;
            }

            secondLast.next = last.next;
            last = secondLast;
        }

        temp.next = null;
        length--;
        return temp;
    }


    public static void main(String[] args) {

        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.createCircularLinkedList();

        circularLinkedList.printCircularLinkedList();

        int length = circularLinkedList.length();
        System.out.println();
        System.out.println(" Length of the circular list is : " + length);


        circularLinkedList.insertAtStart(36);
        System.out.println();
        circularLinkedList.printCircularLinkedList();
        circularLinkedList.insertAtLast(72);
        System.out.println();
        circularLinkedList.printCircularLinkedList();

        System.out.println();
        circularLinkedList.removeLast();
        circularLinkedList.printCircularLinkedList();
    }
}
