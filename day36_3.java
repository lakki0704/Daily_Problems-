class Solution
{
    //Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b) 
    {
        //Your code here
        
        int[][] dp = new int[a+1][b+1];
        for(int i=0; i<=a; i++)
        {
            dp[i][0]=0;
        }
        for(int i=0; i<=b; i++)
        {
            dp[0][i]=0;
        }
        
        for(int i=0; i<a; i++)
        {
            for(int j =0; j<b; j++)
            {
                if(i==0 && j==0)
                {
                    dp[i+1][j+1]=1;
                }
                
                else
                {
                    dp[i+1][j+1]= dp[i][j+1]+dp[i+1][j];
                }
            }
        }
        
        return dp[a][b];
    }
}
