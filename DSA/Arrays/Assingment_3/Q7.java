/*
Question 7
You are given an inclusive range [lower, upper] and a sorted unique integer array
nums, where all elements are within the inclusive range.

A number x is considered missing if x is in the range [lower, upper] and x is not in
nums.

Return the shortest sorted list of ranges that exactly covers all the missing
numbers. That is, no element of nums is included in any of the ranges, and each
missing number is covered by one of the ranges.

Example 1:
Input: nums = [0,1,3,50,75], lower = 0, upper = 99
Output: [[2,2],[4,49],[51,74],[76,99]]

Explanation: The ranges are:
[2,2]
[4,49]
[51,74]
[76,99]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q7 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {0,1,3,50,75};
        List<String> res = sol.findMissingRanges(nums,0 ,99);
        System.out.println(res.toString());
    }
}



class Solution {
   public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new LinkedList<String>();
        if (nums.length == 0) {
            findRange(result, lower, upper);
            return result;
        }
        if (nums[0] != Integer.MIN_VALUE) {
            findRange(result, lower, nums[0] - 1);
        }
        for (int i = 0; i < nums.length - 1; i ++) {
            if (nums[i] == nums[i+1]) {
                continue;
            }
            findRange(result, nums[i] + 1, nums[i+1] - 1);
        }
        if (nums[nums.length - 1] != Integer.MAX_VALUE) {
            findRange(result, nums[nums.length - 1] + 1, upper);
        }

        return result;
    }
    private void findRange(List<String> result, int low, int up) {
        if (low > up){
            return;
        }
        if (low == up) {
            result.add((low) + "");
            return;
        }
        result.add(low + "->" + up);
    }
}