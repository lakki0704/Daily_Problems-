class Solution
{
    //Function to find the nth catalan number.
    public static BigInteger findCatalan(int n)
    {
        //Your code here
        BigInteger[] dp = new BigInteger[n+1];
        BigInteger bg = new BigInteger("1");
        BigInteger bg1 = new BigInteger("0");
        
        dp[0]= bg;
        dp[1]= bg;
        
        for(int i=2; i<=n; i++)
        {
            dp[i]= bg1;
            for(int j=0; j<i; j++)
            {
                dp[i]= dp[i].add(dp[j].multiply(dp[i-j-1]));
            }
        }
        
        return dp[n];
    }
}
