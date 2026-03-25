class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] a = new int[n];
        a[0] = prices[0];
        int ans =0;
        for(int i=1;i<n;i++){
            a[i]= Math.min(prices[i],a[i-1]);
            ans = Math.max(ans,prices[i]-a[i]);
        }
        return ans;
    }
}