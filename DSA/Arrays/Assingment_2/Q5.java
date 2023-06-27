/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:
Input: nums = [1,2,3]
Output: 6
*/

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,2,3};
        int res = sol.threeProduct(nums);
        System.out.println(res);
    }
}
class Solution{
    public int threeProduct(int[] nums) {
        Arrays.sort(nums);
        int temp1 = nums[0] * nums[1] * nums[nums.length - 1];
        int temp2 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        return Math.max(temp1, temp2);
    }
}