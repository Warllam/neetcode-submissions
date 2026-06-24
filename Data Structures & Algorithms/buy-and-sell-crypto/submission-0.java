class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minimum = Integer.MAX_VALUE;
        for(int price : prices){
            int profit = 0;
            if(price < minimum){
                minimum = price;
            }else{
                profit = price - minimum;
            }

            if(profit > maxProfit) maxProfit = profit;
        }
    
        return maxProfit;
    }
}
