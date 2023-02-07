class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
    
        int curr=0;
        int max =Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            curr = curr+arr[i];
            if(curr>max)
            {
                max=curr;
            }
            if(curr<0)
            {
                curr=0;
            }
        }
        
        return max;
        
    }
    
}

