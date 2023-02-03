class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            arr[i]= nums[i];
        }
        
        Arrays.sort(arr);
        int count=0; int temp; int index;
        
        
        for(int i=0; i<arr.length; i++)
        {
            if(nums[i]!=arr[i])
            {
                count++;
                temp = nums[i];
                index= findIndex(nums,arr[i]) ;
                nums[i] = nums[index];
                nums[index] = temp;
                
            }
        }
        return count;
        
    }
    
    public int findIndex(int arr[], int t)
    {
        int len = arr.length;
        int i = 0;
        while (i < len) {
 
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }


}

//minimum swaps to sort the array
