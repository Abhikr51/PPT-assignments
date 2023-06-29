/*
**Question 3**
Given a 2D integer array matrix, return *the **transpose** of* matrix.

The **transpose** of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

**Example 1:**

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]

Output: [[1,4,7],[2,5,8],[3,6,9]]

 */
import java.lang.reflect.Array;
import java.util.Arrays;
public class Q3 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] nums ={ { 2, 4, -1},
                      { -10, 5, 11 },
                      { 18, -7, 6 },};
        int res[][] = sol.transpose(nums);
        System.out.print("Result matrix is \n");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++)
                System.out.print(res[i][j] + " ");
            System.out.print("\n");
        }
    }
}



class Solution {
    public int[][] transpose(int mat[][])
    {
        int res[][] = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat.length; j++)
                res[i][j] = mat[j][i];
        return res;
    }
}