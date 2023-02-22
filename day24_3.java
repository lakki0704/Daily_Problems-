
class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        
        long mul_0 =1;
        long mul = 1;
        int count_zero=0;
        long[] ans = new long[n];
        
        for(int i=0; i<n; i++)
        {
            if(nums[i]!=0){
            mul_0 =mul_0 * (long)nums[i];}
            
            else
            {
                mul=0;
                count_zero++;
            }
        }
        
        if(count_zero>1)
        {
            return ans;
        }
        
        for(int i=0; i<n ; i++)
        {
            if(nums[i]!=0 && mul==1)
            {
                ans[i] = mul_0 /(long)nums[i];
            }
            else if(mul==0 && nums[i]!=0)
            {
                ans[i] = 0;
            }
            else if(mul ==0 && nums[i]==0)
            {
                ans[i] = mul_0;
            }
        }
        
        return ans;
	} 
	
} 
