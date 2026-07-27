class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int val = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            }
            if (nums[i] == val) {
                val++;
            } else if (nums[i] > val) {
                return val;
            }
        }
        return val;
    }
}