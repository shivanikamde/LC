class Solution {
    List<List<Integer>> outerlist = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        calculatePermutations(nums, 0);
        return outerlist;
    }

    public void calculatePermutations(int[] nums, int i) {
        // base case
        if (i == nums.length) {
            List<Integer> innerlist = new ArrayList<>();
            for (int a=0;a<nums.length;a++) {
                innerlist.add(nums[a]);
            }
            outerlist.add(innerlist);
            return;
        }

        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            calculatePermutations(nums, i + 1);
            swap(nums, i, j);
        }
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}