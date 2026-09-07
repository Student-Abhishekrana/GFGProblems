class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=val.length;
        int[][] dp =new int[n+1][W+1];
        int m =dp[0].length;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=W; j++){
                
                int curr_val =val[i-1];
                int curr_weight = wt[i-1];
                
                if(curr_weight <= j){
                    //2 options
                    // 1> include
                    int inc =curr_val +dp[i-1][j-curr_weight];
                    //2 > exclude
                    int exc =dp[i-1][j];
                    
                    dp[i][j] =Math.max(inc,exc);
                }else{
                    dp[i][j] =dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
}
