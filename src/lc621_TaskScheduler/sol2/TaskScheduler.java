package lc621_TaskScheduler.sol2;

import Utils.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler {

    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B','C','C','D','D','D','D'};
        int n = 3  ;
        int numOfIntervals = leastInterval(tasks, n);
        Util.print("Number of intervals : " + numOfIntervals);
    }

    public static int leastInterval(char[] tasks, int coolingTime) {
        int[] alphabetIndexArr = new int[26];
        for (char ch: tasks) {
            int charIndex = ch - 'A';
            alphabetIndexArr[charIndex]++;
        }
        //priority queue to keep track of task with highest remaining amount
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(26, Collections.reverseOrder());
        for (int x: alphabetIndexArr) {
            //put only those elements from alphabetIndexArr into the queue which have non-zero number of instances
            if (x > 0) {
                priorityQueue.add(x);
            }
        }
        //The reversed ordering of the queue ensures that the task having highest frequency is at the head of the queue
        int time = 0;
        while (!priorityQueue.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();
            //Iterate over each cycle of cooling time
            for (int i = 0; i <= coolingTime; i++) {
                if (!priorityQueue.isEmpty()) {
                    if (priorityQueue.peek() > 1) {
                        //decrement its pending number of instances and add to temp list
                        tempList.add(priorityQueue.poll() - 1);
                    } else {
                        priorityQueue.poll();
                    }
                }
                time = time + 1;
                if (priorityQueue.isEmpty() && tempList.size() == 0) {
                    break;
                }
            }
            //Add the tasks from list to the priority queue so that they can be considered in the next CPU cooling cycle
            priorityQueue.addAll(tempList);
        }
        return time;
    }

}