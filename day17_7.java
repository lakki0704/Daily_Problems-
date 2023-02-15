//binary search

// User function Template for Java

class Solution {
    int binarysearch(int a[], int n, int k) {
        // code here
        int low =0, high =n-1;
        
        while(low<=high)
        {
            int mid =(low+high)/2;
            
            if(a[mid]==k)
            {
                return mid;
            }
            
            else if(a[mid]>k)
            {
                high = mid-1;
            }
            
            else
            {
                low = mid+1;
            }
        }
        
        return -1;
        
    }
}
