//quick sort

class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high)
        {
            int pivot = partition(arr,low,high);
            
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
        
        
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[low];
        int i=low,j=high;
        
        while(i<j)
        {
            while(i<high && arr[i]<=pivot)i++;
            while(j>=0 && arr[j]>pivot)j--;
            if(i<j)
            {
               // swap(arr,i,j);
               int temp =arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
        }
        
        //swap(arr, j, l);
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        
        return j;
    } 
}
