class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

         if(n==1)
         {
           return 1;
         }

         if(n==2)
        {
            return -1;
         }

        int eq=-1;
        long sum = 0;
        for(int i=0; i< n ; i++)
        {
            sum=sum+arr[i];
        }
        
        long curr= arr[0];
        for(int i=1; i<n;i++)
        {
            if(curr == sum-curr-arr[i])
            {
                eq=i;
            }
            
            curr = curr+arr[i];
        }
        
        if(eq!=-1)
        {
            return eq+1;
        }
        else
        {
            return eq;
        }
    }
}


/*

Given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
*/
