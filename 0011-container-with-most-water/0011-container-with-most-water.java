class Solution {
    public int maxArea(int[] height) {
        int l=height.length-1;
        int left=0;
        int right=l;
        int totalwater=0;
        int maxwater=0;

        while(right>left){
            totalwater=(right-left)*Math.min(height[left],height[right]);
            if(totalwater>maxwater){
                maxwater=totalwater;
            }
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }

    return maxwater;
    }
}