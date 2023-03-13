

class Solution 
{ 
    long maxPossibleValue(int N, int A[] ,int B[]) { 
        // code here
        
        long sum =0;
        int min= Integer.MAX_VALUE;
        
        for(int i=0; i<N; i++)
        {
            if(B[i]>=4)
            {
                sum+= (B[i]/4)*A[i]*4;
                B[i] =B[i]%4;
                min = Math.min(min, A[i]);
            }
            
        }
        
        int count=0;
        
        
        for(int i=0; i<N; i++)
        {
            if(B[i]>=2)
            {
                count++;
                sum+= A[i]*2;
                min = Math.min(min, A[i]);
            }
        }
        
        if(count%2!=0)
        {
            sum = sum - min*2;
        }
        
        return sum;
    }
} 
