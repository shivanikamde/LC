class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int startp=0;
        int endp=numbers.length-1;

        while(startp<endp){
            int temp_sum=numbers[startp]+numbers[endp];
            if(temp_sum==target){
                return new int[]{startp+1,endp+1};
            }
            else if(temp_sum<target)
            {   
                startp++;
            }
            else{
                endp--;
            }
        }
        return new int[]{0,0};
    }
}