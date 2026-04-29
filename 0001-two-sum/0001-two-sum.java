class Solution {
    public int[] twoSum(int[] nums, int target) {
        //better approach : using hashmap
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int find=0;

        for(int i=0;i<nums.length;i++){
            find=target-nums[i];

            if(hm.containsKey(find)){
                return new int[]{hm.get(find),i};
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return new int[]{-1};

        // brute approach : using all possible combo
        // int length=nums.length;
        // for(int i=0;i<length;i++){
        //     for(int j=i+1;j<length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};

        //optimal approach using greedy
    }
}