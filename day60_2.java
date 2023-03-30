class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here 
        
        int min =Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++)
        {
            int sum =0;
            for(int j=i;j<n; j++)
            {
                sum+=a[j];
                if(sum>x)
                {
                    int u= j-i+1;
                    min= Math.min(u,min);
                    break;
                }
            }
        }
        
        return min;
    }
}
