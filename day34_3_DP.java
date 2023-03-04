class Solution{

	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	    int[] dp = new int[V+1];
	    Arrays.fill(dp,-1);
	    
	    dp[0]=0;
	    
	    
	    int answer =   coin(coins,M,V,dp);
	    if(answer==Integer.MAX_VALUE)
	    {
	        return -1;
	    }
	    return answer;
	    
	    
	} 
	
	static int coin(int coins[], int M, int V, int dp[])
	{
	    int ans = Integer.MAX_VALUE;
	    
	    
	    for(int i=0; i<M ; i++)
	    {
	        if(V-coins[i]>=0)
	        {
	            int subans =0;
	            if(dp[V-coins[i]]!=-1)
	            {
	                subans = dp[V-coins[i]];
	            }
	            else
	            {
	                subans = coin(coins, M, V-coins[i], dp);
	            }
	            if(subans!=Integer.MAX_VALUE && subans+1<ans)
	            {
	                ans = subans+1;
	            }
	            
	        }
	    }
	    
	   return  dp[V]= ans;
	    
	}
}
