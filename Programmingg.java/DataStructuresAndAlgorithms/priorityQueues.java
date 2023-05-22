package DataStructuresAndAlgorithms;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueues {

    public static void main(String[] args) {

        // Prority queues use FIFO AND serves elements with the highest piority first

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.0);
        queue.offer(1.0);
        queue.offer(3.2);
        queue.add(4.0);

        while (!queue.isEmpty()) {

            System.out.println(queue.poll());
        }

    }

}
