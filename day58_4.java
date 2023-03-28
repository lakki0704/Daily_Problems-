class Solution { 
    long smallestpositive(long[] arr, int n){ 
        // Your code goes here 
        Arrays.sort(arr);
        long ans =1;
        //long sum = arr[0];
        
        for(int i=0; i<n; i++)
        {
            if(ans<arr[i])
            {
                return ans;
            }
            else
            {
                ans+=arr[i];
            }
        }
        
        return ans;
        
    }
} 
