class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max =0;
        for(int i=1;i<prices.length;i++)
        {
            int res = prices[i]-min;
            min = Math.min(min,prices[i]);
            max = Math.max(max,res);
        }
        return max;
    }
}