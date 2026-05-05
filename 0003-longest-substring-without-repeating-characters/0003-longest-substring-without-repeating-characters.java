class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int maxLen=0;
        int n=s.length();
        
        int Hashlen=256;
        int Hash[]=new int[Hashlen];

        Arrays.fill(Hash,-1);
        while(right<n){
            if(Hash[s.charAt(right)]>=left){
                left=Math.max(left,Hash[s.charAt(right)]+1);
            }
            int len=right-left+1;
            maxLen=Math.max(len,maxLen);
            Hash[s.charAt(right)]=right;
            right++;
        }
        return maxLen;
    }
}