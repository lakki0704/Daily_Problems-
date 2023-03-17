//User function Template for Java

class Solution{
	long no_of_subarrays(int N, int [] arr) {
		//Write your code here
		
		long zero = 0;
		int[] dp = new int[N];
		
		for(int i=0; i<N; i++)
		{
		    if(arr[i]==0)
		    {
		        dp[i]=1;
		    }
		    else
		    {
		        dp[i]=0;
		    }
		}
		
		//int sum =0;
		
		if(dp[0]==1)
		{
		    zero=1;
		}
		
		for(int i=1; i<N; i++)
		{
		    if(dp[i]!=0)
		    {
		        dp[i]= dp[i]+ dp[i-1];
		        zero = zero + dp[i];
		    }
		}
		
		return zero;
		
	}
}
