/*
You are given an integer array nums and an integer k.

In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.

The score of nums is the difference between the maximum and minimum elements in nums.

Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

Example 1:
Input: nums = [1], k = 0
Output: 0

Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.
*/


public class Q8 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1};
        int res = sol.smallestRange(nums , 0);
        System.out.println(res);
    }
}
class Solution {
   public int smallestRange(int[] nums, int k) {
      int n_max = findMax(nums) - k;
      int n_min = findMin(nums) + k;
      int diff = n_max - n_min;
      return diff < 0 ? 0 : diff;
   }
   int findMax(int[] nums){
      int max = nums[0];
      for(int i=1 ; i<nums.length ; i++){
         if(max < nums[i]){
            max = nums[i];
         }
      }
      return max;
   }
   int findMin(int[] nums){
      int min = nums[0];
      for(int i=1 ; i<nums.length ; i++){
         if(min > nums[i]){
            min = nums[i];
         }
      }
      return min ;
   }
}