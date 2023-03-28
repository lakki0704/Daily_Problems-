class Solution
{
    /*You are required to complete this method
    * ar1 : 1st array
    * ar2 : 2nd array
    */
    int maxPathSum(int ar1[], int ar2[])
    {
        // Your code here
        int m = ar1.length;
        int n = ar2.length;
        
        int i=0,j=0,sum1=0,sum2=0;
        int finall=0;
        
        while(i<m && j<n)
        {
            if(ar1[i]<ar2[j])
            {
                sum1+=ar1[i];
                i++;
            }
            else if(ar1[i]>ar2[j])
            {
                sum2+=ar2[j];
                j++;
            }
            else
            {
                finall+= Math.max(sum1,sum2)+ar1[i];
                sum1=sum2=0;
                i++;
                j++;
            }
        }
        
        while(i<m) sum1+=ar1[i++];
        while(j<n) sum2+=ar2[j++];
        
        finall+= Math.max(sum1,sum2);
        
        return finall;
        
    }
}
