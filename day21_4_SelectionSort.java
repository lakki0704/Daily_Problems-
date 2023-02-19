class Solution
{
	void  swap(int arr[], int j, int min)
	{
        // code here such that selectionSort() sorts arr[]
        int temp = arr[j];
        arr[j]=arr[min];
        arr[min]=temp;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0; i<n-1; i++)
	    {
	        int min =i;
	        for(int j=i+1; j<n; j++)
	        {
	            if(arr[j]<arr[min])
	            {
	                min =j;
	            }
	        }
	        if(min!=i)
	        {
	            swap(arr,i,min);
	        }
	    }
	}
}
