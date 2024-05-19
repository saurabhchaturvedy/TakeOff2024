package BackToBasics.DoublyLinkedList;

public class DoublyLinkedList {


    public void print(ListNode node) {

        ListNode current = node;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }


    public static void main(String[] args) {


        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        head.next = second;
        second.previous = head;

        second.next = third;
        third.previous = second;

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.print(head);
    }
}
