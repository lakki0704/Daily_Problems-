//User function Template for Java

class Solution{
    public int saveFlowers(int n, int a[], String s){
        // Code Here.
        int sum=0, ans=0;
        int min = Integer.MAX_VALUE;
        int flag=0;
        
        for(int i=n-1; i>=0; i--)
        {
            if(s.charAt(i)=='1')
            {
                sum+=a[i];
                min = Math.min(min,a[i]);
                flag=1;
            }
            else
            {
                if(flag==1)
                {
                    sum+=a[i];
                    min = Math.min(min,a[i]);
                    ans+= sum-min;
                    flag=0;
                    min = Integer.MAX_VALUE;
                    sum =0;
                }
            }
            
           
        }
        
         if(flag==1)
            {
                ans = ans + sum ;
            }
            
        
        
        return ans;
    }

}
