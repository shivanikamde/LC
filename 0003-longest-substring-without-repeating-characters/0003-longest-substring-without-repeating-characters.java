class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n=s.length();
        int Hashlen=256;
        int Hash[]=new int[Hashlen];

        Arrays.fill(Hash,-1);

        int left=0,right=0,maxLen=0;

        while(right<n){
            if(Hash[s.charAt(right)]>=left){
                left=Math.max(Hash[s.charAt(right)]+1, left);
            }

            int len=right-left+1;
            maxLen=Math.max(len,maxLen);

            Hash[s.charAt(right)]=right;
            right++;
        }
        return maxLen;
    }
}