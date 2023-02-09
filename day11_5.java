class Solution {
    int findMaxSum(int arr[], int n) {
        
        
        // code here
        
        int max1=0;
        int max2=0;
        
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                max2 = Math.max(max1, max2);
                max1 = max1+arr[i];
               
            }
            else
            {
                max1 =Math.max(max1,max2);
                max2= max2+arr[i];
                
            }
        }
        
        return Math.max(max1,max2);
    }
}
