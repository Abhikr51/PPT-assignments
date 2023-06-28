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
        int[] nums = {1,2,3};
        sol.nextPermutation(nums);
        System.out.print("[ ");
        for(int i :nums){
            System.out.print(i + ",");
        }
        System.out.print(" ]");
    }
}



class Solution {
    public void nextPermutation(int[] A) {
        int N = A.length;
        int i;
        int j;

        for (i = N - 2; i >= 0; i--) {
            if (A[i] < A[i + 1])
                break;
        }

        if (i >= 0) {
            for (j = N - 1; j > i; j--) {
                if (A[i] < A[j])
                    break;
            }
            swap(A, i, j);
        }
        reverse(A, i + 1, N - 1);
    }

    public void reverse(int[] A, int start, int end) {
        while (start < end) {
            swap(A, start++, end--);
        }
    }

    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}