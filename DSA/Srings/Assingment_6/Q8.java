/*
Given two [sparse matrices](https://en.wikipedia.org/wiki/Sparse_matrix) mat1 of size m x k and mat2 of size k x n, return the result of mat1 x mat2. You may assume that multiplication is always possible.

**Example 1:**
**Input:** mat1 = [[1,0,0],[-1,0,3]], mat2 = [[7,0,0],[0,0,0],[0,0,1]]

**Output:**

[[7,0,0],[-7,0,3]]
 */

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int mat1[][] = {{1,0,0},{-1,0,3}};
        int mat2[][] = {{7,0,0},{0,0,0},{0,0,1}};
        int res[][] = sol.sparshMatrixMul(mat1,mat2);
        System.out.println(Arrays.deepToString(res));
    }
}

class Solution {
    public int[][] sparshMatrixMul(int[][] mat1 , int[][] mat2) {
        //can't find the logic
        return new int[0][0];
    }
}

