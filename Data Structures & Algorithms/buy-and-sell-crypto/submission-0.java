class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int max = 0;
        for(int i = 0 ; i < prices.length;i++){
            for(int j = i+1;j<prices.length;j++){
                sum = prices[j]- prices[i];
                max = Math.max(sum,max);
            }
        }
        return max;
    }
}
