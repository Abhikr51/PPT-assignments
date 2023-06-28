/*
**Question 5**
You are given a large integer represented as an integer array digits, where each
digits[i] is the ith digit of the integer. The digits are ordered from most significant
to least significant in left-to-right order. The large integer does not contain any
leading 0's.

Increment the large integer by one and return the resulting array of digits.

**Example 1:**
Input: digits = [1,2,3]
Output: [1,2,4]

**Explanation:** The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

 */

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,2,3};
        int res[] = sol.plusOne(nums);
        System.out.println(Arrays.toString(res));
    }
}



class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1]+=1;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==10 && i!=0){
                digits[i]=0;
                digits[i-1]+=1;
            }
            if(digits[i]==10){
                int[] copy = new int[digits.length+1];
                copy[i]=1;
                return copy;
            }            
        }                 
        return digits;  
    }
}