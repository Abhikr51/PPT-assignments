/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Example 1:**
Input: nums = [1,2,3,1]

Output: true

 */

public class Q6 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 1, 2, 3, 1 };
        boolean res = sol.checkDuplicate(arr);
        System.out.println(res);
    }
}

class Solution {
    public boolean checkDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}