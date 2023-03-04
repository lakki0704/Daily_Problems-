class GfG
{
	public static int minSum(int a[], int n)
        {
           //add code here.
           
           int ans =0;
           if(n==1)
           {
               return a[0];
           }
           
           if(n==2)
           {
               return Math.min(a[0],a[1]);
           }
           
           if(n==3)
           {
               return Math.min(a[2],Math.min(a[0],a[1]) );
           }
           
           if(n==4)
           {
               return Math.min(a[3], Math.min(a[2],Math.min(a[0],a[1])));
           }
           
           
           else
           {
               int[] dp = new int[n];
               for(int i=0; i<4; i++)
               {
                   dp[i]=a[i];
               }
               
               for(int i=4; i<n; i++)
               {
                   dp[i] = a[i]+ Math.min(dp[i-4], Math.min(dp[i-3],Math.min(dp[i-2],dp[i-1])));
               }
               
               ans = Math.min(dp[n-4], Math.min(dp[n-3],Math.min(dp[n-2],dp[n-1])));
           }
           
           return ans;
    }
}
