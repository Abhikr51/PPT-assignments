/*
 **Question 4**
Given two **0-indexed** integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*
- answer[0] *is a list of all **distinct** integers in* nums1 *which are **not** present in* nums2*.*
- answer[1] *is a list of all **distinct** integers in* nums2 *which are **not** present in* nums1.
**Note** that the integers in the lists may be returned in **any** order.

**Example 1:**

**Input:** nums1 = [1,2,3], nums2 = [2,4,6]

**Output:** [[1,3],[4,6]]

**Explanation:**

For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].

For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].

 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class Q4 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        List<List<Integer>> res = sol.findDifference(nums1,nums2);
        System.out.println(res);
    }
}



class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1=toListValue(nums1);
        List<Integer> list2=toListValue(nums2);
        Set<Integer> list3=new HashSet<Integer>();
        for(int a:list1){
            if(!list2.contains(a)) list3.add(a);
        }
        Set<Integer> list4=new HashSet<Integer>();
        for(int b:list2){
            if(!list1.contains(b)) list4.add(b);
        }
        List<List<Integer>> arrayList=new ArrayList<List<Integer>>();
        arrayList.add(new ArrayList<Integer>(list3));
        arrayList.add(new ArrayList<Integer>(list4));
        return arrayList;
    }
    public List<Integer> toListValue(int[] nums1){
        return Arrays.stream(nums1).boxed().collect(Collectors.toList());
    }
}