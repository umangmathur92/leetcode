package lc70_ClimbingStairs;
//
//You are climbing a stair case. It takes n steps to reach to the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//Note: Given n will be a positive integer.
//

import Utils.Util;

public class ClimbingStairs {

    public static void main(String[] args) {
        int numStairs = 7;
        int numWaysToClimb = climbStairsZ(numStairs);
        Util.print(numWaysToClimb + "");
    }

    //Method1: Brute Force Recursion
    public static int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }


    //Method2: Recursion with Memoization
    public static int climbStairsZ(int n) {
        int[] memo = new int[n + 1];
        return memoizatedClimb(n, memo);
    }

    private static int memoizatedClimb(int n, int[] memo) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        if (memo[n] > 0) {
            return memo[n];
        } else {
            memo[n] = memoizatedClimb(n - 1, memo) + memoizatedClimb(n - 2, memo);
            return memo[n];
        }
    }

    //Method3: Dynamic Programming

    //Method4: Fibonacci Sequence

}
