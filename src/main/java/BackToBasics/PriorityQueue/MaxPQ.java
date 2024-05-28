package BackToBasics.PriorityQueue;

public class MaxPQ {


    int[] heap;

    int size;


    MaxPQ(int capacity) {

        this.heap = new int[capacity + 1];
        this.size = 0;
    }


    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }


    public static void main(String[] args) {


        MaxPQ maxPQ = new MaxPQ(3);

        System.out.println(" Heap Size : " + maxPQ.size());
        System.out.println(" Is Heap Empty ? " + maxPQ.isEmpty());
    }
}
