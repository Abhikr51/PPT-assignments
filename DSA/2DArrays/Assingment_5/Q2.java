/*
**Question 1**

You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.

Given the integer n, return *the number of **complete rows** of the staircase you will build*.

**Input:** n = 5

**Output:** 2

**Explanation:** Because the 3rd row is incomplete, we return 2.
 */

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int res= sol.arrangeCoins(5);
        System.out.println(res);
    }
}



class Solution {
    public int arrangeCoins(int n) {
        int i;
        for(i=1; i<=n; i++){
            n = n-i;
        }
        return i-1;
    }
}