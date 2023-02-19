/*
Given a N x N matrix, where every row and column is sorted in non-decreasing order. Find the kth smallest element in the matrix.
*/


class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        //code here.
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                ans.add(mat[i][j]);
            }
        }
        Collections.sort(ans);
        
        return ans.get(k-1);
    }
}
