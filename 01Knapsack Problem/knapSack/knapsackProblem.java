class knapsackProblem{
   static int[][] dp = new int[102][1024];
    public static int memset(int[] wt, int[] val, int W, int n){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                dp[i][j]=-1;
            }
        }
        return knapsack(wt, val, W, n,dp);
    }
    public static int knapsack(int[] wt, int[] val, int W, int n, int[][] dp){
        if(n==0 || W==0) return 0;
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        if(wt[n-1]>W){
            return dp[n][W]=knapsack(wt, val, W, n-1,dp);
        }
         return  dp[n][W]=Math.max(val[n-1]+knapsack(wt, val, W-wt[n-1], n-1,dp), knapsack(wt, val, W, n-1,dp));

    }
    public static void main(String[] args) {
        int[] wt = {2,5,8,3};
        int[] val = {10,6,12,7};
        int n= wt.length;
        int W=10;
        int result = memset(wt, val, W, n);
        System.out.println("Max Price: "+ result);
    }
}