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


    public ListNode insertAtPosition(ListNode head, int position, int data) {

        if ((head == null) && position == 1) {
            return new ListNode(data);
        }

        if (head == null && position > 1) {
            return null;
        }


        ListNode temp = head;
        int count = 0;

        while (count < position - 2) {
            count++;
            temp = temp.next;
        }
        ListNode newNode = new ListNode(data);
        ListNode next = temp.next;
        temp.next = newNode;
        newNode.next = next;

        return head;
    }


    public ListNode insertAtLast(ListNode head, int data) {
        if (head == null) {
            return new ListNode(data);
        }

        ListNode temp = head;

        ListNode newNode = new ListNode(data);

        while (temp.next != null) {

            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }


    public ListNode deleteAtStart(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        return head.next;
    }


    public ListNode deleteAtEnd(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }


        ListNode temp = head;

        while (temp.next.next != null) {

            temp = temp.next;
        }

        temp.next = null;

        return head;
    }


    public boolean search(ListNode head, int item) {

        if (head == null) return false;
        ListNode temp = head;

        while (temp != null) {
            if (temp.data == item) {
                return true;
            }
            temp = temp.next;
        }


        return false;
    }


    public ListNode deleteNodeAtPosition(ListNode head, int position) {

        if (head == null) {
            return null;
        }

        if (head.next == null || position == 1) {
            return null;
        }


        ListNode temp = head;
        int count = 0;
        while (count < position - 1) {
            count++;
            temp = temp.next;
        }


        ListNode tempNext = temp.next.next;
        temp.next = null;
        temp.next = tempNext;

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

        System.out.println();
        ListNode newLastNode = singlyLinkedList.insertAtLast(listNode, 47);
        singlyLinkedList.print(newLastNode);

        ListNode listNodeAtPosition = singlyLinkedList.insertAtPosition(newLastNode, 3, 88);
        System.out.println();
        singlyLinkedList.print(listNodeAtPosition);


        ListNode listAfterNodeDeletedAtStart = singlyLinkedList.deleteAtStart(listNodeAtPosition);
        System.out.println();
        singlyLinkedList.print(listAfterNodeDeletedAtStart);


        ListNode listAfterDeletionAtEnd = singlyLinkedList.deleteAtEnd(listAfterNodeDeletedAtStart);
        System.out.println();
        singlyLinkedList.print(listAfterDeletionAtEnd);


        ListNode listAfterDeletingAtPosition = singlyLinkedList.deleteNodeAtPosition(listAfterDeletionAtEnd, 4);
        System.out.println();
        singlyLinkedList.print(listAfterDeletingAtPosition);


        System.out.println("Is Elemnt 88 present ?? : "+singlyLinkedList.search(listAfterDeletingAtPosition,88));
    }
}
