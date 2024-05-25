package BackToBasics.DoublyLinkedList;

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

            System.out.print(temp.next + " --> ");
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

            System.out.print(temp.next + " --> ");
            temp = temp.prev;
        }

        System.out.println(" null ");
    }
}
