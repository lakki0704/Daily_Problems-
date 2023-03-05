//User function Template for Java

class Solution{
    public int niceSubarray(int a[], int n){
        // Code Here.
        
        int d = 1;
        int count = 0;
        int f_count =0;
        
        for(int i=0; i<n ; i++)
        {
            if(a[i]==d)
            {
                count++;
                d++;
                f_count = Math.max(f_count, count);
            }
            else
            {
                d= 1;
                count = 0;
            }
        }
        
        return f_count ;
    }
}
