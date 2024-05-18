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


    public ListNode reverse(ListNode head) {

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {

            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }


    public ListNode findMiddleNode(ListNode head) {

        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {

            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return slowPtr;
    }


    public ListNode nthNodeFromEnd(ListNode head, int n) {

        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;

        while (count < n) {
            refPtr = refPtr.next;
            count++;
        }

        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }

        return mainPtr;
    }


    public ListNode deleteDuplicatesFromSorted(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {

            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {

                current = current.next;
            }
        }


        return head;
    }


    public ListNode insertNodeInSortedList(ListNode head, int data) {

        ListNode current = head;
        ListNode newNode = new ListNode(data);

        while (current != null) {
            if (current.data < newNode.data && newNode.data < current.next.data) {

                current.next = newNode;
                newNode.next = current.next;
            }

            current = current.next;

        }

        return head;
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


        System.out.println("Is Elemnt 88 present ?? : " + singlyLinkedList.search(listAfterDeletingAtPosition, 88));


        ListNode reversedList = singlyLinkedList.reverse(listAfterDeletingAtPosition);
        singlyLinkedList.print(reversedList);


        ListNode middleNode = singlyLinkedList.findMiddleNode(reversedList);
        System.out.println("Middle node is : " + middleNode.data);


        ListNode nthNodeFromEnd = singlyLinkedList.nthNodeFromEnd(reversedList, 1);
        System.out.println("Nth node is : " + nthNodeFromEnd.data);


        ListNode head2 = new ListNode(1);
        ListNode second2 = new ListNode(1);
        ListNode third3 = new ListNode(2);
        ListNode fourth4 = new ListNode(3);
        ListNode fifth5 = new ListNode(3);


        head2.next = second2;
        second2.next = third3;
        third3.next = fourth4;
        fourth4.next = fifth5;

        ListNode listAfterDeletingDuplicates = singlyLinkedList.deleteDuplicatesFromSorted(head2);

        singlyLinkedList.print(listAfterDeletingDuplicates);


        ListNode head3 = new ListNode(10);
        ListNode second3 = new ListNode(17);
        ListNode third4 = new ListNode(21);
        ListNode fourth5 = new ListNode(25);
        ListNode fifth6 = new ListNode(33);


        head3.next = second3;
        second3.next = third4;
        third4.next = fourth5;
        fourth5.next = fifth6;

        ListNode insertedNodeInSortedList = singlyLinkedList.insertNodeInSortedList(head3,23);
        System.out.println();
        singlyLinkedList.print(head3);

    }
}
