class Solution
{
    long numberOfPaths(int m, int n)
    {
        // code here
        int mod = 1000000007;
        int[][] dp = new int[m][n];
        
        for(int i=0; i<m; i++)
        {
            dp[i][0]=1;
        }
        for(int i=0; i<n; i++)
        {
            dp[0][i]=1;
        }
        
        
        for(int i=1; i<m; i++)
        {
            for(int j=1; j<n; j++)
            {
                dp[i][j]= ((dp[i-1][j]%mod)+(dp[i][j-1]%mod))%mod;
            }
        }
        
        return (dp[m-1][n-1])%mod;
    }
}
