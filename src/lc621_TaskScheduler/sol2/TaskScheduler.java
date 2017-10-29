package lc621_TaskScheduler.sol2;

import Utils.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler {

    public static void main(String[] args) {
        char[] tasks = {'A','A','C','B','B','B'};
        int n = 2  ;
        int numOfIntervals = leastInterval(tasks, n);
        Util.print("Number of intervals : " + numOfIntervals);
    }

    public static int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        for (char c: tasks) {
            map[c - 'A']++;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(26, Collections.reverseOrder());
        for (int f: map) {
            if (f > 0) {
                queue.add(f);
            }
        }
        int time = 0;
        while (!queue.isEmpty()) {
            int i = 0;
            List<Integer> temp = new ArrayList<>();
            while (i <= n) {
                if (!queue.isEmpty()) {
                    if (queue.peek() > 1) {
                        Integer poll = queue.poll();
                        temp.add(poll - 1);
                    } else {
                        queue.poll();
                    }
                }
                time++;
                if (queue.isEmpty() && temp.size() == 0) {
                    break;
                }
                i++;
            }
            queue.addAll(temp);
        }
        return time;
    }

}