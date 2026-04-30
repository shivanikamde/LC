class Solution {
    public int[] shuffle(int[] nums, int n) {
        // int[] res = new int[2*n];
        
        // for(int i = 0; i < n; i++) {
        //     res[2*i] = nums[i];
        //     res[2*i + 1] = nums[i + n];
        // }
        // return res;

        int[] nums2=new int[2*n];
        int x=0;
        int y=1;
        for(int i=0;i<n;i++){
            nums2[x]=nums[i];
            x+=2;
        }
        for(int j=n;j<nums.length;j++){
            nums2[y]=nums[j];
            y+=2;
        }
        return nums2;
    }
}