//Given a binary matrix your task is to find all unique rows of the given matrix.

// Example 1:

// Input:
// row = 3, col = 4 
// M[][] = {{1 1 0 1},{1 0 0 1},{1 1 0 1}}
// Output: 1 1 0 1 $1 0 0 1 $
// Explanation: Above the matrix of size 3x4
// looks like
// 1 1 0 1
// 1 0 0 1
// 1 1 0 1
// The two unique rows are 1 1 0 1 and
// 1 0 0 1 .


class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i<r; i++)
        
        {
            ArrayList<Integer> ad = new ArrayList<>();
            for(int j=0; j<c; j++)
            {
               
                ad.add(a[i][j]);
            }
            
            if(!ans.contains(ad))
            {
                ans.add(ad);
            }
        }
        
        return ans;
    }
}
