/*
**Question 6**

Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears **once** or **twice**, return *an array of all the integers that appears **twice***.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

**Example 1:**

**Input:** nums = [4,3,2,7,8,2,3,1]

**Output:**

[2,3]

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> res = sol.findDuplicates(nums);
        System.out.println(res.toString());
    }
}



class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> mp = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0)
            {
                mp.add(index+1);
            }
            nums[index]=-nums[index];
        }
        return mp;
    }
}
