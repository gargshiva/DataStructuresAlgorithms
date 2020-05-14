package com.gargshiva.leetcode.array;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * <p>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * <p>
 * Note that you cannot sell a stock before you buy one.
 * <p>
 * Example 1:
 * <p>
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 * <p>
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class BuySell {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxPrice = prices[prices.length - 1];
        int maxProfit = 0;

        for (int endIndex = prices.length - 2; endIndex >= 0; --endIndex) {
            int price = prices[endIndex];
            int profit = maxPrice - price;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (price > maxPrice) {
                maxPrice = price;
            }
        }

        return maxProfit;

    }
}
