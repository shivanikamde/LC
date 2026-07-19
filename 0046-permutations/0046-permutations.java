class Solution {
    List<List<Integer>> outerlist = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        calculatePermutations(nums, 0);
        return outerlist;
    }
    public void calculatePermutations(int[] nums, int index) {
        // base case
        if (index == nums.length) {
            List<Integer> innerlist = new ArrayList<>();
            for (int a=0;a<nums.length;a++) {
                innerlist.add(nums[a]);
            }
            outerlist.add(innerlist);
            return;
        }
        for (int j = index; j < nums.length; j++) {
            swap(nums, index, j);
            calculatePermutations(nums, index + 1);
            swap(nums, index, j);
        }
    }
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}