/*
**Question 6**
Given an integer array nums sorted in **non-decreasing** order, return *an array of **the squares of each number** sorted in non-decreasing order*.

**Example 1:**

Input: nums = [-4,-1,0,3,10]

Output: [0,1,9,16,100]

**Explanation:** After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100]

 */

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-4,-1,0,3,10};
        int[] res = sol.sortedSquares(nums);
        System.out.print("[ ");
        for(int i :res){
            System.out.print(i + ",");
        }
        System.out.print(" ]");
    }
}



class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0;i<nums.length;i++)
        {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}