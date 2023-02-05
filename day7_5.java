class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        if(size==0)
        {
            return 0;
        }
        
        if(size==1)
        {
            if(arr[0]<=0)
            {
                return 1;
            }
            else if(arr[0]==1)
            {
                return 2;
            }
            else
            {
                return 1;
            }
        }
        
        
        Arrays.sort(arr);
        int count=0;
        
        for(int i=0; i<size; i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
        }
        if(count==0)
        {
            return 1;
        }
        
        for(int i=0; i<size-1; i++)
        {
            if(arr[i]>0)
            {
                if(arr[i+1]!=arr[i]+1)
                {
                    return arr[i]+1;
                }
            }
            }
        
        
        return arr[size-1]+1;
    }
}


/*

Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

Example 1:

Input: 
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}}
Output: 2
Explanation: Row 2 contains 4 1's (0-based
indexing).

*/
