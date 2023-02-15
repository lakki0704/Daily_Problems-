class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        
        for(int i=0; i<n-1; i++)
         
        {
            boolean swap =false;
            for(int j=0; j<n-1-i; j++)
            {
                if(arr[j+1]<arr[j])
                {
                    swap = true;
                    swap(arr, j+1 , j);
                }
            }
            if(!swap)
            {
                break;
            }
        }
    }
    
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
