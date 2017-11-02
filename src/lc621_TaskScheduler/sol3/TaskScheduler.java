package lc621_TaskScheduler.sol3;

import Utils.Util;

import java.util.Arrays;

public class TaskScheduler {

    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B','C','C','D','D','D','D'};
        int n = 3;
        int numOfIntervals = leastInterval(tasks, n);
        Util.print("Number of intervals : " + numOfIntervals);
    }

    public static int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        for (char c: tasks) {
            map[c - 'A']++;
        }
        Arrays.sort(map);
        int maxVal = map[25] - 1;
        int idleSlots = maxVal * n;
        for (int i = 24; i >= 0 && map[i] > 0; i--) {
            idleSlots = idleSlots - Math.min(map[i], maxVal);
        }
        return idleSlots > 0 ? idleSlots + tasks.length : tasks.length;
    }

}