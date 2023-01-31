
class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        int arr3[]= new int[n+m];
        
        for(int i=0; i<n ; i++)
        {
            arr3[i]=arr1[i];
        }
        for(int i=n,j=0; i<n+m; i++,j++)
        {
            arr3[i]= arr2[j];
        }
        Arrays.sort(arr3);
        long l = arr3[k-1];
        return l;
        
        
    }
}

/*
Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. The task is to find the element that would be at the k’th position of the final sorted array.

*/
