package BackToBasics.MSOA;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TotalWaitingTime {


    public int totalWaitingTime(int[] T) {

        int n = T.length;
        int totalCurrentTime = 0;
        int totalWaitingTime = 0;

        PriorityQueue<Item> pq = new PriorityQueue<>((a, b) -> a.remainingTime - b.remainingTime);

        for (int i = 0; i < n; i++) {

            pq.offer(new Item(T[i], i));
        }


        while (!pq.isEmpty()) {

            Item currentItem = pq.poll();

            totalCurrentTime++;

            currentItem.remainingTime--;

            if (currentItem.remainingTime == 0) {
                totalWaitingTime = totalWaitingTime + totalCurrentTime;
            } else {

                pq.offer(currentItem);
            }
        }

        return totalWaitingTime;
    }


    public int totalWaitingTime2(int[] T) {
        int n = T.length;
        int totalTime = 0;
        int totalWaitingTime = 0;

        // Priority Queue to manage the items based on remaining time
        PriorityQueue<Item> pq = new PriorityQueue<>((a, b) -> a.remainingTime - b.remainingTime);

        // Initialize the priority queue
        for (int i = 0; i < n; i++) {
            pq.add(new Item(T[i], i));
        }

        // Process items in the priority queue
        while (!pq.isEmpty()) {
            Item currentItem = pq.poll();
            totalTime++;

            currentItem.remainingTime--;
            if (currentItem.remainingTime == 0) {
                totalWaitingTime += totalTime;
            } else {
                pq.add(currentItem);
            }
        }

        return totalWaitingTime;
    }


    private static class Item {
        int remainingTime;
        int index;

        public Item(int remainingTime, int index) {
            this.remainingTime = remainingTime;
            this.index = index;
        }
    }


    public int totalWaitingTime3(int[] T) {
        int n = T.length;
        int totalTime = 0;
        int[] waitingTime = new int[n];
        int[] remainingTime = new int[n];

        // Initialize remainingTime array
        for (int i = 0; i < n; i++) {
            remainingTime[i] = T[i];
        }

        // Initialize a queue to process items in the given order
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i);
        }

        // Process items in the queue
        while (!queue.isEmpty()) {
            int currentItem = queue.poll();
            totalTime++;

            remainingTime[currentItem]--;
            if (remainingTime[currentItem] == 0) {
                waitingTime[currentItem] = totalTime;
            } else {
                queue.add(currentItem);
            }
        }

        // Sum up the waiting times
        int totalWaitingTime = 0;
        for (int i = 0; i < n; i++) {
            totalWaitingTime += waitingTime[i];
        }

        return totalWaitingTime;
    }

    public static void main(String[] args) {


        int[] T = {1,2,3,4};

        TotalWaitingTime totalWaitingTime = new TotalWaitingTime();

        System.out.println(totalWaitingTime.totalWaitingTime(T));
        System.out.println(totalWaitingTime.totalWaitingTime2(T));
        System.out.println(totalWaitingTime.totalWaitingTime3(T));
    }
}
