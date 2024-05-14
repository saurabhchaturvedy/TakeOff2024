package BackToBasics.SinglyLinkedList;

public class SinglyLinkedList {


    public void print(ListNode head) {

        if (head == null) return;
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }

    }


    public static void main(String[] args) {


        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);


        head.next = second;
        second.next = third;
        third.next = fourth;

        singlyLinkedList.print(head);
    }
}
