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


    public int size(ListNode head) {

        if (head == null) return 0;
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }


    public ListNode insertAtStart(ListNode head, int data) {

        if (head == null) return new ListNode(data);

        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        return head;

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

        System.out.println("Size of the linked list is : " + singlyLinkedList.size(head));


        ListNode listNode = singlyLinkedList.insertAtStart(head, 35);
        singlyLinkedList.print(listNode);
    }
}
