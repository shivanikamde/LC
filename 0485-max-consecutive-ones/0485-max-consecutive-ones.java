class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;
        int i=0;
        int count = 0;
        int largest = 0;
        for(i=0;i<n;i++){
            if(nums[i]!=1){
                count=0;
            }
            if(nums[i]==1){
                count++;
                if(count>largest){
                    largest=count;
                }
            }
        }
        return largest;
    }
}