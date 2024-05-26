package BackToBasics.Queue;

import java.util.NoSuchElementException;

public class Queue {


    ListNode front;
    ListNode rear;

    int length;


    private class ListNode {


        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    Queue() {

        front = null;
        rear = null;
        length = 0;
    }


    private int length() {
        return length;
    }


    private boolean isEmpty() {

        return length == 0;
    }


    public void enqueue(int value) {

        ListNode temp = new ListNode(value);

        if (isEmpty()) {
            front = temp;
        } else {

            rear.next = temp;
        }

        rear = temp;
        length++;
    }


    public void print() {

        if (isEmpty()) {
            return;
        }


        ListNode current = front;


        while (current != null) {

            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print(" null ");
    }


    public int dequeue() {

        if (isEmpty()) {
            throw new NoSuchElementException(" Queue is already empty !!");
        }


        int result = front.data;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        length--;
        return result;
    }

    public static void main(String[] args) {


        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(8);
        queue.enqueue(22);
        queue.enqueue(37);
        queue.enqueue(3);


        System.out.println(" Length of the queue is : " + queue.length);

        queue.print();

        queue.dequeue();

        System.out.println(" Length of the queue is : " + queue.length);

        System.out.println();

        queue.print();
    }
}
