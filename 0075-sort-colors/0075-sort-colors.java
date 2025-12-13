class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length-1;
        int low=0,mid=0,high=n,temp;
        while (mid <= high){
            if(nums[mid]==0){
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;

                high--;
            }
        }
        
    }
}