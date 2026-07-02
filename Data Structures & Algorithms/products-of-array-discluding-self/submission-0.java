class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] lft = new int[nums.length];
        int[] ryt = new int[nums.length];

        lft[0] = 1;
        ryt[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            lft[i] = lft[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            ryt[i] = ryt[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = lft[i] * ryt[i];
        }

        return nums;
    }
}