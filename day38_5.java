class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int m[][], int r, int c)
    {
        // code here 
        int count =0, total= r*c;
        ArrayList<Integer> a = new ArrayList<>();
        
        int start_r =0, start_c=0;
        int end_r = r-1, end_c= c-1;
        
        while(count<total)
        {
            for(int i=start_c; i<=end_c && count<total ; i++)
            {
                a.add(m[start_r][i]);
                count++;
            }
            start_r++;
            
            for(int i=start_r; i<=end_r && count<total ; i++)
            {
                a.add(m[i][end_c]);
                count++;
            }
            
            end_c--;
            
            for(int i= end_c; i>=start_c && count<total; i--)
            {
                a.add(m[end_r][i]);
                count++;
            }
            
            end_r--;
            
            for(int i= end_r; i>=start_r && count<total; i--)
            {
                a.add(m[i][start_c]);
                count++;
            }
            
            start_c++;
            
        }
        
        return a;
    }
}
