/*
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

Example 1:
Input: nums = [1,2,2,3]
Output: true
*/


public class Q7 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,2,4,3};
        boolean res = sol.isMonotonic(nums);
        System.out.println(res);
    }
}
class Solution{
    public boolean isMonotonic(int[] nums) {
        boolean isIncresing = true;
        boolean isDecreasing = true;

        for(int i = 0 ; i< nums.length-1 ; i++){
            if (nums[i] > nums[i+1])
                isIncresing = false;
            if (nums[i] < nums[i+1])
               isDecreasing = false;
        }
        return isIncresing || isDecreasing;
    }
}