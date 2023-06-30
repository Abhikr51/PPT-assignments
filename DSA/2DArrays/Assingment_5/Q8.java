/*
**Question 8**
An integer array original is transformed into a **doubled** array changed by appending **twice the value** of every element in original, and then randomly **shuffling** the resulting array.
Given an array changed, return original *if* changed *is a **doubled** array. If* changed *is not a **doubled** array, return an empty array. The elements in* original *may be returned in **any** order*.
**Example 1:**

**Input:** changed = [1,3,4,2,6,8]

**Output:** [1,3,4]

**Explanation:** One possible original array could be [1,3,4]:

- Twice the value of 1 is 1 * 2 = 2.
- Twice the value of 3 is 3 * 2 = 6.
- Twice the value of 4 is 4 * 2 = 8.

Other original arrays could be [4,3,1] or [3,1,4].

 */

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,3,4,2,6,8};
        int[] res = sol.findOriginalArray(nums);
        System.out.println(Arrays.toString(res));
    }
}

class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if(n % 2 == 1) return new int[0];
        int mid = n/2 ;
        int[] res = new int[mid];
        if(changed[0] < changed[mid]){
            for(int i= 0 ; i< n/2 ;i++){
                if((changed[i]*2) == changed[mid]){
                    mid++;
                    res[i] = changed[i];
                }else{
                    return new int[0];
                }
            }
        }else{
            mid = 0;
            for(int i= n/2 ; i< n ;i++){
                if((changed[i]*2) == changed[mid]){
                    res[mid] = changed[i];
                    mid++;
                }else{
                    return new int[0];
                }
            }
        }
        
        return res;
    }
}