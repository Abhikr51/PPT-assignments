/*
Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. Otherwise,
return -1.

You must write an algorithm with O(log n) runtime complexity.

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4

Explanation: 9 exists in nums and its index is 4
*/

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-1,0,3,5,9,12};
        int res = sol.binarySearch(nums,0,nums.length-1,9);
        System.out.println(res);
    }
}
class Solution{
    public int binarySearch(int[] arr,int low,int high, int target) {
        if (high>=low){  
            int mid = low + (high - low)/2;  ;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target){
                return binarySearch(arr, low, mid-1, target);
            } else {
                return binarySearch(arr, mid +1, high, target);
            }
        }
        return -1;
    }
}