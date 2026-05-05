class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int n=nums.length;
        int countzero=0; int maxlen=0;

        for(right=0;right<n;right++){
            if(nums[right]==0){
                countzero++;
            }
            while(countzero>k){
                if(nums[left]==0){
                    countzero--;
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}