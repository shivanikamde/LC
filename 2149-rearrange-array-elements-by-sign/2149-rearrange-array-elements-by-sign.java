class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;

        int pos_index=0;
        int neg_index=1;
        int[] nums2=new int[n];

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                nums2[pos_index]=nums[i];
                pos_index+=2;
            }
            else{
                nums2[neg_index]=nums[i];
                neg_index+=2;
            }
            
        }
        return nums2;
    }
}