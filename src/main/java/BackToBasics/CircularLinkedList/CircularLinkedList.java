package BackToBasics.CircularLinkedList;

import BackToBasics.SinglyLinkedList.ListNode;

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


    public static void main(String[] args) {

        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.createCircularLinkedList();

        circularLinkedList.printCircularLinkedList();
    }
}
