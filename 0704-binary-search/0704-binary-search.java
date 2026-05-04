class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int n=nums.length;
        int right=n-1;
        int mid=0;
        int sum=0;
        while(left<=right){
            sum=left+right;
            mid=sum/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
}