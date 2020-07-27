class Solution {
    public int maxProfit(int[] prices) 
    {
        int minimum_price = Integer.MAX_VALUE;
        int maximum_profit = 0;
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < minimum_price)
                minimum_price = prices[i];
            else if(prices[i] - minimum_price > maximum_profit)
                maximum_profit = prices[i] - minimum_price;
        }
        return maximum_profit;
    }
}
