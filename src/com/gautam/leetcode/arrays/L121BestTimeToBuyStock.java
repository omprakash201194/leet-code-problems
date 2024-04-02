package com.gautam.leetcode.arrays;

public class L121BestTimeToBuyStock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
            }
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}
