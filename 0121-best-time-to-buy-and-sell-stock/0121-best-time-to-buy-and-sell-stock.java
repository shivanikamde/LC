class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxi=0;
        int profit=0;
        int maxprofit=0;
        int size=prices.length;

        for(int i=0;i<size;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                // maxi=prices[i];
                profit=prices[i]-min;
                if(profit>maxprofit){
                    maxprofit=profit;
                }
            }
        }
        return maxprofit;
}
}