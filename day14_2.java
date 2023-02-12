class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int m[][], int n) 
    { 
        // code here
        for(int i=0; i<n; i++)
        {
            for(int j = i; j<n ; j++)
            {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
        
        
        int i =0;
        boolean[] idx = new boolean[n];
        
        while(i<n)
        {
            if(idx[i]==false){
            for(int j=0; j<n; j++)
            {
                
                int temp = m[i][j];
                m[i][j] = m[n-1-i][j];
                m[n-1-i][j] = temp;
                idx[n-1-i] = true;
                }
            }
            i++;
        }
    }
}
