/*
You are given an m x n integer matrix matrix with the following two properties:

- Each row is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.

Given an integer target, return true *if* target *is in* matrix *or* false *otherwise*.

You must write a solution in O(log(m * n)) time complexity.

Example 1:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3

Output: true
 */

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean res = sol.diStringMatch(arr);
        System.out.println(res);
    }
}

class Solution {
    public boolean searchMatrix(int[][] mat ,int target) {
        int m = mat.length;
        int n = mat[0].length;
        if(m==0)return false;
        int low = 0;
        int high = (m*n) - 1;
        int midIdx, midElm,rowIdx,colIdx;
        while(low <= high){
            midIdx = low + (high - low) / 2;
            rowIdx = midIdx / n;
            colIdx = midIdx % n;
            midElm = mat[rowIdx][colIdx];
            if(target == midElm)return true;
            else{
                if(target < midElm){
                    //leftside
                    high = midIdx - 1;
                }else{
                    //rightside
                    low = midIdx + 1 ;
                }
            }
        }
       return false; 
    }
}

