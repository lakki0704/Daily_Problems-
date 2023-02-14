/*

Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.

Example 1:

Input:
n = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1, 
second max = 5, second min = 2, and 
so on... Modified array is : 6 1 5 2 4 3.

*/


class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        long[] sub = new long[n];
        int k=0,l=1;
        for(int i=0; i<n ;i++)
        {
            if(i%2==0)
            {
                sub[i] = arr[n-1-k];
                k++;
            }
            else
            {
                sub[i] = arr[i-l];
                l++;
            }
        }
        
        for(int i=0; i<n;i++)
        {
            arr[i] = sub[i];
        }
        
    }
    
}


