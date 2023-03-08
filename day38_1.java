// Count Increasing Subsequences
// Given an array of digits (values lie in range from 0 to 9). The task is to count all the sub sequences possible in array such that in each subsequence
//every digit is greater than its previous digits in the subsequence.


class Solution {
    
    public static long countSub(int arr[], int n)
    {
        // Your code goes here
        long ans =0;
        long[] dp = new long[n];
        Arrays.fill(dp,1);
        
        for(int i=0; i<n ; i++)
        {
            for(int j=0; j<i; j++)
            {
                if(arr[i]>arr[j])
                {
                    dp[i]+=dp[j];
                }
            }
            
            ans+= dp[i];
        }
        
        return ans;
    }
}
