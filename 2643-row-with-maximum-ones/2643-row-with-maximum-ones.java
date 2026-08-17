class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int maxonecount=0;
        int index=0;

        for(int i=0;i<rows;i++){
            Arrays.sort(mat[i]);
        }

        for(int i=0;i<rows;i++){
        int start=0;
        int end=cols-1;
        int onecount=0;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(mat[i][mid]==0){
                start=mid+1;
            }
            else{
                onecount=cols-mid;
                end=mid-1;
            }
        }
        if(onecount>maxonecount){
            maxonecount=onecount;
            index=i;
        }
        }
        return new int[]{index,maxonecount};
    }
}