/*
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.
Given the integer n, return *the number of **complete rows** of the staircase you will build*.

 */

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int res = sol.arrangeCoins(5);
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