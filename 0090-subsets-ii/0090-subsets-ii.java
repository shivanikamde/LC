class Solution {
    List<List<Integer>> outerlist=new ArrayList<>();
    List<Integer> innerlist=new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int i=0;
        Arrays.sort(nums);
        return calculatesubsets(nums,i,innerlist);
    }

    public List<List<Integer>> calculatesubsets(int[] nums, int i, List<Integer> list){
        int size=nums.length;

        //base case
        if(i==size){
            outerlist.add(new ArrayList<>(list));
            return outerlist;
        }

        //include push & call function again
        list.add(nums[i]);
        calculatesubsets(nums,i+1,list);

        //exclude pop & call function again
        list.remove(list.size()-1);

        while(i+1<nums.length && nums[i]==nums[i+1]){
            i++;
        }

        calculatesubsets(nums,i+1,list);
        return outerlist;
    }
}