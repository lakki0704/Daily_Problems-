
class Solution
{
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
       //Your code here
       int[] dp = new int[n+1];
       Arrays.fill(dp,-1);
       
       int ans = cutmax(n,x,y,z,dp);
       
       if(ans<0)
       {
           return 0;
       }
       
       return ans;
    }
    
    static int cutmax(int n, int x, int y, int z, int[] dp)
    {
        if(n==0)
        {
            return 0;
        }
        if(n<0) return 0;
    
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        
        int ans1 =Integer.MIN_VALUE, ans2=Integer.MIN_VALUE, ans3=Integer.MIN_VALUE;
        
        if(n-x>=0)
        {
            ans1 = cutmax(n-x,x,y,z,dp);
        }
        if(n-y>=0)
        {
             ans2 = cutmax(n-y,x,y,z,dp);
        }
        if(n-z>=0)
        {
             ans3 = cutmax(n-z,x,y,z,dp);
        }
        
        return dp[n]=1+Math.max(ans1, Math.max(ans2,ans3));
    }
}
