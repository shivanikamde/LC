class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        long value=(long)nums[n-1] - (long)nums[0];
        return value*k;
    }

}