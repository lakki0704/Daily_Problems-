

class Solution
{
    public static int ways(int n, int m)
    {
        // complete the function
        
        int[][] dp = new int[n+1][m+1];
        int mod=1000000007;
        
        for(int i=n; i>=0; i--)
        {
            dp[i][m]=1;
        }
        for(int i=m; i>=0; i--)
        {
            dp[n][i]=1;
        }
        
        
        for(int i=n-1; i>=0; i--)
        {
            for(int j=m-1; j>=0; j--)
            {
                dp[i][j] = (dp[i+1][j]+dp[i][j+1])%mod;
            }
        }
        
        return (dp[0][0])%mod;
        
        
    }
}
