/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

**Example 1:**
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

**Explanation:** The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

 */

public class Q5 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };
        sol.merge(arr1, 3, arr2, 3);
        System.out.print("[ ");
        for (int i : arr1) {
            System.out.print(i + ",");
        }
        System.out.print(" ]");
    }
}

class Solution {
    public void merge(int arr1[], int m, int arr2[], int n) {
        int insertIdx = m + n - 1;
        int idx1 = m - 1, idx2 = n - 1;

        while (idx2 >= 0) {
            if (idx1 < 0) {
                arr1[insertIdx--] = arr2[idx2--];
            } else {
                if (arr2[idx2] >= arr1[idx1]) {
                    arr1[insertIdx--] = arr2[idx2--];
                } else {
                    arr1[insertIdx--] = arr1[idx1--];
                }
            }
        }
    }
}