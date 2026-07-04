class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int size=nums.length;
        int j=0;int k=0;
        List<List<Integer>> outerlist=new ArrayList<>();
        for(int i=0;i<size-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            j=i+1;
            k=size-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> innerlist=new ArrayList<>();
                    innerlist.add(nums[i]);
                    innerlist.add(nums[j]);
                    innerlist.add(nums[k]);
                    outerlist.add(innerlist);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return outerlist;
    }
}