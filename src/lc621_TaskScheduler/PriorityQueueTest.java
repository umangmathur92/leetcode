package lc621_TaskScheduler;

import Utils.Util;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {

        PriorityQueue priorityQueue = new PriorityQueue(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                if (i1 == i2) {
                    return 0;
                }
                return i1 < i2 ? -1 : 1;
            }
        });
        priorityQueue.add(5);
        priorityQueue.add(6);
        priorityQueue.add(5);
        priorityQueue.add(1);

        for (int i=0; i < 4; i++) {
            Integer poll = (Integer) priorityQueue.poll();
            Util.print(poll.toString());
        }
    }
}
