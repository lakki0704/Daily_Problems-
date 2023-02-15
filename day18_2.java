//Given a sorted array arr[] of size N without duplicates, and given a value x. 
//Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x.
//Find the index of K(0-based indexing).

class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        long max = -1;
        
        int low =0;
        int high =n-1;
        
        while(low<=high)
        {
            int mid = (low+high)/2;
            
            if(arr[mid]<x)
            {
                low =mid+1;
            }
            else if(arr[mid]>x)
            {
                high =mid-1;
            }
            else
            {
                return mid;
            }
            
        }
        
        if(high<0 || low>n)
        {
            return -1;
        }
        
        return low-1;
        
        
    }
    
}
