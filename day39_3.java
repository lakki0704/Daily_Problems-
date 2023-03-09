class Solution{
    static int maximumPath(int N, int M[][])
    {
        // code here
        
        for(int i=1; i<N; i++)
        {
            for(int j=0; j<N; j++)
            {
                if(j>0 && j<N-1)
                {
                    M[i][j]+= Math.max(Math.max(M[i-1][j], M[i-1][j+1]), M[i-1][j-1]);
                }
                
                else if(j==0)
                {
                    M[i][j]+= Math.max(M[i-1][j], M[i-1][j+1]);
                }
                
                else if(j==N-1)
                {
                    M[i][j]+= Math.max(M[i-1][j], M[i-1][j-1]);
                }
            }
        }
        
        int final1 =0;
        
        for(int i=0; i<N; i++)
        {
            if(M[N-1][i]>final1)
            {
                final1= M[N-1][i];
            }
        }
        
        return final1;
    }
}
