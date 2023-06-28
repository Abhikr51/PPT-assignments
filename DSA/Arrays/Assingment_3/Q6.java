/*
Question 6
Given a non-empty array of integers nums, every element appears twice except
for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only
constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1
 */

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2,2,1};
        int res = sol.singleNumber(nums);
        System.out.println(res);
    }
}



class Solution {
    public int singleNumber(int[] nums) {
        int ans=0; 
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];
        }
        return ans;    
    }
}