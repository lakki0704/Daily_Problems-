/*
Given a matrix of size n x m, where every row and column is sorted in increasing order, and a number x. Find whether element x is present in the matrix or not.

*/

class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int a[][], int n, int m, int x) 
	{  
	    // code here 
	    
	    for(int i=0; i<n ; i++)
	    {
	        if(a[i][m-1]>=x && a[i][0]<=x)
	        {
	           // if(a[i][m-1]==x || a[i][0] ==x)
	           // {
	           //     return true;
	           // }
	            for(int j=0; j<m; j++)
	            {
	                if(a[i][j]==x)
	                {
	                    return true;
	                }
	            }
	            
	        }
	    }
	    
	    return false;
	    
	} 
} 
