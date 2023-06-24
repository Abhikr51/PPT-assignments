
/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

**Example 1:**
Input: nums = [1,3,5,6], target = 5

Output: 2

 */
public class Q3 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1,3,5,6};
        int res = sol.binarySearch(arr ,0,arr.length-1,5);
        System.out.println("Result : " + res);
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