/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

Note that you must do this in-place without making a copy of the array.

**Example 1:**
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

*/

public class Q7 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 0, 1, 0, 3, 12 };
        sol.moveZeros(arr);
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.print(" ]");
    }
}

class Solution {
    public void moveZeros(int[] nums) {
        int k = 0;
        for (int i : nums) {
            if (i != 0) {
                nums[k++] = i;
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}