/*
**Question 3**
A permutation of an array of integers is an arrangement of its members into a
sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr:
[1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].

The next permutation of an array of integers is the next lexicographically greater
permutation of its integer. More formally, if all the permutations of the array are
sorted in one container according to their lexicographical order, then the next
permutation of that array is the permutation that follows it in the sorted container.

If such an arrangement is not possible, the array must be rearranged as the
lowest possible order (i.e., sorted in ascending order).

● For example, the next permutation of arr = [1,2,3] is [1,3,2].
● Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
● While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not
have a lexicographical larger rearrangement.

Given an array of integers nums, find the next permutation of nums.
The replacement must be in place and use only constant extra memory.

**Example 1:**
Input: nums = [1,2,3]
Output: [1,3,2]

 */
import java.util.Arrays;
public class Q3 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-1,2,1,-4};
        int res = sol.threeSumClosest(nums,1);
        System.out.println(res);
    }
}



class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result=nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++) {
            int start=i+1,end=nums.length-1;
            while(start<end) {
                int sum=nums[i]+nums[start]+nums[end];
                if(sum>target) end--;
                else start++;
                if (Math.abs(sum-target)<Math.abs(result-target)) result=sum;
            }
        }
        return result;
    }
}