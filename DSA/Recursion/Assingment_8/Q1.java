/*
**Question 1**

Given two strings s1 and s2, return *the lowest **ASCII** sum of deleted characters to make two strings equal*.

**Example 1:**

**Input:** s1 = "sea", s2 = "eat"

**Output:** 231

**Explanation:** Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.

Deleting "t" from "eat" adds 116 to the sum.

At the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.

*/

public class Q1{

    public static int minimumDeleteSum(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int sum = 0;

        for (int i = 0; i < n; i++)
            sum += s1.charAt(i);
        
        for (int i = 0; i < m; i++) 
            sum += s2.charAt(i);

        int[][] dp = new int[n+1][m+1];

        int ans = sum;
        for (int r = 0; r < n+1; r++) {
            for (int c = 0; c < m+1; c++) {
                if(r == 0 || c == 0)
                    dp[r][c] = sum;
                else if (s1.charAt(r-1) == s2.charAt(c-1)){
                    dp[r][c] = dp[r-1][c-1] - 2*s1.charAt(r-1);
                    ans = Math.min(ans, dp[r][c]);
                }else {
                    dp[r][c] = Math.min(dp[r-1][c], dp[r][c-1]);
                }
            }
        }

        return ans;
    }
    public static void main(String args[]){
        String s = "sea";
        String t = "eat";  
        int res = minimumDeleteSum(s,t);
        System.out.println(res);
    }
}