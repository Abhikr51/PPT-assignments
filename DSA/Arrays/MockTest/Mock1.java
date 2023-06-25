class Mock1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = { 0, 1, 0, 3, 12 };
        s.moveZeros(arr);
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.print(" ]");
    }

}

class Solution {
    public void moveZeros(int[] nums) {
        int nonZeroFlag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[nonZeroFlag];
                nums[nonZeroFlag] = nums[i];
                nums[i] = temp;
                nonZeroFlag++;
            }
        }
    }
}