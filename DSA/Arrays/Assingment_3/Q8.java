/*
Given an array of meeting time intervals where intervals[i] = [starti, endi],
determine if a person could attend all meetings.

Example 1:
Input: intervals = [[0,30],[5,10],[15,20]]
Output: false
 */

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] nums = {{0,30},{5,10},{15,20}};
        boolean res = sol.isAttendMeeting(nums);
        System.out.println(Arrays.toString(res));
    }
}

class Solution {
    class Solution {
        public boolean isAttendMeeting(int[][] intervals) {
            //can't solve this problem.
            return false;
        }
    }
}