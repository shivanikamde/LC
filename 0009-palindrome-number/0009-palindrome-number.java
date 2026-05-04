class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else if(reverse(x)==x){
            return true;
        }
        else{
            return false;
        }
    }
    public int reverse(int x){ 
        int revnum=0;
        while(x!=0){
            int lastdig=x%10;
            revnum=revnum*10+lastdig;
            x=x/10;           
        }
        return revnum;
    }
}