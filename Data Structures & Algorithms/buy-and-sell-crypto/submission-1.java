class Solution {
    public int maxProfit(int[] prices){
        int sub = prices[0];
        int max = 0;
        for (int right = 1; right < prices.length; right++){
            int profit = prices[right] - sub;
            if (profit <= 0) {
                sub = prices[right];
            }
            max = Math.max(max, profit);
        }
        return max;
    }
}