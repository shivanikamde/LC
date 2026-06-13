class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length,count=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int[] psum=new int[n];
        psum[0]=nums[0];
        for(int i=1;i<n;i++){
            psum[i]=psum[i-1]+nums[i];
        }
        for(int i=0;i<n;i++){
            if(psum[i]==k){
                count++;
            }
            int val=psum[i]-k;
            if(mp.containsKey(val)){
                count+=mp.get(val);
            }
            mp.put(psum[i],mp.getOrDefault(psum[i],0)+1);
        }
        return count;
    }
}