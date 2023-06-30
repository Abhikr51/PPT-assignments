/*
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

**Example 1:**
**Input:** n = 3

**Output:** [[1,2,3],[8,9,4],[7,6,5]]
 */

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] res = sol.generateSpiralMatrix(3);
        System.out.println(Arrays.deepToString(res));
    }
}

class Solution {
    public int[][] generateSpiralMatrix(int n) {
        int[][] ans = new int[n][n];
        //right -> bottom -> left -> top
        int top = 0, left = 0;
        int bottom = n-1, right = n-1;
        int k = 1;
        while(top<=bottom && left<=right){
            //right
            for(int i=left;i<=right;i++){
                ans[top][i] = k++ ;
            }
            top++;
            //bottom
            for(int i=top;i<=bottom;i++){
                ans[i][right] = k++;
            }
            right--;
            if(top<=bottom){
                //left
                for(int i=right;i>=left;i--){
                    ans[bottom][i] = k++;
                  }
                 bottom--;
            }
            if(left<=right){
                //top
                for(int i=bottom;i>=top;i--){
                    ans[i][left] = k++;
                }  
                left++;
            }
            
        }
        
        return ans;
    
    }
}

