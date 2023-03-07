class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        
        // your code here
        if(n==1)
        {
            return 1;
        }
        
        if(n==2)
        {
            return 2;
        }
        
        int[][] dp = new int[n+1][3];
        int mod = 1000000007;
        
        for(int i=0; i<n+1; i++)
        {
            dp[i][0]=0;
        }
        
        for(int i=0; i<3; i++)
        {
            dp[0][i]=0;
        }
        
        dp[1][1]=1;
        dp[1][2]=0;
        
        dp[2][1]=1;
        dp[2][2]=1;
        
        int sum = 2;
        
        for(int i=3; i<=n; i++)
        {
            dp[i][1]= (dp[i-1][2])%mod;
            dp[i][2]= (dp[i-1][1]+dp[i-1][2])%mod;
            
            sum = (dp[i][1]+dp[i][2])%mod;
        }
        
        
        return sum;
        
    }
}

