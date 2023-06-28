/*
Question 4
Given a sorted array of distinct integers and a target value, return the index if the
target is found. If not, return the index where it would be if it were inserted in
order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
 */
import java.util.Arrays;
public class Q4 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,3,5,6};
        int res = sol.searchInsert(nums,5);
        System.out.println(res);
    }
}



class Solution {
    public int searchInsert(int[] nums, int target) {
        int a =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                a= i;
                break;
            }
            else if (nums[i] > target)
            {
                a=i;
                break;
            }else{
                a=nums.length;
            }
        }
       return a; 
    }
}