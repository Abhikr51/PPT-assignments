/*
**Question 7**
You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.

Count and return *the number of maximum integers in the matrix after performing all the operations*

**Example 1:**

**Input:** m = 3, n = 3, ops = [[2,2],[3,3]]

**Output:** 4

**Explanation:** The maximum integer in M is 2, and there are four of it in M. So return 4.

 */

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] nums = {{2,2},{3,3}};
        int res = sol.maxCount(3,3,nums);
        System.out.println(res);
    }
}



class Solution {
    public int maxCount(int m, int n, int[][] nums) {
        if (nums.length==0)
            return m*n;
        int row=Integer.MAX_VALUE, col=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            row = Math.min(row,nums[i][0]);
            col = Math.min(col,nums[i][1]);
        }
        return row*col;
    }
}