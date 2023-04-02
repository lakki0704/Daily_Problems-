class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        // your code here
        for(int i=0; i<N; i++)
        {
            int low = 0;
            int high = M-1;
            
            while(low<=high)
            {
                int mid = (low+high)/2;
                if(mat[i][mid]>X)
                {
                    high = mid-1;
                }
                else if(mat[i][mid]<X)
                {
                    low = mid+1;
                }
                else
                {
                    return 1;
                }
            }
        }
        
        return 0;
    }
}
