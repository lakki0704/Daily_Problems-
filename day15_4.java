



//Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.
//User function Template for Java

class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        
        int index = -1;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<N; i++)
        {
            int ones =0;
            for(int j=0; j<M; j++)
            {
                if(Mat[i][j]==1)
                {
                    ones++;
                }
            }
            
            map.put(i,ones);
        }
        
        int count =-1;
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue()>count)
            {
                count = entry.getValue();
            }
        }
        
        for(int i=0; i<N ; i++)
        {
            if(map.get(i)==count)
            {
                return i;
            }
        }
        
        return index;
    }
}
