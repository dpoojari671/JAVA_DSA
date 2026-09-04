class Solution {
    public int maxProfit(int[] prices) {
        int mp=0;
        int bestbuy=prices[0];
        for(int i =1; i<=prices.length-1; i++)
        {
            if(prices[i]>bestbuy)
            {
               mp=Math.max(mp,prices[i]-bestbuy); 
            }
            bestbuy=Math.min(bestbuy,prices[i]);
            
        }
        return mp;
    }
}