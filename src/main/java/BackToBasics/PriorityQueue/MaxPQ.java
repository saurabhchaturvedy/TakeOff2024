package BackToBasics.PriorityQueue;

public class MaxPQ {


    int[] heap;

    int size;


    MaxPQ(int capacity) {

        this.heap = new int[capacity + 1]; // for creating a heap starting with index 1
        this.size = 0;
    }


    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }


    private void insert(int item) {

        if (size == heap.length - 1) {
            resize(2 * heap.length);
        }

        size++;
        heap[size] = item;
        swimUp(size);
    }

    private void swimUp(int k) {


        while (k > 1 && heap[k / 2] < heap[k]) {

            int temp = heap[k / 2];
            heap[k / 2] = heap[k];
            heap[k] = temp;
            k = k / 2;
        }
    }

    private void resize(int capacity) {

        int[] temp = new int[capacity];

        for (int i = 0; i < heap.length; i++) {

            temp[i] = heap[i];
        }


        heap = temp;
    }


    public static void main(String[] args) {


        MaxPQ maxPQ = new MaxPQ(3);

        System.out.println(" Heap Size : " + maxPQ.size());
        System.out.println(" Is Heap Empty ? " + maxPQ.isEmpty());
        System.out.println();

        maxPQ.insert(15);
        maxPQ.insert(11);
        maxPQ.insert(8);
        maxPQ.insert(27);

        System.out.println(" Heap Size : " + maxPQ.size());
        System.out.println(" Heap Max Value : " + maxPQ.heap[1]);
    }
}
