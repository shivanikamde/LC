class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int maxcount=0;
        if(n==1){
            return 1;
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        for(int i:hs){
            int curr=i;
            if(!hs.contains(curr-1)){
                int count=1;
                while(hs.contains(curr+1)){
                    count++;
                    curr++;
                }
                if(count>maxcount){
                    maxcount=count;
                }
            }
        }
        return maxcount;
    }
}