class Solution {
    public int findDuplicate(int[] nums) {
        int[] hash=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            // hash index - nums element 
            if(hash[nums[i]]==1){
                return nums[i];
            }
            else{
                hash[nums[i]]=1;
            }
        }
        return -1;
    }
}