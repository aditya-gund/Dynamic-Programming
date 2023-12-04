class Test{
/*
 // https://leetcode.com/problems/climbing-stairs/description
{Problem Statement:
    You are climbing a staircase.It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many 
    distinct ways can you climb to the top?
}
Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps        
*/
    
    public static int climbStairs(int n){
        int[] dp = new int[n+1];
        if(n==0 || n==1) return 1;
        dp[0]=1;
        dp[1]=1;
        if(dp[n]!=0){
            return dp[n];
        }
        for(int i=2;i<n+1;i++){
             dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println("Total Steps: " +climbStairs(45));
    }

}