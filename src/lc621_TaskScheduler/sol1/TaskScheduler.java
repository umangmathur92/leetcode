package lc621_TaskScheduler.sol1;

import Utils.Util;

import java.util.Arrays;

public class TaskScheduler {

    public static void main(String[] args) {
        char[] tasks = {'C','C','C','B','B','B'};
        int n = 2;
        int numOfIntervals = leastInterval(tasks, n);
        Util.print("Number of intervals : " + numOfIntervals);
    }

    public static int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        for (char c: tasks) {
            map[c - 'A']++;
        }
        Arrays.sort(map);
        int time = 0;
        while (map[25] > 0) {
            int i = 0;
            while (i <= n) {
                if (map[25] == 0) {
                    break;
                }
                if (i < 26 && map[25 - i] > 0) {
                    map[25 - i]--;
                }
                time++;
                i++;
            }
            Arrays.sort(map);
        }
        return time;
    }

}
