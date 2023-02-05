//smallest positive missing number 


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
