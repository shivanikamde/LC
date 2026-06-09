class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerlist=new ArrayList<>();
        List<Integer> firstlist=new ArrayList<>();
        firstlist.add(1);
        outerlist.add(firstlist);

        for(int i=1;i<numRows;i++){
            List<Integer> innerlist=new ArrayList<>(); 
            for(int j=0;j<i;j++){
                if(j==0){
                    innerlist.add(1);
                }
                else{
                List<Integer> prev=outerlist.get(i-1); 
                innerlist.add(prev.get(j)+prev.get(j-1));
                }

            }
            innerlist.add(1);
            outerlist.add(innerlist);
        }
        return outerlist;
    }
}