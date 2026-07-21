class Solution {
	public int maxProfit(int[] prices) {
		// code here
		int profit = 0;
		
		int i = 1;
		
		int maxProfit =0;
		while (i<prices.length) {
			
			if (prices[i] > prices[i-1]) {
				
				
				profit += prices[i]-prices[i-1];
			}
			
			
		
			i++;
		}
		
		return profit;
	}
}
