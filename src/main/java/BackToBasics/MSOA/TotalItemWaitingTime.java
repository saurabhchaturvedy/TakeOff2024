package BackToBasics.MSOA;

import java.util.LinkedList;
import java.util.Queue;

public class TotalItemWaitingTime {


    public int totalWaitingTime(int[] T) {

        int n = T.length;

        int totalTime = 0;
        int[] remainingTime = new int[n];
        int[] waitingTime = new int[n];

        for (int i = 0; i < n; i++) {
            remainingTime[i] = T[i];
        }


        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(i);
        }


        while (!queue.isEmpty()) {

            int currentItem = queue.poll();

            totalTime++;

            remainingTime[currentItem]--;

            if (remainingTime[currentItem] == 0) {
                waitingTime[currentItem] = totalTime;
            } else {

                queue.offer(currentItem);
            }

        }

        int totalWaitingTime = 0;

        for (int i = 0; i < n; i++) {
            totalWaitingTime += waitingTime[i];
        }

        return totalWaitingTime;
    }


    public static void main(String[] args) {


        int[]arr = {3,1,2};

        TotalItemWaitingTime totalItemWaitingTime = new TotalItemWaitingTime();

        System.out.println(totalItemWaitingTime.totalWaitingTime(arr));

        int[]arr2 = {1,2,3,4};

        System.out.println(totalItemWaitingTime.totalWaitingTime(arr2));

        int[]arr3 = {7,7,7};
        System.out.println(totalItemWaitingTime.totalWaitingTime(arr3));

        int[]arr4 = {10000};
        System.out.println(totalItemWaitingTime.totalWaitingTime(arr4));
    }
}
