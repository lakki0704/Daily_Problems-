
//Given two arrays of integers A[] and B[] of size N and M, the task is to check if a pair of values (one value from each array) exists such that swapping the elements of the pair will make the sum of two arrays equal.

 

class Solution
{
    long findSwapValues(long A[], int n, long  B[], int m)
    {
        // Your code goes here
        long sum_A=0, sum_B =0;
        HashSet<Long> a = new HashSet<>();
        
        for(int i=0; i<n; i++)
        {
            sum_A= sum_A + A[i];
            a.add(A[i]);
        }
        for(int i=0; i<m; i++)
        {
            sum_B= sum_B + B[i];
        }
        
        for(int i=0; i<m ; i++)
        {
            long x = sum_A+(2*B[i])-sum_B;
            if(x%2==0 && a.contains(x/2))
            {
                return 1;
            }
        }
        
        
        
        return -1;
    }
}
