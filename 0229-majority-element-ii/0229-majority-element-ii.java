class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int condition=n/3;

        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

            if(hm.get(nums[i])>condition && !al.contains(nums[i])){
                al.add(nums[i]);
            }
        } 
        return al;
    }
}